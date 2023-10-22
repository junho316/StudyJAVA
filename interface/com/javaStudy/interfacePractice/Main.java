package com.javaStudy.interfacePractice;

public class Main {

	public static void main(String[] args) {

		printPhone(new APhone());
		printPhone(new BPhone());
		printPhone(new CPhone());

	}

	static void printPhone(IFunction iFunction) {
		iFunction.call();
		iFunction.speed();
		iFunction.remote();
	}
}
