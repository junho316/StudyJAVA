package com.javaStudy.bubbleSort;

import java.util.Arrays;

public class SortClass {

	void arrSort(int[] intArr) {
		for (int i = 0; i < intArr.length - 1; i++) {
			System.out.println("Sorted Data " + (i + 1) + "단계");
			for (int j = 0; j < intArr.length - i - 1; j++) {
				if (intArr[j] > intArr[j + 1]) {
					arrSwap(intArr, i, j);
				}
				System.out.println(Arrays.toString(intArr));
			}
		}
	}

	int[] arrSwap(int[] intArr, int i, int j) {
		int temp;
		temp = intArr[j];
		intArr[j] = intArr[j + 1];
		intArr[j + 1] = temp;
		return intArr;
	}
}
