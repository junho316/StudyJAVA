package com.javaStudy.classDiagramEx3;

import java.util.ArrayList;

public class Course {

	private ArrayList<Student> students;
	
	public void addStudent(Student student) {
		students.add(student);
	}
	
	public void removeStudent(Student student) {
		students.add(student);
	}
	
	public ArrayList<Student> getStudent() {
		return students;
	}
	public String getName(Student student) {
		
		return student.getName();
	}

	
	
}
