package com.javaStudy.pattern;

import java.util.regex.Pattern;

public class Main {

	public static void main(String[] args) {
		String regExp = "(02|010)-\\d{3,4}-\\d{4}";
		String data = "00-1234-1234";
		if (Pattern.matches(regExp, data)) {
			System.out.println("정규식과 일치");
		} else {
			System.out.println("정규식과 불일치");
		}

	}

}
