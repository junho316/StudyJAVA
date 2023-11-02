package com.javaStudy.map1;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		SmartPhone smartPhone = new SmartPhone();
		Scanner scanner = new Scanner(System.in);

		while (true) {
			printMenu();
			String selectMenu = scanner.nextLine();

			switch (selectMenu) {
			case "1":
				smartPhone.addAddr(smartPhone.inputAddrData());
				break;
			case "2":
				smartPhone.printAllAddr();
				break;
			case "3":
				System.out.println("검색할 이름은?");
				String searchName = scanner.nextLine();
				smartPhone.searchAddr(searchName);
				break;
			case "4":
				System.out.println("삭제할 이름은?");
				String deleteName = scanner.nextLine();
				smartPhone.deleteAddr(deleteName);
				break;
			case "5":
				System.out.println("수정할 이름은?");
				String editName = scanner.nextLine();
				smartPhone.editAddr(editName, smartPhone.inputAddrData());
				break;
			case "6":
				scanner.close();
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
