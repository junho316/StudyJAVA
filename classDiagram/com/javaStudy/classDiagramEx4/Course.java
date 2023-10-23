package com.javaStudy.classDiagramEx4;

public class Course {

	private String name;
	private Transcript transcript;

	public Course(String name) {
		this.name = name;
	}

	public void addTranscript(Transcript transcript) {
		this.transcript = transcript;
	}

	public String getName() {
		return name;
	}
}
