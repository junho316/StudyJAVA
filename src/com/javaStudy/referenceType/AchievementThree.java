package com.javaStudy.referenceType;

import java.util.Scanner;

public class AchievementThree {

	public static void main(String[] args) {
	
		Scanner scanner = new Scanner(System.in);
		
		int[][] arr = new int[3][3];
		double avgEng = 0;
		double avgMat = 0;
		
		System.out.println("3명의 영어, 수학 점수를 입력하세요.");
		for (int i = 0; i < 3; i++) {		
				System.out.print((i + 1) + "번\t영어 : ");
				arr[i][0] = scanner.nextInt();
				System.out.print( "\t수학 : ");
				arr[i][1] = scanner.nextInt();		
				arr[i][2] = (arr[i][1] + arr[i][0]) /2;
		}
		
		System.out.println("No.\t영어\t수학\t평균");
		for(int i = 0; i < 3; i++) {
			avgEng += arr[i][0];
			avgMat += arr[i][1];
			
			System.out.print(i + "\t");
			for(int j = 0; j < 3; j++) {
				System.out.print(arr[i][j] +"\t");
			}
			System.out.println("");	
		}
		
		avgEng = Math.round(avgEng / 3 * 10) / 10.0;
		avgMat = Math.round(avgMat / 3 * 10) / 10.0;
		System.out.print("평균\t"+ avgEng + "\t" + avgMat);
			
		scanner.close();
	}

}
