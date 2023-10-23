package com.javaStudy.classDiagramEx1;

public class Person {

	private Phone homePhones;
	private Phone officePhone;
	
	public Person() {
		homePhones = new Phone();
		officePhone = new Phone();
	}

	public Phone getHomePhones() {
		return homePhones;
	}

	public Phone getOfficePhone() {
		return officePhone;
	}
	
}
