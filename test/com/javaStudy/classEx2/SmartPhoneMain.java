package com.javaStudy.classEx2;

import java.util.Scanner;

public class SmartPhoneMain {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		SmartPhone smartPhone = new SmartPhone();

		// 데이터 2개 입력
		System.out.println("#데이터 2개를 입력합니다.");
		for (int i = 0; i < 2; i++) {

			smartPhone.addrAddr(smartPhone.inputAddrData());
		}

		// 메뉴
		while (true) {
			printMenu();
			String selectMenu = scanner.nextLine();

			switch (selectMenu) {
			case "1":
				Addr a = smartPhone.inputAddrData();
				smartPhone.addrAddr(a);
				break;
			case "2":
				smartPhone.printAllAddr();
				break;
			case "3":
				System.out.print("검색하고자 하는 이름을 입력하세요");
				smartPhone.searchAddr(scanner.nextLine());
				break;
			case "4":
				System.out.print("삭제하고자 하는 이름을 입력하세요");
				smartPhone.deleteAddr(scanner.nextLine());
				break;
			case "5":
				System.out.print("삭제하고자 하는 이름을 입력하세요");
				String name = scanner.nextLine();
				System.out.println("데이터를 새로 입력하세요");
				smartPhone.editAddr(name, smartPhone.inputAddrData());
				break;
			case "6":
				System.exit(0);
				break;

			default:
				System.out.println("defalt");
				break;
			}

		}

	}

	public static void printMenu() {
		System.out.println("주소 관리 메뉴 ---------");
		System.out.println(">> 1. 연락처 등록");
		System.out.println(">> 2. 모든연락처출력");
		System.out.println(">> 3. 연락처 검색");
		System.out.println(">> 4. 연락처 삭제");
		System.out.println(">> 5. 연락처 수정");
		System.out.println(">> 6. 프로그램종료");
		System.out.println("-----------------");
	}
}
