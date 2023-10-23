package com.javaStudy.classDiagramEx4;

import java.util.ArrayList;

public class Transcript {

	private ArrayList<Student> students = new ArrayList<Student>();
	private ArrayList<Course> courses = new ArrayList<Course>();
	private String date, grade;

	public Transcript(Student student, Course course) {
		students.add(student);
		courses.add(course);
	}

	public Student getStudent() {
		return null;
	}

	public Course getCourse() {
		return null;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public String getGrade() {
		return grade;
	}

	public void setGrade(String grade) {
		this.grade = grade;
	}

}
