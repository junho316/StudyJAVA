package com.javaStudy.interfaceEx2;

public class CPhone implements IFunction {

	@Override
	public void sendRecieve() {
		System.out.println("전화 가능합니다");
	}

	@Override
	public void connectionSpeed() {
		System.out.println("4G입니다.");
	}

	@Override
	public void remoteControl() {
		System.out.println("미탑재 되어 있습니다.");
	}
}
