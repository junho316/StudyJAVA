package com.javaStudy.ex;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("2이상의 정수 값:");
		int num = scanner.nextInt();
		
		boolean primeNumber = true;
		for(int i = 2; i < num; i++) {
			if(num%i == 0) {
				primeNumber = false;
				break; 
			}
		}
		
		System.out.print((primeNumber ? "소수입니다." : "소수가 아닙니다."));
		scanner.close();
	}

}
