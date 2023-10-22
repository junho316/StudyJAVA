package com.javaStudy.interfacePractice;

public class APhone implements IFunction {

	@Override
	public void call() {
		System.out.println("전화 가능");
	}

	@Override
	public void speed() {
		System.out.println("3G");

	}

	@Override
	public void remote() {
		System.out.println("미탑재");
	}

}
