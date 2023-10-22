package com.javaStudy.ex;

import java.util.Scanner;

public class Season {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("몇월인가요");
		int month = scanner.nextInt();
		
		switch (month) {
		case 3: case 4: case 5:
			System.out.print("봄");
			break;
		case 6: case 7: case 8:
			System.out.print("여름");
			break;
		case 9: case 10: case 11:
			System.out.print("가을");
			break;
		case 1: case 2: case 12:
			System.out.print("겨울");
			break;
		default:
			System.out.print("그런월은 없습니다.");
			break;
		}
		scanner.close();
	}

}
