package com.javaStudy.absClass;

public class Main {

	public static void main(String[] args) {

		Animal animal = null;
		Dog dog = new Dog();
		Cat cat = new Cat();
		
		animal = new Dog();
		animal.sound();
		animal = new Cat();
		animal.sound();
		
		animalSound(dog);
		animalSound(cat);
	}

	public static void animalSound(Animal animal) {
		animal.sound();
	}
}
