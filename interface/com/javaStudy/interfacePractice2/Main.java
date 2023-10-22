package com.javaStudy.interfacePractice2;

public class Main {

	public static void main(String[] args) {

		System.out.println("곰");
		printToy(new Bear());
		System.out.println("비행기");
		printToy(new Airplane());
		System.out.println("마징가");
		printToy(new Mazinher());
	}
	static void printToy(Toy toy) {
		toy.moveArmLeg();
		toy.misile();
		toy.light();
	}
}
