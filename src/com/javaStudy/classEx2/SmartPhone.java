package com.javaStudy.classEx2;

import java.util.Scanner;

public class SmartPhone {

	Addr[] addrs;
	int numOfCount = 0;
	Scanner in;

	//생성자 
	public SmartPhone() {
		addrs = new Addr[10];
		in = new Scanner(System.in);
	}

	//Addr 형으로 리턴
	public Addr inputAddrData() {

		System.out.print("이름 :");
		String name = in.nextLine();
		System.out.print("전화번호 :");
		String phoneNumber = in.nextLine();
		System.out.print("이메일 :");
		String email = in.nextLine();
		System.out.print("주소 :");
		String address = in.nextLine();
		System.out.print("그룹 :");
		String group = in.nextLine();

		return new Addr(name, phoneNumber, email, address, group);
	}

	// Addr형으로 값을 받아서 addrs 배열에 자징
	void addrAddr(Addr addr) {
		addrs[numOfCount] = addr;
		numOfCount++;
		System.out.println(">>> 데이터가 저장되었습니다. (" + (numOfCount ) + ")");
	}

	// Addr형으로 받아서 출력하는 메소드
	void printAddr(Addr addr) {
		System.out.println("------------------");
		System.out.println("입력된 데이터");
		System.out.println("이름 \t:\t" + addr.getName());
		System.out.println("전화번호\t:\t" + addr.getPhoneNumber());
		System.out.println("이메일 \t:\t" + addr.getEmail());
		System.out.println("주소 \t:\t" + addr.getAddr());
		System.out.println("그룹 \t:\t" + addr.getGroup());
		System.out.println("------------------");
	}

	// 출력을 메소드 크기까지 반
	void printAllAddr() {
		for (int i = 0; i < numOfCount; i++) {
			printAddr(addrs[i]);
		}
	}

	void searchAddr(String name) {

		for (int i = 0; i < numOfCount; i++) {
			Addr addr = addrs[i];
			if (addr.getName().contentEquals(name)) {
				printAddr(addr);
				return;
			}
		}
		System.out.println("검색결과가 없습니다.");
	}

	void deleteAddr(String name) {

		for (int i = 0; i < numOfCount; i++) {
			Addr addr = addrs[i];
			if (addr.getName().contentEquals(name)) {
				for (int j = i; j < numOfCount; j++) {
					addrs[j] = addrs[j + 1];
				}
				numOfCount--;
				return;
			}

		}
		System.out.println("검색결과가 없습니다.");
	}

	void editAddr(String name, Addr newContact) {

		for (int i = 0; i < numOfCount; i++) {
			Addr addr = addrs[i];
			if (addr.getName().contentEquals(name)) {
				// addrData(i);
				addr = newContact;
				return;
			}
		}
		System.out.println("검색결과가 없습니다.");

	}
	
	
	
}
