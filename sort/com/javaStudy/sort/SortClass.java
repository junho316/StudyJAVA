package com.javaStudy.sort;

import java.util.Arrays;

public class SortClass {

	void arrSort(int[] intArr) {
		for (int i = 0; i < intArr.length - 1; i++) {
			int minIdx = i;
			for (int j = i; j < intArr.length; j++) {
				if (intArr[j] < intArr[minIdx]) {
					minIdx = j;	
				}
			}
			arrSwap(intArr, i, minIdx);
			System.out.println("Sorted Data " + (i + 1) + "단계 : " + Arrays.toString(intArr));
		}
	}

	int[] arrSwap(int[] intArr, int i, int j) {
		int temp;
		temp = intArr[i];
		intArr[i] = intArr[j];
		intArr[j] = temp;
		return intArr;
	}
}
