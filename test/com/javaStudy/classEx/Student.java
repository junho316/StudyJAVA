package com.javaStudy.classEx;

public class Student {

	private String name;
	private int kor;
	private int mat;
	private int eng;
	private int total;
	private int avg;	
	
	void print() {
		avg = Math.round((kor + mat + eng)/3);
		total = kor + mat + eng;
		System.out.println(name);
		System.out.println("국어 : " + kor);
		System.out.println("수학 : " + mat);
		System.out.println("영어 : " + eng);
		System.out.println("총합 : " + total);
		System.out.println("평균 : " + avg);
		System.out.println("----------");
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getKor() {
		return kor;
	}
	public void setKor(int kor) {
		this.kor = kor;
	}
	public int getMath() {
		return mat;
	}
	public void setMath(int math) {
		this.mat = math;
	}
	public int getEng() {
		return eng;
	}
	public void setEng(int eng) {
		this.eng = eng;
	}

}