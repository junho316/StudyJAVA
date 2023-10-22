package com.javaStudy.interfacePractice2;

public class Airplane implements Light, Misile {

	@Override
	public void light() {
		System.out.println("빛");
		
	}
	
	@Override
	public void misile() {
		System.out.println("미사일");
	}


}
