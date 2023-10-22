package com.javaStudy.interfaceEx3;

public class AirPlaneToy implements Toy {

	@Override
	public void moveArmLeg() {

	}

	@Override
	public void misile() {
		System.out.println("불빛 발사가 가능합니다.");
	}

	@Override
	public void light() {
		System.out.println("미사일발사가 가능합니다.");
	}

}
