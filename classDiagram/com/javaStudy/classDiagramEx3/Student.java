package com.javaStudy.classDiagramEx3;

import java.util.ArrayList;

public class Student {

	private String name;
	private ArrayList<Course> courses;

	public Student(String name) {
		this.name = name;
	}

	public void registerCourse(Course course) {
		courses.add(course);
	}

	public void dropCourse(Course course) {
		courses.remove(course);
	}

	public ArrayList<Course> getCourse() {
		return courses;
	}

	public String getName() {
		return name;
	}

}
