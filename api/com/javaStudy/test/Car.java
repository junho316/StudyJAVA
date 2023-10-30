package com.javaStudy.test;

public class Car implements Cloneable {

	private String car = "aa";

	public Car(String car) {
		this.car = car;
	}

	public Car() {
		// TODO Auto-generated constructor stub
	}

	public String getCar() {
		return car;
	}

	public void setCar(String car) {
		this.car = car;
	}

	@Override
	public Object clone() {
		Object obj = null;
		try {
			obj = super.clone();
		} catch (CloneNotSupportedException e) {
			// TODO: handle exception
		}

		return obj;
	}
}
