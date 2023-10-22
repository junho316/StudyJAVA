package com.javaStudy.ex;

import java.util.*;

public class DivThree {

	public static void main(String[] args) {
		Scanner scanner  = new Scanner(System.in);
		System.out.println("정수값 :");
		
		int var = scanner.nextInt();
		
		if ( var % 3 == 0 && var > 0) {
			System.out.print("이 값 3으로 나누어집니다.");
		} else if(var % 3 != 0 && var > 0){
			System.out.print("이 값 3으로 나눈 나머지는 " + var % 3 +"입니다.");
		}else {
			System.out.print("양수가 아닌 값을 입력했네요");
		}	
		
		scanner.close();
	}

}
