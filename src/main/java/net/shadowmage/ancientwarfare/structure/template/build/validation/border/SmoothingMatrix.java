package net.shadowmage.ancientwarfare.structure.template.build.validation.border;

import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.init.Blocks;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.biome.Biome;
import net.shadowmage.ancientwarfare.core.util.BlockTools;
import net.shadowmage.ancientwarfare.structure.template.build.validation.border.points.PointType;
import net.shadowmage.ancientwarfare.structure.template.build.validation.border.points.SmoothingPoint;
import net.shadowmage.ancientwarfare.structure.worldgen.WorldStructureGenerator;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.function.Consumer;

public class SmoothingMatrix {
	private SmoothingPoint[][] smoothingPoints;
	private final int fullXSize;
	private final int fullZSize;
	private Map<PointType, Set<SmoothingPoint>> typePoints = new HashMap<>();
	private final BlockPos minPos;

	public SmoothingMatrix(BorderMatrix borderMatrix, BlockPos structureMinPos, int borderSize) {
		fullXSize = borderMatrix.getFullXSize();
		fullZSize = borderMatrix.getFullZSize();
		smoothingPoints = initMatrix(fullXSize, fullZSize);
		minPos = structureMinPos.add(-borderSize - 2, 0, -borderSize - 2);
	}

	Optional<SmoothingPoint> getPoint(HorizontalCoords coords) {
		return getPoint(coords.getX(), coords.getZ());
	}

	public Optional<SmoothingPoint> getPoint(int x, int z) {
		if (smoothingPoints.length == 0 || x < 0 || x >= smoothingPoints.length || z < 0 || z >= smoothingPoints[0].length) {
			return Optional.empty();
		}

		return Optional.ofNullable(smoothingPoints[x][z]);
	}

	private void printMatrix() {
		printTypes();
		printDistances();
		printHeights();
	}

	private void printHeights() {
		for (int x = 0; x < fullXSize; x++) {
			for (int z = 0; z < fullZSize; z++) {
				System.out.print(String.format("%02d", getPoint(x, z).map(point -> !point.hasSmoothedPosSet() ? 0 : point.getSmoothedPos().getY()).orElse(0)) + " ");
			}
			System.out.println();
		}
	}

	private void printDistances() {
		for (int x = 0; x < fullXSize; x++) {
			for (int z = 0; z < fullZSize; z++) {
				System.out.print(getPoint(x, z).map(point -> point.getStructureBorderDistance() == Integer.MAX_VALUE ? "00"
						: String.format("%02d", point.getStructureBorderDistance())).orElse("00") + " ");
			}
			System.out.println();
		}
	}

	private void printTypes() {
		for (int x = 0; x < fullXSize; x++) {
			for (int z = 0; z < fullZSize; z++) {
				System.out.print(getPoint(x, z).map(point -> point.getType().getAcronym()).orElse(" ") + " ");
			}
			System.out.println();
		}
	}

	public boolean isEmpty(HorizontalCoords point) {
		return !getPoint(point).isPresent();
	}

	public SmoothingPoint addPoint(int x, int z, BlockPos pos, PointType type) {
		SmoothingPoint point = new SmoothingPoint(x, z, pos, type);
		addPoint(point);
		return point;
	}

	public SmoothingPoint addPoint(int x, int z, BlockPos pos, PointType type, IBlockState state) {
		SmoothingPoint point = addPoint(x, z, pos, type);
		point.setBlockState(state);
		return point;
	}

	void addPoint(SmoothingPoint point) {
		smoothingPoints[point.getX()][point.getZ()] = point;
		addTypePoint(point.getType(), point);
	}

	private SmoothingPoint[][] initMatrix(int fullXSize, int fullZSize) {
		SmoothingPoint[][] ret = new SmoothingPoint[fullXSize][];

		for (int x = 0; x < fullXSize; x++) {
			ret[x] = new SmoothingPoint[fullZSize];
		}

		return ret;
	}

	private void addTypePoint(PointType type, SmoothingPoint point) {
		if (!typePoints.containsKey(type)) {
			typePoints.put(type, new HashSet<>());
		}
		typePoints.get(type).add(point);
	}

	public void apply(World world, Consumer<BlockPos> handleClearing) {
		typePoints.get(PointType.SMOOTHED_BORDER).forEach(point -> levelTerrain(world, point, handleClearing));
	}

	private void levelTerrain(World world, SmoothingPoint point, Consumer<BlockPos> handleClearing) {
		BlockPos originalPos = point.getWorldPos();
		BlockPos smoothedPos = point.getSmoothedPos();

		int topSolidY = WorldStructureGenerator.getTargetY(world, originalPos.getX(), originalPos.getZ(), false, originalPos.getY());
		Biome biome = world.getBiome(originalPos);
		int topNonWaterY = WorldStructureGenerator.getTargetY(world, originalPos.getX(), originalPos.getZ(), true, originalPos.getY());
		boolean seaWaterTop = false;
		if (smoothedPos.getY() <= world.getSeaLevel() && world.getBlockState(new BlockPos(smoothedPos.getX(), world.getSeaLevel() - 1, smoothedPos.getZ())).getMaterial() == Material.WATER) {
			seaWaterTop = true;
		}

		if (originalPos.getY() == smoothedPos.getY() && topSolidY == originalPos.getY() && !seaWaterTop) {
			return;
		}

		if (originalPos.getY() > smoothedPos.getY() && (!seaWaterTop || topNonWaterY > smoothedPos.getY())) {
			if (seaWaterTop) {
				BlockTools.getAllInBoxTopDown(smoothedPos, new BlockPos(smoothedPos.getX(), Math.min(topNonWaterY, world.getSeaLevel() - 1), smoothedPos.getZ()))
						.forEach(pos -> world.setBlockState(pos, Blocks.WATER.getDefaultState()));
				if (topSolidY > world.getSeaLevel()) {
					BlockTools.getAllInBoxTopDown(smoothedPos.getX(), world.getSeaLevel(), smoothedPos.getZ(), originalPos.getX(), originalPos.getY(), originalPos.getZ())
							.forEach(handleClearing);
				}
			} else {
				BlockTools.getAllInBoxTopDown(smoothedPos, originalPos).forEach(handleClearing);
			}
		}
		if (smoothedPos.getY() - topNonWaterY > 1) {
			IBlockState fillerBlock = biome.fillerBlock;
			BlockPos.getAllInBox(originalPos.getX(), topNonWaterY + 1, originalPos.getZ(), originalPos.getX(), smoothedPos.getY() - 1, originalPos.getZ())
					.forEach(pos -> world.setBlockState(pos, fillerBlock));
		}
		world.setBlockState(smoothedPos, point.getBlockState());
	}

	public BlockPos getMinPos() {
		return minPos;
	}

	public Set<SmoothingPoint> getPointsOfType(PointType type) {
		return typePoints.get(type);
	}
}
