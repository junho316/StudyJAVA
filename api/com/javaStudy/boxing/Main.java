package com.javaStudy.boxing;

public class Main {

	public static void main(String[] args) {
		Integer obj1 = new Integer(100);
		Integer obj2 = new Integer("200");
		Integer obj3 = Integer.valueOf("300");

		int value1 = obj1.intValue();
		int value2 = obj2.intValue();
		int value3 = obj3.intValue();

		System.out.println(obj1 + "  " + value1);
		System.out.println(obj2 + "  " + value2);
		System.out.println(obj3 + "  " + value3);

	}

}
