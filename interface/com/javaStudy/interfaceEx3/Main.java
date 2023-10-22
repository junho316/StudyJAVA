package com.javaStudy.interfaceEx3;

public class Main {

	public static void main(String[] args) {
		
		System.out.println("골돌이");
		printToy(new BearToy());
		System.out.println("마징가");
		printToy(new MazingerToy());
		System.out.println("비행기");
		printToy(new AirPlaneToy());
		
	}
	
	static void printToy(Toy toy) {
		toy.moveArmLeg();
		toy.misile();
		toy.light();
		System.out.println("------------------");
	}

}
