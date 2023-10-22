package com.javaStudy.absClassEx2;

public class SonataLowGrade extends Sonata {

	int tax;

	public SonataLowGrade(String color, String tire, int displacement, String handle, int tax) {
		super(color, tire, displacement, handle);
		this.tax = tax;
	}

	@Override
	void getSpec() {

		System.out.println("-------------");
		System.out.println("색상 :" + this.color);
		System.out.println("타이어 :" + this.tire);
		System.out.println("배기량 :" + this.displacement);
		System.out.println("핸들 :" + this.handle);
		System.out.println("세굼 :" + tax);
		System.out.println("-------------");

	}
}
