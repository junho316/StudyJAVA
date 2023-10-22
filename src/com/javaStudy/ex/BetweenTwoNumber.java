package com.javaStudy.ex;

import java.util.Scanner;

public class BetweenTwoNumber {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("정수A :");
		int varA = scanner.nextInt();
		System.out.println("정수B :");
		int varB = scanner.nextInt();
		int temp;
		
		if (varB > varA) {
			temp = varA;
			varA = varB;
			varB = temp;
		}
		
		do {
			System.out.println(varB);
			varB++;
		} while (varB <= varA); 

		scanner.close();
	}
}
