package com.javaStudy.absClassEx;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Student1 student1 = new Student1();
		Student2 student2 = new Student2();
		
		student1.test();
		student2.test();
		System.out.println("Student1의 식비" + student1.toalPrice);
		System.out.println(student2.toalPrice);
	}

}
