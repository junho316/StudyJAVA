package com.javaStudy.referenceType;

public class StringEqualsExample {

	public static void main(String[] args) {

		String str1 = "123";
		String str2 = "123";
		
		if (str1 == str2) {
			System.out.println("메모리주소 같다");
		}else {
			System.out.println("메모리주소 다르다");
		}
		
		if (str1.equals(str2)) {
			System.out.println("값 같다");
		}else {
			System.out.println("값 다르다");
		}
		
		String str3 = new String("123");
		String str4 = new String("123");
		
		if (str3 == str4) {
			System.out.println("메모리주소 같다");
		}else {
			System.out.println("메모리주소 다르다");
		}
		
		if (str3.equals(str4)) {
			System.out.println("값 같다");
		}else {
			System.out.println("값 다르다");
		}

	}

}
