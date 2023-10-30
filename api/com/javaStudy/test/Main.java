package com.javaStudy.test;

public class Main {

	public static void main(String[] args) {

		Integer temp = new Integer("10");
		Integer temp1 = new Integer(10);
		Integer temp2 = Integer.valueOf(10);	
		
		System.out.println(temp.intValue());
		System.out.println(temp1.intValue());
		System.out.println(temp2.intValue());
		
		
	}

}
