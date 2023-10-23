package com.javaStudy.classDiagramEx4;

public class Student {

	private String name;
	private Transcript transcript;

	public Student(String name) {
		this.name = name;
	}

	public void addTranscript(Transcript transcript) {
		this.transcript = transcript;
	}

	public String getName() {
		return name;
	}

	public Course getCourses() {
		return transcript.getCourse();
	}

}
