package com.javaStudy.referenceType;

public class ArrayCreateByValueList {

	public static void main(String[] args) {

		ArrayCreateByValueList test1 = new ArrayCreateByValueList();

		
		int[] scores;
		int sum1 = 0;
		scores = new int[] {1,2,3};
		
		for (int i = 0; i < 3; i++) {
			sum1 += scores[i];
		}
		
		System.out.println("총합 : " + sum1);
	

		System.out.println( test1.add(new int[] {10,20,30}));
	}
	
	public  int add(int[] scores) {
		int sum = 0;

		for (int i = 0; i < 3; i++) {
			sum += scores[i];
		}	

		return sum;
	}

	public static int add1(int[] scores) {
		int sum = 0;

		for (int i = 0; i < 3; i++) {
			sum += scores[i];
		}	

		return sum;
	}
}
