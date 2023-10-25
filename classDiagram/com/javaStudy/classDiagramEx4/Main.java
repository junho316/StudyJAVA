package com.javaStudy.classDiagramEx4;

public class Main {

	public static void main(String[] args) {

		Student s1 = new Student("홍길동");
		Student s2 = new Student("홍길서");
		Student s3 = new Student("홍길남");

		Course c1 = new Course("Software Engineeting");
		Course c2 = new Course("Design Pattern");

		Transcript t1 = new Transcript(s1, c1);
		Transcript t2 = new Transcript(s1, c2);
		Transcript t3 = new Transcript(s2, c2);
		Transcript t4 = new Transcript(s3, c2);

		t2.setDate("2022");
		t1.setGrade("A+");
		t3.setGrade("C+");
		t4.setGrade("B+");

		for (Course courses : s1.getCourses()) {
			System.out.println(courses.getName());
		}

		for (Student student : c2.getStudent()) {
			System.out.println(student.getName());
		}

		System.out.println(t1.toString());

	}
}
