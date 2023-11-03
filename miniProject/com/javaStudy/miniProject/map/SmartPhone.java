package com.javaStudy.miniProject.map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class SmartPhone {

	Map<String, Addr> addrsMap;
	Scanner scanner;

	public SmartPhone() {
		scanner = new Scanner(System.in);
		addrsMap = new HashMap<String, Addr>();
	}

	public Addr inputAddrData() {
		System.out.print("전화번호 : ");
		String phoneNumber = scanner.nextLine();

		if (addrsMap.containsKey(phoneNumber)) {
			System.out.println("이미 저정된 번호입니다.");
			return null;
		}

		System.out.print("이름 : ");
		String name = scanner.nextLine();
		System.out.print("이메일 : ");
		String email = scanner.nextLine();
		System.out.print("주소 : ");
		String address = scanner.nextLine();
		System.out.print("그룹 : ");
		String group = scanner.nextLine();
		return new Addr(name, phoneNumber, email, address, group);
	}

	public void addAddr(Addr addr) {
		if (addr != null) {
			addrsMap.put(addr.getPhoneNumber(), addr);
		}
	}

	public void printAddr(Addr addr) {
		addr.print();
	}

	public void printAllAddr() {
		Set<String> keySet = addrsMap.keySet();
		Iterator<String> keyIterator = keySet.iterator();
		while (keyIterator.hasNext()) {
			String key = keyIterator.next();
			printAddr(addrsMap.get(key));
		}
	}

	public void searchAddr(String name) {
		Set<String> keySet = addrsMap.keySet();
		Iterator<String> keyIterator = keySet.iterator();
		while (keyIterator.hasNext()) {
			String key = keyIterator.next();
			if (addrsMap.get(key).getName().equals(name)) {
				printAddr(addrsMap.get(key));
				return;
			}
		}
		System.out.println("잘못된 입력입니다.");
	}

	public void deleteAddr(String name) {
		Set<String> keySet = addrsMap.keySet();
		Iterator<String> keyIterator = keySet.iterator();
		while (keyIterator.hasNext()) {
			String key = keyIterator.next();
			if (addrsMap.get(key).getName().equals(name)) {
				addrsMap.remove(key);
				return;
			}
		}
		System.out.println("잘못된 입력입니다.");
	}

	public void editAddr(String name, Addr newContact) {
		Set<String> keySet = addrsMap.keySet();
		Iterator<String> keyIterator = keySet.iterator();
		while (keyIterator.hasNext()) {
			String key = keyIterator.next();
			if (addrsMap.get(key).getName().equals(name)) {
				if (newContact != null) {
					addrsMap.put(key, newContact);
				}
				return;
			}
		}
		System.out.println("잘못된 입력입니다.");
	}
}
