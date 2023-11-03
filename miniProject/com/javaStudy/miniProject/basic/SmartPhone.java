package com.javaStudy.miniProject.basic;

import java.util.Scanner;

public class SmartPhone {

	Addr[] addrs;
	Scanner scanner;
	int numberCount = 0;

	public SmartPhone() {
		addrs = new Addr[3];
		scanner = new Scanner(System.in);
	}

	public Addr inputData() {
		System.out.print("이름? ");
		String name = scanner.nextLine();
		System.out.print("전화번호? ");
		String phoneNumber = scanner.nextLine();
		System.out.print("주소 ? ");
		String address = scanner.nextLine();
		System.out.print("그룹? ");
		String group = scanner.nextLine();
		System.out.print("이메일 ?");
		String email = scanner.nextLine();

		return new Addr(name, phoneNumber, address, group, email);
	}

	public void addAddr(Addr addr) {
		addrs[numberCount] = addr;

		numberCount++;
		System.out.println("Addr등록 (" + numberCount + ")");
	}

	public void printAddr(Addr addr) {
		System.out.println("------------------------");
		System.out.println("이름\t:\t" + addr.getName());
		System.out.println("전화번호\t:\t" + addr.getPhoneNumber());
		System.out.println("주소\t:\t" + addr.getAddress());
		System.out.println("그룹\t:\t" + addr.getGroup());
		System.out.println("이메일\t:\t" + addr.getEmail());
		System.out.println("------------------------");
	}

	public void printAll() {
		for (int i = 0; i < numberCount; i++) {
			printAddr(addrs[i]);
		}
	}

	public void searchAddr(String name) {
		for (int i = 0; i < numberCount; i++) {
			if (name.contentEquals(addrs[i].getName())) {
				printAddr(addrs[i]);
				return;
			}
		}
		System.out.println("잘못된 입력");
	}

	public void deleteAddr(String name) {
		for (int i = 0; i < numberCount; i++) {
			if (name.contentEquals(addrs[i].getName())) {
				for (int j = i; j < numberCount; j++) {
					addrs[j] = addrs[j + 1];
				}
				numberCount--;
				System.out.println("삭제 성공");
				return;
			}
		}
		System.out.println("잘못된 입력");
	}

	public void editAddr(String name, Addr newAddr) {
		for (int i = 0; i < numberCount; i++) {
			if (name.contentEquals(addrs[i].getName())) {
				addrs[i] = newAddr;
				System.out.println("수정 성공");
				return;
			}
		}
		System.out.println("잘못된 입력");
	}

}
