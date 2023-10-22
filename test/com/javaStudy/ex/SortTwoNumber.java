package com.javaStudy.ex;

import java.util.Scanner;

public class SortTwoNumber {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("정수a :");
		int varA = scanner.nextInt();
		System.out.println("정수b :");
		int varB = scanner.nextInt();
		
		System.out.println("a>=b가 되도록 정렬했습니다.");
		int temp;
		if(varA < varB) {
			temp = varA;
			varA = varB;
			varB = temp;
		}
		
		System.out.println("변수 A는 " + varA + "입니다.");
		System.out.println("변수 B는 " + varB + "입니다.");		
		scanner.close();
	}
}
