package com.javaStudy.interfaceEx3;

public class MazingerToy implements Toy {

	@Override
	public void moveArmLeg() {
		System.out.println("팔다리를 움직일수 있습니다.");
	}

	@Override
	public void misile() {

	}

	@Override
	public void light() {
		System.out.println("미사일발사가 가능합니다.");

	}

}
