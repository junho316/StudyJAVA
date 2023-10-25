package com.javaStudy.classDiagramEx4;

import java.util.ArrayList;
import java.util.Iterator;

public class Student {

	private String name;
	private ArrayList<Transcript> myTranscripts = new ArrayList<Transcript>();
	private ArrayList<Course> myCourses = new ArrayList<Course>();

	public Student(String name) {
		this.name = name;
	}

	public void addTranscript(Transcript transcript) {
		myTranscripts.add(transcript);
	}

	public ArrayList<Course> getCourses() {
		Iterator<Transcript> itrs = myTranscripts.iterator();
		while(itrs.hasNext()) {
			myCourses.add(itrs.next().getCourse());
		}
		return myCourses;
	}

	public String getName() {
		return name;
	}
}
