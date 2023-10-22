package com.javaStudy.interfaceEx;

public class Main {

	public static void main(String[] args) {
		InterfaceClass interfaceClass = new InterfaceClass();

		interfaceClass.calculate();
		interfaceClass.getStr();

		InterfaceEx iEx = new InterfaceClass();
		iEx.calculate();

		InterfaceEx2 iEx2 = new InterfaceClass();
		iEx2.getStr();

		System.out.println(InterfaceEx.NAME);

	}

}
