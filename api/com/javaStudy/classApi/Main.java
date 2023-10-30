package com.javaStudy.classApi;

public class Main {

	public static void main(String[] args) throws Exception {

		// Class clazz = Car.class;

		// Class clazz = Class.forName("com.javaStudy.classApi.Main$Car");

		Main main = new Main();
		Car car = main.new Car();

		Class clazz = car.getClass();

		System.out.println(clazz.getName());
		System.out.println(clazz.getSimpleName());
		System.out.println(clazz.getPackage().getName());

	}

	public class Car {
	}

}
