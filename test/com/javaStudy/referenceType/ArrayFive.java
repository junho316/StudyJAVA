package com.javaStudy.referenceType;

public class ArrayFive {

	public static void main(String[] args) {

		int n = 5;
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = n - i;
			System.out.println("a[" + i + "] = " + arr[i] );
		}
	}
}
