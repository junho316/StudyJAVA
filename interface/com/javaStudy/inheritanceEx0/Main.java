package com.javaStudy.inheritanceEx0;

public class Main {

	public static void main(String[] args) {

		System.out.println("본점");
		HeadOffice chineseRest = new HeadOffice();
		chineseRest.printAll();
		System.out.println("-------------");
		
		System.out.println("1호점");
		chineseRest = new FirstOffice();
		chineseRest.printAll();
		System.out.println("-------------");
		
		System.out.println("2호점");
		chineseRest = new SecondOffice();
		chineseRest.printAll();
		System.out.println("-------------");
		
		System.out.println("3호점");
		chineseRest = new ThirdOffice();
		chineseRest.printAll();
		System.out.println("-------------");
			
	}

}
