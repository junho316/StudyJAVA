package com.javaStudy.interfaceEx2;

public class Main {

	public static void main(String[] args) {

		System.out.println("A Phone");
		printPhone(new APhone());

		System.out.println("B Phone");
		printPhone(new BPhone());

		System.out.println("C Phone");
		printPhone(new CPhone());

	}

	static void printPhone(IFunction phoneFunction) {
		phoneFunction.sendRecieve();
		phoneFunction.connectionSpeed();
		phoneFunction.remoteControl();
		System.out.println("------------------");
	}

}
