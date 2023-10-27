package com.javaStudy.exceptionEx2;

public class Main {

	public static void main(String[] args) {
		Main main = new Main();

		try {
			main.findClass();
			System.out.println("클래스 찾음");
		} catch (ClassNotFoundException e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		} finally {
			System.out.println("finally");
		}

	}

	public void findClass() throws ClassNotFoundException {
		Class clazz = Class.forName("java.lang.String1");
	}

}
