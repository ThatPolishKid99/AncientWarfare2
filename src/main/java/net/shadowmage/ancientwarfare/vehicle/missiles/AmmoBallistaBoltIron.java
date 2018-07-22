package net.shadowmage.ancientwarfare.vehicle.missiles;

import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.math.RayTraceResult;
import net.minecraft.world.World;
import net.shadowmage.ancientwarfare.core.AncientWarfareCore;

public class AmmoBallistaBoltIron extends Ammo {

	public AmmoBallistaBoltIron() {
		super("ammo_ballista_bolt_iron");
		this.ammoWeight = 2.f;
		this.renderScale = 0.3f;
		this.vehicleDamage = 25;
		this.entityDamage = 25;
		this.isArrow = true;
		this.isRocket = false;
		this.isPersistent = true;
		this.configName = "ballist_bolt_iron";
		this.modelTexture = new ResourceLocation(AncientWarfareCore.MOD_ID, "textures/model/vehicle/ammo/arrow_iron.png");
	}

	@Override
	public void onImpactWorld(World world, float x, float y, float z, MissileBase missile, RayTraceResult hit) {
		//noop
	}

	@Override
	public void onImpactEntity(World world, Entity ent, float x, float y, float z, MissileBase missile) {
		if (!world.isRemote) {
			ent.attackEntityFrom(DamageType.causeEntityMissileDamage(missile.shooterLiving, false, false), this.getEntityDamage());
			ent.setFire(4);
		}
	}

}
