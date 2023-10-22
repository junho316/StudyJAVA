package com.javaStudy.interfaceEx4;

public class Main {

	public static void main(String[] args) {

		System.out.println("비행기");
		printToy(new AirPlaneToy());
		System.out.println("곰");
		printToy(new BearToy());
		System.out.println("마징가");
		printToy(new MazingerToy());

	}

	static void printToy(Toy toy) {
		toy.moveArmLeg();
		toy.misile();
		toy.light();
		System.out.println("------------------");
	}

}
