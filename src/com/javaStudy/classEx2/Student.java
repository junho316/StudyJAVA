package com.javaStudy.classEx2;

public class Student {

	//필드 선언
	private String name;
	private int kor;
	private int mat;
	private int eng;
	private int total;
	private int avg;
	
	//Getter, Setter
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
	public int getMat() {
		return mat;
	}
	public void setMat(int mat) {
		this.mat = mat;
	}
	public int getEng() {
		return eng;
	}
	public void setEng(int eng) {
		this.eng = eng;
	}
	public int getTotal() {
		return total;
	}
	public int getAvg() {
		return avg;
	}

	//합, 평균 계산 메
	void calAvg() {
		total = kor + mat + eng;
		avg = total / 3;
	}
	// 출력
	void printInfo() {
		System.out.println(kor + "\t" + mat + "\t" + eng + "\t|\t" + total + "\t" + avg);
	}
}
