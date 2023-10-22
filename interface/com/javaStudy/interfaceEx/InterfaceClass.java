package com.javaStudy.interfaceEx;

public class InterfaceClass implements InterfaceEx, InterfaceEx2 {

	@Override
	public String getStr() {
		System.out.println("실제구현은 여기서해요");
		return null;
	}

	@Override
	public void calculate() {
		System.out.println("실제구현은 여기서해요");
	}

}
