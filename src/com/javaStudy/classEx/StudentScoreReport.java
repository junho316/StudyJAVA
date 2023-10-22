package com.javaStudy.classEx;

public class StudentScoreReport {

	public static void main(String[] args) {
		
		Student[] students = new Student[10];
		
		for (int i = 0; i < 10; i++) {
			students[i] = new Student();
			students[i].setName((i+1) +"번 학생");
			students[i].setKor((int)(Math.random()*101));
			students[i].setMath((int)(Math.random()*101));
			students[i].setEng((int)(Math.random()*101));
			
			students[i].print();
		}
	}
}
