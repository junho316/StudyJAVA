package com.javaStudy.sort.copy;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		List<Integer> intList = new ArrayList<Integer>();
		SortClass sortClass = new SortClass();

		intList.add(69);
		intList.add(10);
		intList.add(30);
		intList.add(2);
		intList.add(16);
		intList.add(8);
		intList.add(31);
		intList.add(22);
		
		System.out.println("Input Data : " + intList.toString());
		sortClass.arrSort(intList);
	}

}