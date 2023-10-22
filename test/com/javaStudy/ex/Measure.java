package com.javaStudy.ex;

import java.util.Scanner;

public class Measure {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("변수 A: ");
		int varA = scanner.nextInt();	
		
		System.out.println("변수 B: ");
		int varB = scanner.nextInt();	
		
		if( varA % varB == 0) {
			System.out.print("B는 A의 약수입니다.");
		}else {
			System.out.print("B는 A의 약수가 아니다.");
		}
		
		scanner.close();	
	}
}