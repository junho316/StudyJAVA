package com.javaStudy.exceptionEx;

public class Main {

	public static void main(String[] args) {
		if (args.length == 2) {
			String data1 = args[0];
			String data2 = args[1];

			System.out.println("arg[0] : " + data1);
			System.out.println("arg[1] : " + data2);
		} else {
			System.out.println("두개의  실행 매개값이 필요합니다.");
		}

	}

}
