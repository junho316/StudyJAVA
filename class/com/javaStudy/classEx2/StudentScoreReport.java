package com.javaStudy.classEx2;

public class StudentScoreReport {

	public static void main(String[] args) {
		
		//국,영,수 점수 배열
		String[] nameArr = {"가가가", "나나나", "다다다", "라라라", "마마마", "바바바", "사사사", "아아아", "자자자", "차차차"}; 
		int[] korArr = {100, 70, 80, 60, 50, 70, 90, 90, 80, 100};
		int[] matArr = {70, 80, 70, 80, 60, 50, 90, 80, 70, 80};
		int[] engArr = {80, 60, 70, 80, 70, 60, 50, 90, 90, 90};
		
		System.out.println("### Score Report ###");
		System.out.println("국어\t수학\t영어\t|\t총합\t평균");
		System.out.println("-------------------------------------------");
		
		//Student 형으로 배열 생성
		Student[] students = new Student[10];
		
		//for문 이용해서 값입력, 출력
		for(int i = 0; i < 10; i++ ) {
			students[i] = new Student();
			students[i].setName(nameArr[i]);
			students[i].setKor(korArr[i]);
			students[i].setMat(matArr[i]);
			students[i].setEng(engArr[i]);
			students[i].calAvg();
			students[i].printInfo();
		}

	}

}
