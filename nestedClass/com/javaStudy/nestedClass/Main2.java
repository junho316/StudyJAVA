package com.javaStudy.nestedClass;

public class Main2 {

	public static void main(String[] args) {
		A.C c = new A.C();

		A a = new A();

		A.B b = a.new B();

		a.method();

		b.field1 = 3;
		c.field1 = 4;
		c.field2 = 5;

		System.out.println("B field1 " + b.field1);
		System.out.println("C field1 " + c.field1);
		System.out.println("C field2 " + c.field2);

	}

}
