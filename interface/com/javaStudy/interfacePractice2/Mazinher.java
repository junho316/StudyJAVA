package com.javaStudy.interfacePractice2;

public class Mazinher implements Misile, MoveArmLeg {

	@Override
	public void misile() {
		System.out.println("미사일");

	}

	@Override
	public void moveArmLeg() {
		System.out.println("팔다리 움직임");

	}

}
