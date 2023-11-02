package com.javaStudy.hashMap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Main {

	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<String, Integer>();

		map.put("홍길동", 85);
		map.put("신용권", 80);
		map.put("종장군", 90);
		map.put("홍길동", 95);

		System.out.println("맵 크기" + map.size());

		System.out.println(map.get("홍길동"));
		System.out.println("");

		Set<String> keySet = map.keySet();
		Iterator<String> keyIterator = keySet.iterator();
		while (keyIterator.hasNext()) {
			String key = keyIterator.next();
			Integer value = map.get(key);
			System.out.println(key + ":" + value);
		}

		System.out.println("");
		map.remove("홍길동");
		System.out.println("맵 크기" + map.size());
		System.out.println("");
		
		
		Set<Map.Entry<String, Integer>> entrySet = map.entrySet();
		Iterator<Map.Entry<String, Integer>> entryIterator = entrySet.iterator();
		while (entryIterator.hasNext()) {
			Map.Entry<String, Integer> entry = entryIterator.next();

			String key = entry.getKey();
			Integer value = entry.getValue();
			System.out.println(key + ":" + value);
		}

		map.clear();
		System.out.println("맵 크기" + map.size());
	}

}
