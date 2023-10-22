package com.javaStudy.referenceType;

import java.util.Scanner;

public class Achievement {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("사람은 몇명?");
		int num = scanner.nextInt();
		int[] peoples = new int[num]; 
		
		int sum = 0;
		int max = 0;
		int min = 0;
		
		for(int i = 0; i < num; i++) {
			System.out.print((i + 1) + "번 점수 입력 ");
			peoples[i] = scanner.nextInt();
			sum += peoples[i];
			
			if (i == 0) {
				max = peoples[0];
				min = peoples[0];
			}
			if(peoples[i] > max) {
				max = peoples[i];
			} 
			if(peoples[i] < min) {
				min = peoples[i];
			}
		}
		
		System.out.println("합계는 " + sum + "점 입니다.");
		System.out.println("평균은 " + (float)sum / num + "점 입니다.");
		System.out.println("최고점은 " + max + "점 입니다.");
		System.out.println("최저점은 " + min + "점 입니다.");
		
		scanner.close();
	}	
}


