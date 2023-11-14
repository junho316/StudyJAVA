package com.javaStudy.miniProject.io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.util.*;
import java.util.Scanner;

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
		addrs.add(addr);
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

	public void saveAddr() throws IOException {
		OutputStream os = new FileOutputStream("D:/JAVA/addr.db");
		ObjectOutputStream oos = new ObjectOutputStream(os);
		oos.writeObject(addrs);
		oos.flush();
		oos.close();
		os.flush();
		os.close();
	}

	public void loadAddr() throws Exception {
		InputStream is = new FileInputStream("D:/JAVA/addr.db");
		ObjectInputStream ois = new ObjectInputStream(is);
		List<Addr> list = (ArrayList<Addr>) ois.readObject();
		for (Addr addr : list) {
			addrs.add(addr);
		}
	}

	public void printFile() throws Exception {
		InputStream is = new FileInputStream("D:/JAVA/addr.db");
		ObjectInputStream ois = new ObjectInputStream(is);
		List<Addr> list = (ArrayList<Addr>) ois.readObject();
		for (Addr fileAddr : list) {
			System.out.println("이름\t:\t" + fileAddr.getName());
			System.out.println("전화번호\t:\t" + fileAddr.getPhoneNumber());
			System.out.println("이메일\t:\t" + fileAddr.getEmail());
			System.out.println("주소 \t:\t" + fileAddr.getAddress());
			System.out.println("그룹 \t:\t" + fileAddr.getGroup());
			System.out.println("-----------------");
		}
	}
}
