package com.javaStudy.classEx2;

import java.util.Scanner;

public class AddrMain {

	public static void main(String[] args) {

		String name, phoneNumber, email, addr, group;
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("이름 : ");
		name = scanner.next();
		System.out.print("전화번호 : ");
		phoneNumber = scanner.next();
		System.out.print("이메일 : ");
		email = scanner.next();
		System.out.print("주소 : ");
		addr = scanner.next();
		System.out.print("그룹 : ");
		group = scanner.next();
		
		while (!group.equals("친구") && !group.equals("가족")) {
			System.out.print("그룹은 친구 or 가족 다시 입력 ");
			group = scanner.next();
		}
		
		Addr address = new Addr(name, phoneNumber, email, addr, group);
	
		address.printInfo();
		
		System.out.println("--------------------");
		System.out.println("그룹 정보 변경");
		System.out.println("--------------------");
		
		if(group.equals("친구")) {
			address.setGroup("가족");
		}else {
			address.setGroup("친구");
		}
		
		address.printInfo();
		
		scanner.close();
	}

}
