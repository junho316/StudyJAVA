package com.javaStudy.ex;

import java.util.Scanner;

public class StarNewline {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("몇개의 *를 표시할까요?");
		int starNum = scanner.nextInt();
		
		for(int i = 1; i <= starNum; i++) {
			System.out.print("*");
			if(i % 5 == 0) {
				System.out.println("");
			}				
		}
		
		scanner.close();
	}

}
