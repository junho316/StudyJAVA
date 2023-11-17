package com.javaStudy.sort.copy;

import java.util.List;

public class SortClass {

	void arrSort(List<Integer> intList) {
		for (int i = 0; i < intList.size() - 1; i++) {
			int minIdx = i;
			for (int j = i; j < intList.size(); j++) {
				if (intList.get(j) < intList.get(minIdx)) {
					minIdx = j;
				}
			}
			listSwap(intList, i, minIdx);
			System.out.println("Sorted Data " + (i + 1) + "단계 : " + intList.toString());
		}		
	}
	
	List<Integer> listSwap(List<Integer> intList, int i, int j) {
		int temp;
		temp = intList.get(i);
		intList.set(i, intList.get(j));
		intList.set(j, temp);
		return intList;
	}
}
