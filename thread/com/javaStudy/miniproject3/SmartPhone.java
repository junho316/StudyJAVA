package com.javaStudy.miniproject3;

import java.util.*;
import java.util.Scanner;
import java.util.regex.Pattern;

public class SmartPhone {

	private List<Addr> addrs;;
	Scanner scanner;

	public SmartPhone() {
		addrs = new ArrayList<Addr>();
		scanner = new Scanner(System.in);
	}

	public Addr inputAddrData(String groupAr) {

		System.out.print("이름\t:\t");
		String name = scanner.nextLine();
		System.out.print("전화번호\t:\t");
		String phoneNumber = scanner.nextLine();
		System.out.print("이메일\t:\t");
		String email = scanner.nextLine();
		System.out.print("주소\t:\t");
		String address = scanner.nextLine();
		String group;

		if (groupAr != null) {
			System.out.println("그룹\t:\t" + groupAr);
			group = groupAr;
		} else {
			System.out.print("그룹\t:\t");
			group = scanner.nextLine();
		}

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

		try {
			nameException(addr);
			phoneException(addr);
			addrs.add(addr);

		} catch (NameException e) {
			String message = e.getMessage();
			System.out.println(message);
			System.out.println("");
			e.printStackTrace();
		} catch (PhoneNumberException e) {
			String message = e.getMessage();
			System.out.println(message);
			System.out.println("");
			e.printStackTrace();
		}

	}

	public void printAddr(Addr addr) {
		addr.print();
	}

	public void printAllAddr() {
		for (Addr addr : addrs) {
			printAddr(addr);
		}
	}

	public Addr searchAddr(String name) {
		for (Addr addr : addrs) {
			if (addr.getName().equals(name)) {
				printAddr(addr);
				return addr;
			}
		}
		System.out.println("잘못된 입력입니다.");
		return null;
	}

	public void deleteAddr(String name) {
		for (Addr addr : addrs) {
			if (addr.getName().equals(name)) {
				addrs.remove(addr);
				return;
			}
		}
		System.out.println("잘못된 입력입니다.");
	}

	public void editAddr(String name, Addr newContact) {
		for (int i = 0; i < addrs.size(); i++) {
			if (addrs.get(i).getName().equals(name)) {
				addrs.set(i, newContact);
			}
		}
		System.out.println("잘못된 입력입니다.");
	}

	public void nameException(Addr addr) throws NameException {
		String regex = "^[a-zA-Zㄱ-ㅎ가-힣]*$";
		boolean result = Pattern.matches(regex, addr.getName());

		if (!result) {
			throw new NameException("영문자 한글만 허용");
		}
	}

	public void phoneException(Addr addr) throws PhoneNumberException {
		boolean result = Pattern.matches("^\\d{2,3}-\\d{3,4}-\\d{4}$", addr.getPhoneNumber());
		if (!result) {
			throw new PhoneNumberException("전화번호 형식");
		}

		for (Addr addr1 : addrs) {
			if (addr1.getPhoneNumber().equals(addr.getPhoneNumber())) {
				throw new PhoneNumberException("전화번호 중복");
			}
		}
	}
}
