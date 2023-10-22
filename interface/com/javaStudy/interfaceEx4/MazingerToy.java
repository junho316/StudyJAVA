package com.javaStudy.interfaceEx4;

public class MazingerToy implements Misile, MoveArmLeg {

	@Override
	public void misile() {
		System.out.println("미사일발사가 가능합니다.");
		
	}

	@Override
	public void moveArmLeg() {
		System.out.println("팔다리를 움직일수 있습니다.");
	}

}
