package com.javaStudy.nestedClassEx1;

public class Main {

	public static void main(String[] args) {
		Outter outter = new Outter();

		Outter.Nested nested = outter.new Nested();

		nested.print();
	}

}
