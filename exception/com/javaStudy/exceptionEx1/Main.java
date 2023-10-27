package com.javaStudy.exceptionEx1;

public class Main {

	public static void main(String[] args) {

		try {
			Class clazz = Class.forName("java.lang.String8");
			System.out.println("클래스 존재");
		} catch (ClassNotFoundException e) {
			System.out.println("클래스가 존재하지 않습니다.");
		} finally {
			System.out.println("finally");
		}

	}

}
