package com.javaStudy.absClass;

public class Cat extends Animal {

	public Cat() {
		this.kind = "포유류";
	}
	
	@Override
	void sound() {
	System.out.println("야옹");	
	}
}
