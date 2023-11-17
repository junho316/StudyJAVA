package com.javaStudy.bubbleSort;

import java.util.Arrays;
import java.util.*;

public class Main {

	public static void main(String[] args) {
		int[] intArr = { 69, 10, 30, 2, 16, 8, 31, 22 };

		SortClass sortClass = new SortClass();

		System.out.println("Input Data : " + Arrays.toString(intArr));
		sortClass.arrSort(intArr);
	}

}