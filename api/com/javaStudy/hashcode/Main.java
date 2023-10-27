package com.javaStudy.hashcode;

import java.util.HashMap;

public class Main {

	public static void main(String[] args) {
		HashMap<Key, String> hashMap = new HashMap<Key, String>();

		Key key = new Key(2);

		hashMap.put(new Key(1), "홍길동");

		String value = hashMap.get(new Key(1));

		System.out.println(value);
	}

}
