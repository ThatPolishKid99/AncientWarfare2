package net.shadowmage.ancientwarfare.vehicle.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import net.shadowmage.ancientwarfare.core.util.Trig;

@SideOnly(Side.CLIENT)
public class ModelHelicopter extends ModelBase {

	ModelRenderer bodyBottom;
	ModelRenderer skidLegFR;
	ModelRenderer skidLegRR;
	ModelRenderer skidLegRL;
	ModelRenderer skidLegFL;
	ModelRenderer skidRM;
	ModelRenderer skidLM;
	ModelRenderer bodyFront;
	ModelRenderer chairBrace;
	ModelRenderer chairBottom;
	ModelRenderer chairBack;
	ModelRenderer bodyLeft;
	ModelRenderer bodyRight;
	ModelRenderer bodyRear;
	ModelRenderer bodyLeft2;
	ModelRenderer bodyMid;
	ModelRenderer bodyTail1;
	ModelRenderer bodyTail2;
	ModelRenderer bodyTail3;
	ModelRenderer bodyTail4;
	ModelRenderer bodyTail5;
	ModelRenderer bodyTail6;
	ModelRenderer bodyTail7;
	ModelRenderer bodyRear2;
	ModelRenderer bodyRight2;
	ModelRenderer bodyRight3;
	ModelRenderer bodyRight4;
	ModelRenderer bodyLeft3;
	ModelRenderer bodyLeft4;
	ModelRenderer bodyTop1;
	ModelRenderer bodyTop2;
	ModelRenderer mainRotor;
	ModelRenderer rotorHub;
	ModelRenderer bladeRoot1;
	ModelRenderer bladeBase1;
	ModelRenderer blade1;
	ModelRenderer bladeRoot2;
	ModelRenderer bladeBase2;
	ModelRenderer blade2;
	ModelRenderer tailFin1;
	ModelRenderer tailRotorAxle;
	ModelRenderer tailHub;
	ModelRenderer tailRoot1;
	ModelRenderer tailRoot2;
	ModelRenderer skidRF;
	ModelRenderer skidLF;

	public ModelHelicopter() {
		bodyBottom = new ModelRenderer(this, "bodyBottom");
		bodyBottom.setTextureOffset(20, 1);
		bodyBottom.setTextureSize(256, 256);
		bodyBottom.setRotationPoint(0.0f, -12.0f, 0.0f);
		setPieceRotation(bodyBottom, 0.0f, 0.0f, 0.0f);
		bodyBottom.addBox(-7.0f, 3.0f, -16.0f, 14, 1, 28);
		skidLegFR = new ModelRenderer(this, "skidLegFR");
		skidLegFR.setTextureOffset(0, 116);
		skidLegFR.setTextureSize(256, 256);
		skidLegFR.setRotationPoint(-6.0f, 4.0f, -11.0f);
		setPieceRotation(skidLegFR, -0.26179928f, 0.0f, 0.26179925f);
		skidLegFR.addBox(-0.5f, -0.5f, -0.5f, 1, 9, 1);
		bodyBottom.addChild(skidLegFR);
		skidLegRR = new ModelRenderer(this, "skidLegRR");
		skidLegRR.setTextureOffset(0, 116);
		skidLegRR.setTextureSize(256, 256);
		skidLegRR.setRotationPoint(-6.0f, 4.0f, 11.0f);
		setPieceRotation(skidLegRR, 0.2617995f, 0.0f, 0.261799f);
		skidLegRR.addBox(-0.5f, -0.5f, -0.5f, 1, 9, 1);
		bodyBottom.addChild(skidLegRR);
		skidLegRL = new ModelRenderer(this, "skidLegRL");
		skidLegRL.setTextureOffset(0, 116);
		skidLegRL.setTextureSize(256, 256);
		skidLegRL.setRotationPoint(6.0f, 4.0f, 11.0f);
		setPieceRotation(skidLegRL, 0.2617995f, 0.0f, -0.26179975f);
		skidLegRL.addBox(-0.5f, -0.5f, -0.5f, 1, 9, 1);
		bodyBottom.addChild(skidLegRL);
		skidLegFL = new ModelRenderer(this, "skidLegFL");
		skidLegFL.setTextureOffset(0, 116);
		skidLegFL.setTextureSize(256, 256);
		skidLegFL.setRotationPoint(6.0f, 4.0f, -11.0f);
		setPieceRotation(skidLegFL, -0.26179928f, 0.0f, -0.26179975f);
		skidLegFL.addBox(-0.5f, -0.5f, -0.5f, 1, 9, 1);
		bodyBottom.addChild(skidLegFL);
		skidRM = new ModelRenderer(this, "skidRM");
		skidRM.setTextureOffset(23, 115);
		skidRM.setTextureSize(256, 256);
		skidRM.setRotationPoint(-8.0f, 11.0f, 0.0f);
		setPieceRotation(skidRM, 0.0f, 0.0f, 0.0f);
		skidRM.addBox(-1.0f, 0.0f, -15.0f, 2, 1, 36);
		bodyBottom.addChild(skidRM);
		skidLM = new ModelRenderer(this, "skidLM");
		skidLM.setTextureOffset(23, 115);
		skidLM.setTextureSize(256, 256);
		skidLM.setRotationPoint(8.0f, 11.0f, 0.0f);
		setPieceRotation(skidLM, 0.0f, 0.0f, 0.0f);
		skidLM.addBox(-1.0f, 0.0f, -15.0f, 2, 1, 36);
		bodyBottom.addChild(skidLM);
		bodyFront = new ModelRenderer(this, "bodyFront");
		bodyFront.setTextureOffset(114, 38);
		bodyFront.setTextureSize(256, 256);
		bodyFront.setRotationPoint(0.0f, -3.0f, -17.0f);
		setPieceRotation(bodyFront, 0.0f, 0.0f, 0.0f);
		bodyFront.addBox(-7.0f, 0.0f, 0.0f, 14, 6, 1);
		bodyBottom.addChild(bodyFront);
		chairBrace = new ModelRenderer(this, "chairBrace");
		chairBrace.setTextureOffset(70, 59);
		chairBrace.setTextureSize(256, 256);
		chairBrace.setRotationPoint(-1.5f, 2.0f, -4.0f);
		setPieceRotation(chairBrace, 0.0f, 0.0f, 0.0f);
		chairBrace.addBox(0.0f, 0.0f, -8.0f, 3, 1, 7);
		chairBottom = new ModelRenderer(this, "chairBottom");
		chairBottom.setTextureOffset(54, 68);
		chairBottom.setTextureSize(256, 256);
		chairBottom.setRotationPoint(-3.5f, -1.5f, -1.0f);
		setPieceRotation(chairBottom, 0.1570796f, 0.0f, 0.0f);
		chairBottom.addBox(0.0f, 0.0f, -9.0f, 10, 1, 9);
		chairBrace.addChild(chairBottom);
		chairBack = new ModelRenderer(this, "chairBack");
		chairBack.setTextureOffset(49, 79);
		chairBack.setTextureSize(256, 256);
		chairBack.setRotationPoint(-3.5f, -1.0f, -1.0f);
		setPieceRotation(chairBack, -0.1745329f, 0.0f, 0.0f);
		chairBack.addBox(0.0f, -10.0f, 0.0f, 10, 10, 1);
		chairBrace.addChild(chairBack);
		bodyBottom.addChild(chairBrace);
		bodyLeft = new ModelRenderer(this, "bodyLeft");
		bodyLeft.setTextureOffset(0, 115);
		bodyLeft.setTextureSize(256, 256);
		bodyLeft.setRotationPoint(-8.0f, -3.0f, -16.0f);
		setPieceRotation(bodyLeft, 0.0f, 0.0f, 0.0f);
		bodyLeft.addBox(0.0f, 0.0f, 0.0f, 1, 6, 28);
		bodyBottom.addChild(bodyLeft);
		bodyRight = new ModelRenderer(this, "bodyRight");
		bodyRight.setTextureOffset(0, 115);
		bodyRight.setTextureSize(256, 256);
		bodyRight.setRotationPoint(7.0f, -3.0f, -16.0f);
		setPieceRotation(bodyRight, 0.0f, 0.0f, 0.0f);
		bodyRight.addBox(0.0f, 0.0f, 0.0f, 1, 6, 28);
		bodyBottom.addChild(bodyRight);
		bodyRear = new ModelRenderer(this, "bodyRear");
		bodyRear.setTextureOffset(114, 46);
		bodyRear.setTextureSize(256, 256);
		bodyRear.setRotationPoint(0.0f, -3.0f, 12.0f);
		setPieceRotation(bodyRear, 0.0f, 0.0f, 0.0f);
		bodyRear.addBox(-8.0f, 0.0f, 0.0f, 16, 6, 1);
		bodyBottom.addChild(bodyRear);
		bodyLeft2 = new ModelRenderer(this, "bodyLeft2");
		bodyLeft2.setTextureOffset(90, 35);
		bodyLeft2.setTextureSize(256, 256);
		bodyLeft2.setRotationPoint(7.0f, -7.0f, -5.0f);
		setPieceRotation(bodyLeft2, 0.0f, 0.0f, 0.0f);
		bodyLeft2.addBox(0.0f, 0.0f, 0.0f, 2, 4, 19);
		bodyBottom.addChild(bodyLeft2);
		bodyMid = new ModelRenderer(this, "bodyMid");
		bodyMid.setTextureOffset(78, 38);
		bodyMid.setTextureSize(256, 256);
		bodyMid.setRotationPoint(0.0f, -11.0f, -1.0f);
		setPieceRotation(bodyMid, 0.0f, 0.0f, 0.0f);
		bodyMid.addBox(-7.0f, 0.0f, 0.0f, 14, 14, 1);
		bodyBottom.addChild(bodyMid);
		bodyTail1 = new ModelRenderer(this, "bodyTail1");
		bodyTail1.setTextureOffset(103, 105);
		bodyTail1.setTextureSize(256, 256);
		bodyTail1.setRotationPoint(0.0f, -11.0f, 13.0f);
		setPieceRotation(bodyTail1, 0.0f, 0.0f, 0.0f);
		bodyTail1.addBox(-7.0f, 0.0f, 0.0f, 14, 13, 2);
		bodyBottom.addChild(bodyTail1);
		bodyTail2 = new ModelRenderer(this, "bodyTail2");
		bodyTail2.setTextureOffset(130, 91);
		bodyTail2.setTextureSize(256, 256);
		bodyTail2.setRotationPoint(0.0f, -11.0f, 15.0f);
		setPieceRotation(bodyTail2, 0.0f, 0.0f, 0.0f);
		bodyTail2.addBox(-6.0f, 0.0f, 0.0f, 12, 11, 2);
		bodyBottom.addChild(bodyTail2);
		bodyTail3 = new ModelRenderer(this, "bodyTail3");
		bodyTail3.setTextureOffset(103, 91);
		bodyTail3.setTextureSize(256, 256);
		bodyTail3.setRotationPoint(0.0f, -10.0f, 17.0f);
		setPieceRotation(bodyTail3, 0.0f, 0.0f, 0.0f);
		bodyTail3.addBox(-5.0f, 0.0f, 0.0f, 10, 9, 3);
		bodyBottom.addChild(bodyTail3);
		bodyTail4 = new ModelRenderer(this, "bodyTail4");
		bodyTail4.setTextureOffset(129, 62);
		bodyTail4.setTextureSize(256, 256);
		bodyTail4.setRotationPoint(0.0f, -9.0f, 20.0f);
		setPieceRotation(bodyTail4, 0.0f, 0.0f, 0.0f);
		bodyTail4.addBox(-4.0f, 0.0f, 0.0f, 8, 7, 4);
		bodyBottom.addChild(bodyTail4);
		bodyTail5 = new ModelRenderer(this, "bodyTail5");
		bodyTail5.setTextureOffset(129, 74);
		bodyTail5.setTextureSize(256, 256);
		bodyTail5.setRotationPoint(0.0f, -9.0f, 24.0f);
		setPieceRotation(bodyTail5, 0.0f, 0.0f, 0.0f);
		bodyTail5.addBox(-3.0f, 0.0f, 0.0f, 6, 6, 5);
		bodyBottom.addChild(bodyTail5);
		bodyTail6 = new ModelRenderer(this, "bodyTail6");
		bodyTail6.setTextureOffset(103, 67);
		bodyTail6.setTextureSize(256, 256);
		bodyTail6.setRotationPoint(0.0f, -9.0f, 29.0f);
		setPieceRotation(bodyTail6, 0.0f, 0.0f, 0.0f);
		bodyTail6.addBox(-2.0f, 0.0f, 0.0f, 4, 5, 5);
		bodyBottom.addChild(bodyTail6);
		bodyTail7 = new ModelRenderer(this, "bodyTail7");
		bodyTail7.setTextureOffset(95, 59);
		bodyTail7.setTextureSize(256, 256);
		bodyTail7.setRotationPoint(0.5f, -9.0f, 34.0f);
		setPieceRotation(bodyTail7, 0.0f, 0.0f, 0.0f);
		bodyTail7.addBox(-2.0f, 0.0f, 0.0f, 3, 4, 27);
		bodyBottom.addChild(bodyTail7);
		bodyRear2 = new ModelRenderer(this, "bodyRear2");
		bodyRear2.setTextureOffset(91, 59);
		bodyRear2.setTextureSize(256, 256);
		bodyRear2.setRotationPoint(0.0f, -9.0f, 12.0f);
		setPieceRotation(bodyRear2, 0.0f, 0.0f, 0.0f);
		bodyRear2.addBox(-7.0f, 0.0f, 0.0f, 14, 6, 1);
		bodyBottom.addChild(bodyRear2);
		bodyRight2 = new ModelRenderer(this, "bodyRight2");
		bodyRight2.setTextureOffset(90, 35);
		bodyRight2.setTextureSize(256, 256);
		bodyRight2.setRotationPoint(-9.0f, -7.0f, -5.0f);
		setPieceRotation(bodyRight2, 0.0f, 0.0f, 0.0f);
		bodyRight2.addBox(0.0f, 0.0f, 0.0f, 2, 4, 19);
		bodyBottom.addChild(bodyRight2);
		bodyRight3 = new ModelRenderer(this, "bodyRight3");
		bodyRight3.setTextureOffset(53, 39);
		bodyRight3.setTextureSize(256, 256);
		bodyRight3.setRotationPoint(-8.0f, -9.0f, -3.0f);
		setPieceRotation(bodyRight3, 0.0f, 0.0f, 0.0f);
		bodyRight3.addBox(0.0f, 0.0f, 0.0f, 1, 2, 17);
		bodyBottom.addChild(bodyRight3);
		bodyRight4 = new ModelRenderer(this, "bodyRight4");
		bodyRight4.setTextureOffset(0, 29);
		bodyRight4.setTextureSize(256, 256);
		bodyRight4.setRotationPoint(-7.0f, -11.0f, 0.0f);
		setPieceRotation(bodyRight4, 0.0f, 0.0f, 0.0f);
		bodyRight4.addBox(0.0f, 0.0f, 0.0f, 1, 2, 13);
		bodyBottom.addChild(bodyRight4);
		bodyLeft3 = new ModelRenderer(this, "bodyLeft3");
		bodyLeft3.setTextureOffset(53, 39);
		bodyLeft3.setTextureSize(256, 256);
		bodyLeft3.setRotationPoint(7.0f, -9.0f, -3.0f);
		setPieceRotation(bodyLeft3, 0.0f, 0.0f, 0.0f);
		bodyLeft3.addBox(0.0f, 0.0f, 0.0f, 1, 2, 17);
		bodyBottom.addChild(bodyLeft3);
		bodyLeft4 = new ModelRenderer(this, "bodyLeft4");
		bodyLeft4.setTextureOffset(0, 29);
		bodyLeft4.setTextureSize(256, 256);
		bodyLeft4.setRotationPoint(6.0f, -11.0f, 0.0f);
		setPieceRotation(bodyLeft4, 0.0f, 0.0f, 0.0f);
		bodyLeft4.addBox(0.0f, 0.0f, 0.0f, 1, 2, 13);
		bodyBottom.addChild(bodyLeft4);
		bodyTop1 = new ModelRenderer(this, "bodyTop1");
		bodyTop1.setTextureOffset(0, 45);
		bodyTop1.setTextureSize(256, 256);
		bodyTop1.setRotationPoint(-6.0f, -12.0f, 0.0f);
		setPieceRotation(bodyTop1, 0.0f, 0.0f, 0.0f);
		bodyTop1.addBox(0.0f, 0.0f, 0.0f, 12, 1, 14);
		bodyBottom.addChild(bodyTop1);
		bodyTop2 = new ModelRenderer(this, "bodyTop2");
		bodyTop2.setTextureOffset(0, 61);
		bodyTop2.setTextureSize(256, 256);
		bodyTop2.setRotationPoint(-4.0f, -13.0f, 0.0f);
		setPieceRotation(bodyTop2, 0.0f, 0.0f, 0.0f);
		bodyTop2.addBox(0.0f, 0.0f, 0.0f, 8, 1, 12);
		bodyBottom.addChild(bodyTop2);
		mainRotor = new ModelRenderer(this, "mainRotor");
		mainRotor.setTextureOffset(5, 116);
		mainRotor.setTextureSize(256, 256);
		mainRotor.setRotationPoint(0.0f, -27.0f, 0.0f);
		setPieceRotation(mainRotor, 0.0f, 0.0f, 0.0f);
		mainRotor.addBox(-0.5f, 0.0f, -0.5f, 1, 17, 1);
		rotorHub = new ModelRenderer(this, "rotorHub");
		rotorHub.setTextureOffset(18, 103);
		rotorHub.setTextureSize(256, 256);
		rotorHub.setRotationPoint(0.0f, 0.0f, 0.0f);
		setPieceRotation(rotorHub, 0.0f, 0.0f, 0.0f);
		rotorHub.addBox(-1.5f, -1.0f, -1.5f, 3, 1, 3);
		mainRotor.addChild(rotorHub);
		bladeRoot1 = new ModelRenderer(this, "bladeRoot1");
		bladeRoot1.setTextureOffset(0, 103);
		bladeRoot1.setTextureSize(256, 256);
		bladeRoot1.setRotationPoint(0.5f, 0.0f, 0.0f);
		setPieceRotation(bladeRoot1, 0.0f, 0.0f, 0.0f);
		bladeRoot1.addBox(0.0f, 0.0f, -0.5f, 3, 1, 1);
		mainRotor.addChild(bladeRoot1);
		bladeBase1 = new ModelRenderer(this, "bladeBase1");
		bladeBase1.setTextureOffset(5, 103);
		bladeBase1.setTextureSize(256, 256);
		bladeBase1.setRotationPoint(3.5f, 0.0f, 0.0f);
		setPieceRotation(bladeBase1, 0.0f, 0.0f, 0.0f);
		bladeBase1.addBox(0.0f, -0.5f, -2.0f, 2, 2, 4);
		mainRotor.addChild(bladeBase1);
		blade1 = new ModelRenderer(this, "blade1");
		blade1.setTextureOffset(0, 98);
		blade1.setTextureSize(256, 256);
		blade1.setRotationPoint(5.5f, 0.5f, 0.0f);
		setPieceRotation(blade1, -0.12217298f, 0.0f, 0.0f);
		blade1.addBox(0.0f, -0.5f, -1.5f, 48, 1, 3);
		mainRotor.addChild(blade1);
		bladeRoot2 = new ModelRenderer(this, "bladeRoot2");
		bladeRoot2.setTextureOffset(0, 103);
		bladeRoot2.setTextureSize(256, 256);
		bladeRoot2.setRotationPoint(-3.5f, 0.0f, 0.0f);
		setPieceRotation(bladeRoot2, 0.0f, 0.0f, 0.0f);
		bladeRoot2.addBox(0.0f, 0.0f, -0.5f, 3, 1, 1);
		mainRotor.addChild(bladeRoot2);
		bladeBase2 = new ModelRenderer(this, "bladeBase2");
		bladeBase2.setTextureOffset(5, 103);
		bladeBase2.setTextureSize(256, 256);
		bladeBase2.setRotationPoint(-5.5f, 0.0f, 0.0f);
		setPieceRotation(bladeBase2, 0.0f, 0.0f, 0.0f);
		bladeBase2.addBox(0.0f, -0.5f, -2.0f, 2, 2, 4);
		mainRotor.addChild(bladeBase2);
		blade2 = new ModelRenderer(this, "blade2");
		blade2.setTextureOffset(0, 98);
		blade2.setTextureSize(256, 256);
		blade2.setRotationPoint(-53.5f, 0.5f, 0.0f);
		setPieceRotation(blade2, 0.1221731f, 0.0f, 0.0f);
		blade2.addBox(0.0f, -0.5f, -1.5f, 48, 1, 3);
		mainRotor.addChild(blade2);
		bodyBottom.addChild(mainRotor);
		tailFin1 = new ModelRenderer(this, "tailFin1");
		tailFin1.setTextureOffset(0, 75);
		tailFin1.setTextureSize(256, 256);
		tailFin1.setRotationPoint(-0.5f, -17.0f, 56.0f);
		setPieceRotation(tailFin1, -0.24434602f, 0.0f, 0.0f);
		tailFin1.addBox(0.0f, 0.0f, 0.0f, 1, 9, 6);
		bodyBottom.addChild(tailFin1);
		tailRotorAxle = new ModelRenderer(this, "tailRotorAxle");
		tailRotorAxle.setTextureOffset(31, 103);
		tailRotorAxle.setTextureSize(256, 256);
		tailRotorAxle.setRotationPoint(0.5f, -7.0f, 59.0f);
		setPieceRotation(tailRotorAxle, 0.0f, 0.0f, 1.2483568E-8f);
		tailRotorAxle.addBox(-4.0f, -0.5f, -0.5f, 2, 1, 1);
		tailHub = new ModelRenderer(this, "tailHub");
		tailHub.setTextureOffset(35, 103);
		tailHub.setTextureSize(256, 256);
		tailHub.setRotationPoint(-5.0f, 0.0f, -0.5f);
		setPieceRotation(tailHub, 0.0f, 0.0f, 0.0f);
		tailHub.addBox(0.0f, -0.5f, -1.0f, 1, 1, 3);
		tailRotorAxle.addChild(tailHub);
		tailRoot1 = new ModelRenderer(this, "tailRoot1");
		tailRoot1.setTextureOffset(38, 103);
		tailRoot1.setTextureSize(256, 256);
		tailRoot1.setRotationPoint(-5.0f, 0.0f, 1.5f);
		setPieceRotation(tailRoot1, -3.120892E-9f, 0.0f, 0.12217306f);
		tailRoot1.addBox(0.0f, -1.0f, 0.0f, 1, 2, 6);
		tailRotorAxle.addChild(tailRoot1);
		tailRoot2 = new ModelRenderer(this, "tailRoot2");
		tailRoot2.setTextureOffset(38, 103);
		tailRoot2.setTextureSize(256, 256);
		tailRoot2.setRotationPoint(-5.0f, 0.0f, -7.5f);
		setPieceRotation(tailRoot2, -3.120892E-9f, 0.0f, -0.12217305f);
		tailRoot2.addBox(0.0f, -1.0f, 0.0f, 1, 2, 6);
		tailRotorAxle.addChild(tailRoot2);
		bodyBottom.addChild(tailRotorAxle);
		skidRF = new ModelRenderer(this, "skidRF");
		skidRF.setTextureOffset(0, 91);
		skidRF.setTextureSize(256, 256);
		skidRF.setRotationPoint(-8.0f, 11.0f, -15.0f);
		setPieceRotation(skidRF, -0.34906575f, 0.0f, 0.0f);
		skidRF.addBox(-1.0f, 0.0f, -5.0f, 2, 1, 5);
		bodyBottom.addChild(skidRF);
		skidLF = new ModelRenderer(this, "skidLF");
		skidLF.setTextureOffset(0, 91);
		skidLF.setTextureSize(256, 256);
		skidLF.setRotationPoint(8.0f, 11.0f, -15.0f);
		setPieceRotation(skidLF, -0.34906575f, 0.0f, 0.0f);
		skidLF.addBox(-1.0f, 0.0f, -5.0f, 2, 1, 5);
		bodyBottom.addChild(skidLF);
	}

	@Override
	public void render(Entity entity, float f1, float f2, float f3, float f4, float f5, float f6) {
		super.render(entity, f1, f2, f3, f4, f5, f6);
		setRotationAngles(f1, f2, f3, f4, f5, f6, entity);
		bodyBottom.render(f6);
	}

	public void setPieceRotation(ModelRenderer model, float x, float y, float z) {
		model.rotateAngleX = x;
		model.rotateAngleY = y;
		model.rotateAngleZ = z;
	}

	public void setWheelRotations(float fl, float fr, float rl, float rr) {
		this.mainRotor.rotateAngleY = -Trig.toRadians(fl);
		this.tailRotorAxle.rotateAngleX = -Trig.toRadians(fl);
	}
}
