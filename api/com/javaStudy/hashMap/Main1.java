package com.javaStudy.hashMap;

import java.util.HashMap;
import java.util.Map;

public class Main1 {

	public static void main(String[] args) {

		Map<Student, Integer> map = new HashMap<Student, Integer>();

		map.put(new Student(1, "홍길동"), 1);
		map.put(new Student(1, "홍길동"), 1);

		System.out.println(map.size());
	}

}

