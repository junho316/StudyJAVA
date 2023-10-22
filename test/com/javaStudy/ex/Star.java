package com.javaStudy.ex;

import java.util.Scanner;

public class Star {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("몇개의 *를 표시할까요?");
		int starNum = scanner.nextInt();
		
		while (starNum > 0 ) {
			System.out.print("*");
			starNum--;
		}
		scanner.close();
	}

}
