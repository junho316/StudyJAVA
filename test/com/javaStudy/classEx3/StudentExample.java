package com.javaStudy.classEx3;

public class StudentExample {

	public static void main(String[] args) {
		Student student = new Student("이름", "주민번호", 1);
		System.out.println(student.name);
		System.out.println(student.ssn);
		System.out.println(student.studentNumber);
		System.out.println(student);
		
		People people = student;
		System.out.println(people.name);
		System.out.println(people.ssn);
		System.out.println(people);
		
		if(people instanceof Student) {
			Student student2 = (Student) people;
			System.out.println(student2.name);
			System.out.println(student2.ssn);
			System.out.println(student2.studentNumber);
			System.out.println(student2);
		}
	}

}
