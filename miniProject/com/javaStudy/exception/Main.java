package com.javaStudy.exception;

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
				smartPhone.addAddr(smartPhone.inputAddrData("회사"));
				break;
			case "2":
				smartPhone.addAddr(smartPhone.inputAddrData("거래처"));
				break;
			case "3":
				smartPhone.printAllAddr();
				break;
			case "4":
				System.out.print("검색할 이름은?\t");
				String searchName = scanner.nextLine();
				smartPhone.searchAddr(searchName);
				break;
			case "5":
				System.out.print("삭제할 이름은?\t");
				String deleteName = scanner.nextLine();
				smartPhone.deleteAddr(deleteName);
				break;
			case "6":
				System.out.print("수정할 이름은?\t");
				String editName = scanner.nextLine();
				Addr addr = smartPhone.searchAddr(editName);
				System.out.println("데이터를 새로 입력헤주세요");
				if (addr instanceof CompanyAddr) {
					smartPhone.editAddr(editName, smartPhone.inputAddrData("회사"));
				} else if (addr instanceof CustomerAddr) {
					smartPhone.editAddr(editName, smartPhone.inputAddrData("거래처"));
				}
				break;
			case "7":
				scanner.close();
				System.exit(0);
				break;
			default:
				System.out.println("잘못 입력했습니다.");
				break;
			}

		}

	}

	public static void printMenu() {
		System.out.println("-----------------");
		System.out.println(">> 1. 연락처 등록(회사)");
		System.out.println(">> 2. 연락처 등록(거래처)");
		System.out.println(">> 3. 모든연락처출력");
		System.out.println(">> 4. 연락처 검색");
		System.out.println(">> 5. 연락처 삭제");
		System.out.println(">> 6. 연락처 수정");
		System.out.println(">> 7. 프로그램종료");
		System.out.println("-----------------");

	}

}
