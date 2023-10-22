package com.javaStudy.classEx3;

public class Student extends People {

	int studentNumber;
	
	public Student(String name, String ssn, int studentNumber){
		//super(name,ssn);
		super.name = name;
		super.ssn = ssn;
		this.studentNumber = studentNumber;
	}
}
