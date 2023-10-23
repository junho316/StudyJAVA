package com.javaStudy.classDiagramEx4;

public class Main {

	public static void main(String[] args) {

		Student s1 = new Student("홍길동");

		Course c1 = new Course("sw");

		Transcript t1 = new Transcript(s1, c1);

		t1.setDate("10.23");
		t1.setGrade("A");
		
		
	
	
	}
}
