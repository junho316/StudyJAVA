package com.javaStudy.interfacePractice;

public class BPhone implements IFunction {

	@Override
	public void call() {
		System.out.println("전화 가능");
	}

	@Override
	public void speed() {
		System.out.println("5G");

	}

	@Override
	public void remote() {
		System.out.println("탑재");
	}

}
