package net.shadowmage.ancientwarfare.vehicle.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import net.shadowmage.ancientwarfare.core.util.Trig;

@SideOnly(Side.CLIENT)
public class ModelBallistaStand extends ModelBase {

	ModelRenderer baseMain;
	ModelRenderer basePillar;
	ModelRenderer pivot;
	ModelRenderer armMain;
	ModelRenderer armFront;
	ModelRenderer turretHorizontalBrace2;
	ModelRenderer turretHorizontalBrace3;
	ModelRenderer armMidBrace;
	ModelRenderer armSlotLeft;
	ModelRenderer armSlotRight;
	ModelRenderer armleftVertical3;
	ModelRenderer armLeftVertical2;
	ModelRenderer armLeftVertical1;
	ModelRenderer turretHorizontalBrace4;
	ModelRenderer leftTensionerRope;
	ModelRenderer leftTensioner;
	ModelRenderer leftTensioner2;
	ModelRenderer rightTensionerRope;
	ModelRenderer rightTensioner;
	ModelRenderer rightTensioner2;
	ModelRenderer turretHorizontalBrace1;
	ModelRenderer armRightVertical3;
	ModelRenderer armRightVertical2;
	ModelRenderer armRightVertical1;
	ModelRenderer trigger1;
	ModelRenderer trigger2;
	ModelRenderer crankAxle;
	ModelRenderer crankHandle1;
	ModelRenderer crankHandle2;
	ModelRenderer catch2;
	ModelRenderer catch1;
	ModelRenderer armRightMain;
	ModelRenderer armRightMainInner;
	ModelRenderer armRightMainInner3;
	ModelRenderer armRightMainInner2;
	ModelRenderer armRightInner;
	ModelRenderer armRightOuter;
	ModelRenderer stringRight;
	ModelRenderer armLeftMain;
	ModelRenderer armLeftMainInner;
	ModelRenderer armLeftOuter;
	ModelRenderer armLeftMainInner2;
	ModelRenderer armLeftMainInner3;
	ModelRenderer armLeftInner;
	ModelRenderer stringLeft;

	public ModelBallistaStand() {
		baseMain = new ModelRenderer(this, "baseMain");
		baseMain.setTextureOffset(0, 21);
		baseMain.setTextureSize(256, 256);
		baseMain.setRotationPoint(0.0f, 0.0f, 0.0f);
		setPieceRotation(baseMain, 0.0f, 0.0f, 0.0f);
		baseMain.addBox(-7.0f, -2.0f, -7.0f, 14, 2, 14);
		basePillar = new ModelRenderer(this, "basePillar");
		basePillar.setTextureOffset(0, 0);
		basePillar.setTextureSize(256, 256);
		basePillar.setRotationPoint(0.0f, -12.0f, 0.0f);
		setPieceRotation(basePillar, 0.0f, 0.0f, 0.0f);
		basePillar.addBox(-2.0f, 0.0f, -2.0f, 4, 10, 4);
		pivot = new ModelRenderer(this, "pivot");
		pivot.setTextureOffset(17, 0);
		pivot.setTextureSize(256, 256);
		pivot.setRotationPoint(0.0f, -2.0f, 0.0f);
		setPieceRotation(pivot, 0.0f, 0.0f, 0.0f);
		pivot.addBox(-1.0f, 0.0f, -1.0f, 2, 2, 2);
		basePillar.addChild(pivot);
		baseMain.addChild(basePillar);
		armMain = new ModelRenderer(this, "armMain");
		armMain.setTextureOffset(0, 128);
		armMain.setTextureSize(256, 256);
		armMain.setRotationPoint(0.0f, -14.0f, 0.0f);
		setPieceRotation(armMain, -6.585082E-7f, -2.3593943E-6f, 0.0f);
		armMain.addBox(-1.5f, -2.0f, -4.5f, 3, 2, 28);
		armFront = new ModelRenderer(this, "armFront");
		armFront.setTextureOffset(63, 128);
		armFront.setTextureSize(256, 256);
		armFront.setRotationPoint(-1.5f, -2.0f, -11.5f);
		setPieceRotation(armFront, 0.0f, 0.0f, 0.0f);
		armFront.addBox(0.0f, 0.0f, 0.0f, 3, 2, 4);
		armMain.addChild(armFront);
		turretHorizontalBrace2 = new ModelRenderer(this, "turretHorizontalBrace2");
		turretHorizontalBrace2.setTextureOffset(63, 135);
		turretHorizontalBrace2.setTextureSize(256, 256);
		turretHorizontalBrace2.setRotationPoint(11.0f, -1.5f, -4.5f);
		setPieceRotation(turretHorizontalBrace2, 0.0f, 0.5410521f, 0.0f);
		turretHorizontalBrace2.addBox(-13.0f, 0.0f, -3.0f, 13, 1, 3);
		armMain.addChild(turretHorizontalBrace2);
		turretHorizontalBrace3 = new ModelRenderer(this, "turretHorizontalBrace3");
		turretHorizontalBrace3.setTextureOffset(63, 140);
		turretHorizontalBrace3.setTextureSize(256, 256);
		turretHorizontalBrace3.setRotationPoint(-11.0f, -2.0f, -7.5f);
		setPieceRotation(turretHorizontalBrace3, 0.0f, 0.0f, 0.0f);
		turretHorizontalBrace3.addBox(0.0f, 0.0f, 0.0f, 22, 2, 3);
		armMain.addChild(turretHorizontalBrace3);
		armMidBrace = new ModelRenderer(this, "armMidBrace");
		armMidBrace.setTextureOffset(0, 159);
		armMidBrace.setTextureSize(256, 256);
		armMidBrace.setRotationPoint(-1.5f, -3.0f, -11.5f);
		setPieceRotation(armMidBrace, 0.0f, 0.0f, 0.0f);
		armMidBrace.addBox(0.0f, 0.0f, 0.0f, 3, 1, 35);
		armMain.addChild(armMidBrace);
		armSlotLeft = new ModelRenderer(this, "armSlotLeft");
		armSlotLeft.setTextureOffset(77, 159);
		armSlotLeft.setTextureSize(256, 256);
		armSlotLeft.setRotationPoint(0.5f, -4.0f, -11.5f);
		setPieceRotation(armSlotLeft, 0.0f, 0.0f, 0.0f);
		armSlotLeft.addBox(0.0f, 0.0f, 0.0f, 1, 1, 35);
		armMain.addChild(armSlotLeft);
		armSlotRight = new ModelRenderer(this, "armSlotRight");
		armSlotRight.setTextureOffset(77, 159);
		armSlotRight.setTextureSize(256, 256);
		armSlotRight.setRotationPoint(-1.5f, -4.0f, -11.5f);
		setPieceRotation(armSlotRight, 0.0f, 0.0f, 0.0f);
		armSlotRight.addBox(0.0f, 0.0f, 0.0f, 1, 1, 35);
		armMain.addChild(armSlotRight);
		armleftVertical3 = new ModelRenderer(this, "armleftVertical3");
		armleftVertical3.setTextureOffset(78, 128);
		armleftVertical3.setTextureSize(256, 256);
		armleftVertical3.setRotationPoint(10.0f, -3.0f, -6.0f);
		setPieceRotation(armleftVertical3, 0.0f, 0.0f, 0.0f);
		armleftVertical3.addBox(0.0f, 0.0f, 0.0f, 1, 1, 1);
		armMain.addChild(armleftVertical3);
		armLeftVertical2 = new ModelRenderer(this, "armLeftVertical2");
		armLeftVertical2.setTextureOffset(78, 128);
		armLeftVertical2.setTextureSize(256, 256);
		armLeftVertical2.setRotationPoint(10.0f, -7.0f, -6.0f);
		setPieceRotation(armLeftVertical2, 0.0f, 0.0f, 0.0f);
		armLeftVertical2.addBox(0.0f, 0.0f, 0.0f, 1, 1, 1);
		armMain.addChild(armLeftVertical2);
		armLeftVertical1 = new ModelRenderer(this, "armLeftVertical1");
		armLeftVertical1.setTextureOffset(83, 128);
		armLeftVertical1.setTextureSize(256, 256);
		armLeftVertical1.setRotationPoint(10.0f, -7.0f, -7.0f);
		setPieceRotation(armLeftVertical1, 0.0f, 0.0f, 0.0f);
		armLeftVertical1.addBox(0.0f, 0.0f, 0.0f, 1, 5, 1);
		armMain.addChild(armLeftVertical1);
		turretHorizontalBrace4 = new ModelRenderer(this, "turretHorizontalBrace4");
		turretHorizontalBrace4.setTextureOffset(63, 140);
		turretHorizontalBrace4.setTextureSize(256, 256);
		turretHorizontalBrace4.setRotationPoint(-11.0f, -9.0f, -7.5f);
		setPieceRotation(turretHorizontalBrace4, 0.0f, 0.0f, 0.0f);
		turretHorizontalBrace4.addBox(0.0f, 0.0f, 0.0f, 22, 2, 3);
		armMain.addChild(turretHorizontalBrace4);
		leftTensionerRope = new ModelRenderer(this, "leftTensionerRope");
		leftTensionerRope.setTextureOffset(114, 128);
		leftTensionerRope.setTextureSize(256, 256);
		leftTensionerRope.setRotationPoint(5.5f, -7.0f, -6.0f);
		setPieceRotation(leftTensionerRope, 0.0f, 0.0f, 0.0f);
		leftTensionerRope.addBox(-0.5f, -3.0f, -0.5f, 1, 11, 1);
		leftTensioner = new ModelRenderer(this, "leftTensioner");
		leftTensioner.setTextureOffset(88, 128);
		leftTensioner.setTextureSize(256, 256);
		leftTensioner.setRotationPoint(0.0f, -3.0f, 0.0f);
		setPieceRotation(leftTensioner, 0.0f, 0.0f, 0.0f);
		leftTensioner.addBox(-1.0f, -0.5f, -0.5f, 2, 1, 1);
		leftTensionerRope.addChild(leftTensioner);
		leftTensioner2 = new ModelRenderer(this, "leftTensioner2");
		leftTensioner2.setTextureOffset(88, 131);
		leftTensioner2.setTextureSize(256, 256);
		leftTensioner2.setRotationPoint(0.0f, -3.0f, -0.0f);
		setPieceRotation(leftTensioner2, 0.0f, 0.0f, 0.0f);
		leftTensioner2.addBox(-0.5f, -0.5f, -1.0f, 1, 1, 2);
		leftTensionerRope.addChild(leftTensioner2);
		armMain.addChild(leftTensionerRope);
		rightTensionerRope = new ModelRenderer(this, "rightTensionerRope");
		rightTensionerRope.setTextureOffset(114, 128);
		rightTensionerRope.setTextureSize(256, 256);
		rightTensionerRope.setRotationPoint(-5.5f, -7.0f, -6.0f);
		setPieceRotation(rightTensionerRope, 0.0f, 0.0f, 0.0f);
		rightTensionerRope.addBox(-0.5f, -3.0f, -0.5f, 1, 11, 1);
		rightTensioner = new ModelRenderer(this, "rightTensioner");
		rightTensioner.setTextureOffset(88, 128);
		rightTensioner.setTextureSize(256, 256);
		rightTensioner.setRotationPoint(0.0f, -3.0f, 0.0f);
		setPieceRotation(rightTensioner, 0.0f, 0.0f, 0.0f);
		rightTensioner.addBox(-1.0f, -0.5f, -0.5f, 2, 1, 1);
		rightTensionerRope.addChild(rightTensioner);
		rightTensioner2 = new ModelRenderer(this, "rightTensioner2");
		rightTensioner2.setTextureOffset(88, 131);
		rightTensioner2.setTextureSize(256, 256);
		rightTensioner2.setRotationPoint(0.0f, -3.0f, 0.0f);
		setPieceRotation(rightTensioner2, 0.0f, 0.0f, 0.0f);
		rightTensioner2.addBox(-0.5f, -0.5f, -1.0f, 1, 1, 2);
		rightTensionerRope.addChild(rightTensioner2);
		armMain.addChild(rightTensionerRope);
		turretHorizontalBrace1 = new ModelRenderer(this, "turretHorizontalBrace1");
		turretHorizontalBrace1.setTextureOffset(63, 135);
		turretHorizontalBrace1.setTextureSize(256, 256);
		turretHorizontalBrace1.setRotationPoint(-11.0f, -1.5f, -4.5f);
		setPieceRotation(turretHorizontalBrace1, 0.0f, -0.5410521f, 0.0f);
		turretHorizontalBrace1.addBox(0.0f, 0.0f, -3.0f, 13, 1, 3);
		armMain.addChild(turretHorizontalBrace1);
		armRightVertical3 = new ModelRenderer(this, "armRightVertical3");
		armRightVertical3.setTextureOffset(78, 128);
		armRightVertical3.setTextureSize(256, 256);
		armRightVertical3.setRotationPoint(-11.0f, -3.0f, -6.0f);
		setPieceRotation(armRightVertical3, 0.0f, 0.0f, 0.0f);
		armRightVertical3.addBox(0.0f, 0.0f, 0.0f, 1, 1, 1);
		armMain.addChild(armRightVertical3);
		armRightVertical2 = new ModelRenderer(this, "armRightVertical2");
		armRightVertical2.setTextureOffset(78, 128);
		armRightVertical2.setTextureSize(256, 256);
		armRightVertical2.setRotationPoint(-11.0f, -7.0f, -6.0f);
		setPieceRotation(armRightVertical2, 0.0f, 0.0f, 0.0f);
		armRightVertical2.addBox(0.0f, 0.0f, 0.0f, 1, 1, 1);
		armMain.addChild(armRightVertical2);
		armRightVertical1 = new ModelRenderer(this, "armRightVertical1");
		armRightVertical1.setTextureOffset(83, 128);
		armRightVertical1.setTextureSize(256, 256);
		armRightVertical1.setRotationPoint(-11.0f, -7.0f, -7.0f);
		setPieceRotation(armRightVertical1, 0.0f, 0.0f, 0.0f);
		armRightVertical1.addBox(0.0f, 0.0f, 0.0f, 1, 5, 1);
		armMain.addChild(armRightVertical1);
		trigger1 = new ModelRenderer(this, "trigger1");
		trigger1.setTextureOffset(63, 146);
		trigger1.setTextureSize(256, 256);
		trigger1.setRotationPoint(-0.0f, -1.0f, 17.5f);
		setPieceRotation(trigger1, -1.256629f, 0.0f, 0.0f);
		trigger1.addBox(-0.5f, -1.0f, 0.0f, 1, 1, 5);
		trigger2 = new ModelRenderer(this, "trigger2");
		trigger2.setTextureOffset(76, 146);
		trigger2.setTextureSize(256, 256);
		trigger2.setRotationPoint(0.0f, 0.0f, 0.0f);
		setPieceRotation(trigger2, 1.2217292f, 1.934953E-7f, 3.1625038E-7f);
		trigger2.addBox(-0.5f, -4.0f, 0.0f, 1, 4, 1);
		trigger1.addChild(trigger2);
		armMain.addChild(trigger1);
		crankAxle = new ModelRenderer(this, "crankAxle");
		crankAxle.setTextureOffset(63, 153);
		crankAxle.setTextureSize(256, 256);
		crankAxle.setRotationPoint(-2.0f, -2.0f, 21.0f);
		setPieceRotation(crankAxle, 0.0f, 0.0f, 0.0f);
		crankAxle.addBox(0.0f, -0.5f, -0.5f, 4, 1, 1);
		crankHandle1 = new ModelRenderer(this, "crankHandle1");
		crankHandle1.setTextureOffset(81, 146);
		crankHandle1.setTextureSize(256, 256);
		crankHandle1.setRotationPoint(-0.5f, 0.0f, 0.0f);
		setPieceRotation(crankHandle1, 0.0f, 0.0f, 0.0f);
		crankHandle1.addBox(-0.5f, -2.5f, -0.5f, 1, 5, 1);
		crankAxle.addChild(crankHandle1);
		crankHandle2 = new ModelRenderer(this, "crankHandle2");
		crankHandle2.setTextureOffset(86, 146);
		crankHandle2.setTextureSize(256, 256);
		crankHandle2.setRotationPoint(-0.5f, 0.0f, 0.0f);
		setPieceRotation(crankHandle2, 0.0f, 0.0f, 0.0f);
		crankHandle2.addBox(-0.5f, -0.5f, -2.5f, 1, 1, 5);
		crankAxle.addChild(crankHandle2);
		armMain.addChild(crankAxle);
		catch2 = new ModelRenderer(this, "catch2");
		catch2.setTextureOffset(99, 146);
		catch2.setTextureSize(256, 256);
		catch2.setRotationPoint(-1.0f, -6.0f, 20.5f);
		setPieceRotation(catch2, -0.8552113f, 0.0f, 0.0f);
		catch2.addBox(0.0f, 0.0f, 0.0f, 2, 1, 4);
		armMain.addChild(catch2);
		catch1 = new ModelRenderer(this, "catch1");
		catch1.setTextureOffset(99, 152);
		catch1.setTextureSize(256, 256);
		catch1.setRotationPoint(-1.0f, -6.0f, 17.5f);
		setPieceRotation(catch1, 0.0f, 0.0f, 0.0f);
		catch1.addBox(0.0f, 0.0f, 0.0f, 2, 1, 3);
		armMain.addChild(catch1);
		armRightMain = new ModelRenderer(this, "armRightMain");
		armRightMain.setTextureOffset(0, 215);
		armRightMain.setTextureSize(256, 256);
		armRightMain.setRotationPoint(-5.5f, -5.0f, -6.0f);
		setPieceRotation(armRightMain, 0.0f, 0.5235982f, 0.0f);
		armRightMain.addBox(-6.5f, -1.0f, -1.0f, 8, 3, 1);
		armRightMainInner = new ModelRenderer(this, "armRightMainInner");
		armRightMainInner.setTextureOffset(0, 203);
		armRightMainInner.setTextureSize(256, 256);
		armRightMainInner.setRotationPoint(0.0f, 0.0f, 0.0f);
		setPieceRotation(armRightMainInner, 0.0f, 0.0f, 0.0f);
		armRightMainInner.addBox(-2.5f, -1.0f, 0.0f, 4, 3, 1);
		armRightMain.addChild(armRightMainInner);
		armRightMainInner3 = new ModelRenderer(this, "armRightMainInner3");
		armRightMainInner3.setTextureOffset(0, 196);
		armRightMainInner3.setTextureSize(256, 256);
		armRightMainInner3.setRotationPoint(0.0f, 0.0f, 0.0f);
		setPieceRotation(armRightMainInner3, 0.0f, 0.0f, 0.0f);
		armRightMainInner3.addBox(-6.5f, 0.0f, 0.0f, 4, 1, 1);
		armRightMain.addChild(armRightMainInner3);
		armRightMainInner2 = new ModelRenderer(this, "armRightMainInner2");
		armRightMainInner2.setTextureOffset(0, 199);
		armRightMainInner2.setTextureSize(256, 256);
		armRightMainInner2.setRotationPoint(0.0f, 0.0f, 0.0f);
		setPieceRotation(armRightMainInner2, 0.0f, 0.0f, 0.0f);
		armRightMainInner2.addBox(-6.5f, -0.5f, -0.5f, 4, 2, 1);
		armRightMain.addChild(armRightMainInner2);
		armRightInner = new ModelRenderer(this, "armRightInner");
		armRightInner.setTextureOffset(0, 208);
		armRightInner.setTextureSize(256, 256);
		armRightInner.setRotationPoint(0.0f, 0.0f, 0.0f);
		setPieceRotation(armRightInner, 0.0f, 0.0f, 0.0f);
		armRightInner.addBox(-13.25f, 0.0f, -0.5f, 7, 1, 1);
		armRightMain.addChild(armRightInner);
		armRightOuter = new ModelRenderer(this, "armRightOuter");
		armRightOuter.setTextureOffset(0, 211);
		armRightOuter.setTextureSize(256, 256);
		armRightOuter.setRotationPoint(0.0f, 0.0f, 0.0f);
		setPieceRotation(armRightOuter, 0.0f, 0.0f, 0.0f);
		armRightOuter.addBox(-13.5f, -0.5f, -1.0f, 7, 2, 1);
		armRightMain.addChild(armRightOuter);
		stringRight = new ModelRenderer(this, "stringRight");
		stringRight.setTextureOffset(0, 220);
		stringRight.setTextureSize(256, 256);
		stringRight.setRotationPoint(-13.0f, 0.5f, 0.0f);
		setPieceRotation(stringRight, 0.0f, -0.5235985f, 0.0f);
		stringRight.addBox(0.0f, -0.5f, 0.0f, 17, 1, 1);
		armRightMain.addChild(stringRight);
		armMain.addChild(armRightMain);
		armLeftMain = new ModelRenderer(this, "armLeftMain");
		armLeftMain.setTextureOffset(0, 215);
		armLeftMain.setTextureSize(256, 256);
		armLeftMain.setRotationPoint(5.5f, -6.0f, -6.0f);
		setPieceRotation(armLeftMain, 0.0f, -0.5235988f, 0.0f);
		armLeftMain.addBox(-1.5f, 0.0f, -1.0f, 8, 3, 1);
		armLeftMainInner = new ModelRenderer(this, "armLeftMainInner");
		armLeftMainInner.setTextureOffset(0, 203);
		armLeftMainInner.setTextureSize(256, 256);
		armLeftMainInner.setRotationPoint(0.0f, 0.0f, 0.0f);
		setPieceRotation(armLeftMainInner, 0.0f, 0.0f, 0.0f);
		armLeftMainInner.addBox(-1.5f, 0.0f, 0.0f, 4, 3, 1);
		armLeftMain.addChild(armLeftMainInner);
		armLeftOuter = new ModelRenderer(this, "armLeftOuter");
		armLeftOuter.setTextureOffset(0, 211);
		armLeftOuter.setTextureSize(256, 256);
		armLeftOuter.setRotationPoint(0.0f, 0.0f, 0.0f);
		setPieceRotation(armLeftOuter, 0.0f, 0.0f, 0.0f);
		armLeftOuter.addBox(6.5f, 0.5f, -1.0f, 7, 2, 1);
		armLeftMain.addChild(armLeftOuter);
		armLeftMainInner2 = new ModelRenderer(this, "armLeftMainInner2");
		armLeftMainInner2.setTextureOffset(0, 199);
		armLeftMainInner2.setTextureSize(256, 256);
		armLeftMainInner2.setRotationPoint(0.0f, 0.0f, 0.0f);
		setPieceRotation(armLeftMainInner2, 0.0f, 0.0f, 0.0f);
		armLeftMainInner2.addBox(2.5f, 0.5f, -0.5f, 4, 2, 1);
		armLeftMain.addChild(armLeftMainInner2);
		armLeftMainInner3 = new ModelRenderer(this, "armLeftMainInner3");
		armLeftMainInner3.setTextureOffset(0, 196);
		armLeftMainInner3.setTextureSize(256, 256);
		armLeftMainInner3.setRotationPoint(0.0f, 0.0f, 0.0f);
		setPieceRotation(armLeftMainInner3, 0.0f, 0.0f, 0.0f);
		armLeftMainInner3.addBox(2.5f, 1.0f, -0.0f, 4, 1, 1);
		armLeftMain.addChild(armLeftMainInner3);
		armLeftInner = new ModelRenderer(this, "armLeftInner");
		armLeftInner.setTextureOffset(0, 208);
		armLeftInner.setTextureSize(256, 256);
		armLeftInner.setRotationPoint(0.0f, 0.0f, 0.0f);
		setPieceRotation(armLeftInner, 0.0f, 0.0f, 0.0f);
		armLeftInner.addBox(6.25f, 1.0f, -0.5f, 7, 1, 1);
		armLeftMain.addChild(armLeftInner);
		stringLeft = new ModelRenderer(this, "stringLeft");
		stringLeft.setTextureOffset(0, 220);
		stringLeft.setTextureSize(256, 256);
		stringLeft.setRotationPoint(13.0f, 1.5f, 0.0f);
		setPieceRotation(stringLeft, 0.0f, 0.5235985f, 0.0f);
		stringLeft.addBox(-17.0f, -0.5f, 0.0f, 17, 1, 1);
		armLeftMain.addChild(stringLeft);
		armMain.addChild(armLeftMain);
	}

	@Override
	public void render(Entity entity, float f1, float f2, float f3, float f4, float f5, float f6) {
		super.render(entity, f1, f2, f3, f4, f5, f6);
		setRotationAngles(f1, f2, f3, f4, f5, f6, entity);
		baseMain.render(f6);
		armMain.render(f6);
	}

	public void setPieceRotation(ModelRenderer model, float x, float y, float z) {
		model.rotateAngleX = x;
		model.rotateAngleY = y;
		model.rotateAngleZ = z;
	}

	public void setBowAndStringRotation(float bow, float string) {
		this.armLeftMain.rotateAngleY = Trig.toRadians(-bow);
		this.armRightMain.rotateAngleY = Trig.toRadians(bow);
		this.stringLeft.rotateAngleY = Trig.toRadians(-string);
		this.stringRight.rotateAngleY = Trig.toRadians(string);
	}

	public void setTurretRotation(float yaw, float pitch) {
		this.armMain.rotateAngleY = Trig.toRadians(yaw);
		this.armMain.rotateAngleX = Trig.toRadians(pitch);
	}

	public void setCrankRotations(float angle) {
		this.crankAxle.rotateAngleX = Trig.toRadians(angle);
	}

	public void setTriggerAngle(float angle) {
		this.trigger1.rotateAngleX = Trig.toRadians(angle);
	}
}
