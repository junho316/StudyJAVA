package com.javaStudy.ex;

import java.util.*;

public class CalEx {

	public static void main(String[] args) {
		
		System.out.print("숫자를 입역하세요 : ");
		Scanner scanner = new Scanner(System.in);
		int i = scanner.nextInt();
	
		System.out.print("입력한 숫자를 3으로 나눈후 나머지 : ");
		System.out.print(i%3);
		
		scanner.close();
	}

}
