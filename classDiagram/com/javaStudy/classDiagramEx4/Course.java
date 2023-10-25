package com.javaStudy.classDiagramEx4;

import java.util.ArrayList;
import java.util.Iterator;

public class Course {

	private String name;
	private ArrayList<Transcript> transcripts = new ArrayList<Transcript>();
	private ArrayList<Student> students = new ArrayList<Student>();

	public Course(String name) {
		this.name = name;
	}

	public void addTranscript(Transcript transcript) {
		transcripts.add(transcript);
	}

	public ArrayList<Student> getStudent() {
		Iterator<Transcript> itrs = transcripts.iterator();
		while (itrs.hasNext()) {
			students.add(itrs.next().getStudent());
		}
		return students;
	}
	
	public String getName() {
		return name;
	}
}
