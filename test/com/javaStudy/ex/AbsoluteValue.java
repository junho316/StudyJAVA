package com.javaStudy.ex;

import java.util.Scanner;

public class AbsoluteValue {

	public static void main(String[] args) {

		System.out.println("정수값: ");
		Scanner scanner = new Scanner(System.in);
		long absValue = scanner.nextLong();	
		
		if (absValue < 0) {
			absValue = absValue * (-1);
		}
	
		System.out.print("절대값은 " + absValue + "입니다.");
		scanner.close();
	}

}
