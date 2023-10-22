package com.javaStudy.cla;

import java.util.Scanner;

public class Member {

	String name;
	int age;
	double height;
	boolean hasBook;
	
	public static void main(String[] args) {		
		Scanner scanner = new Scanner(System.in);
		System.out.print("태어난 해 : ");
		int year = scanner.nextInt();
		
		checkVaccin(year);
		checkHealth(year);
		
		scanner.close();
	}
	
	static void checkVaccin(int year) {
		int age = 2023 - year;
		if(age < 13 || age >= 60) {
			System.out.println("무료 예방접종이 가능합니다.");
		}else {
			System.out.println("무료 예방접종 대상이 아닙니다.");
		}
		
	}
	static void checkHealth(int year) {
		int age = 2023 - year;
		if (age >= 20) {
			System.out.println("2년 마다 무료로 건강검진이 가능합니다.");
			
			if(year % 2 == 0 ) {
				System.out.println("올해 검사 대상입니다.");
			}
			if( age >= 40) {
				System.out.println("암검사도 무료로 가능합니다.");
			}
		}else {
			System.out.println("건강검진 대상자가 아닙니다.");
		}
		
	}
}