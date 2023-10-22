package com.javaStudy.referenceType;

import java.util.Random;
import java.util.Scanner;

public class ArrayRandom {

	public static void main(String[] args) {

		Random random = new Random();
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("인덱스 수 : ");
		int arrLen = scanner.nextInt();
		
		int[] arr = new int[arrLen];
		
		for (int i = 0; i < arr.length; i++) {
			arr[i] = random.nextInt(10) + 1;
			System.out.println("arr[" + i + "] = " + arr[i]);
		}
	
		scanner.close();
	}

}
