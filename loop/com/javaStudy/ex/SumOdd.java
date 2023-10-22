package com.javaStudy.ex;

public class SumOdd {

	public static void main(String[] args) {

		int sumNum = 0;
		
		for(int i = 1; i <= 100; i++) {
			if (i % 2 != 0) {
				sumNum = sumNum +i;
			}
		}
		
		System.out.print(sumNum);
	}

}
