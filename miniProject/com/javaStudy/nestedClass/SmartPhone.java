package com.javaStudy.nestedClass;

import java.util.Scanner;

public class SmartPhone {

	private Addr[] addrs;
	private int number = 0;
	Scanner scanner;

	public SmartPhone() {
		scanner = new Scanner(System.in);
		addrs = new Addr[3];
	}

	public Addr inputAddrData(String group) {
		System.out.print("이름\t:\t");
		String name = scanner.nextLine();
		System.out.print("전화번호\t:\t");
		String phoneNumber = scanner.nextLine();
		System.out.print("이메일\t:\t");
		String email = scanner.nextLine();
		System.out.print("주소\t:\t");
		String address = scanner.nextLine();
		System.out.println("그룹\t:\t" + group);
		// String group = scanner.nextLine();

		if (group.equals("회사")) {
			System.out.print("회사이름\t:\t");
			String companyName = scanner.nextLine();
			System.out.print("부서이름\t:\t");
			String department = scanner.nextLine();
			System.out.print("직급\t:\t");
			String rank = scanner.nextLine();
			return new CompanyAddr(name, phoneNumber, email, address, group, companyName, department, rank);
		} else if (group.equals("거래처")) {
			System.out.print("거래처 이름\t:\t");
			String customerName = scanner.nextLine();
			System.out.print("품목이름\t:\t");
			String itemName = scanner.nextLine();
			System.out.print("직급\t:\t");
			String rank = scanner.nextLine();
			return new CustomerAddr(itemName, phoneNumber, email, address, group, customerName, itemName, rank);
		} else {
			return new Addr(name, phoneNumber, email, address, group);
		}

	}

	public void addAddr(Addr addr) {
		addrs[number] = addr;
		number++;

		if (number == addrs.length) {
			Addr[] temp = addrs;
			addrs = new Addr[number + 1];
			for (int i = 0; i < number; i++) {
				addrs[i] = temp[i];
			}
		}
	}

	public void printAddr(Addr addr) {
		addr.print();
	}

	public void printAllAddr() {
		for (int i = 0; i < number; i++) {
			printAddr(addrs[i]);
		}
	}

	public void searchAddr(String name) {
		for (int i = 0; i < number; i++) {
			if (addrs[i].getName().equals(name)) {
				printAddr(addrs[i]);
				return;
			}
		}
		System.out.println("잘못된 입력입니다.");
	}

	public void deleteAddr(String name) {
		for (int i = 0; i < number; i++) {
			if (addrs[i].getName().contentEquals(name)) {
				for (int j = i; j < number; j++) {
					addrs[j] = addrs[j + 1];
				}
				number--;
				return;
			}
		}
		System.out.println("잘못된 입력입니다.");
	}

	public void editAddr(String name, Addr newContact) {
		for (int i = 0; i < number; i++) {
			if (addrs[i].getName().equals(name)) {
				addrs[i] = newContact;
				return;
			}
		}
		System.out.println("잘못된 입력입니다.");
	}

}
