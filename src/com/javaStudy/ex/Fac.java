package com.javaStudy.ex;

import java.util.Scanner;

public class Fac {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("양의 정수 값:");
		int num = scanner.nextInt();
		int numFac = 1;
		
		if (num > 0) {
			for (int i = 1; i <= num; i++ ) {
				numFac = numFac * i;
			}
			System.out.print("1부터 " + num + "까지의 곱은 " + numFac +"입니다.");
		}else {
			System.out.print(num + "은 음수입니다.");
		}
		
		scanner.close();
	}

}
