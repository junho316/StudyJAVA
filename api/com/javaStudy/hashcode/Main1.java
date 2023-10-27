package com.javaStudy.hashcode;

public class Main1 {

	public static void main(String[] args) {
		Object obj1 = new Object();
		Object obj2 = new Object();
		
		System.out.println(System.identityHashCode(obj1));
		System.out.println(System.identityHashCode(obj2));
		
		if (obj1.equals(obj2)) {
			System.out.println("O");
		} else {
			System.out.println("xx");
		}
	}

}
