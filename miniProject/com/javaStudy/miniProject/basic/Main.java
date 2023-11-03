package com.javaStudy.miniProject.basic;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		SmartPhone smartPhone = new SmartPhone();
		Scanner scanner = new Scanner(System.in);
		

		while (true) {
			printMenu();
			int menuNumber = scanner.nextInt();
			scanner.nextLine();

			switch (menuNumber) {
			case 1:
				smartPhone.addAddr(smartPhone.inputData());
				break;
			case 2:
				smartPhone.printAll();
				break;
			case 3:
				System.out.println("검색할 이름은?");
				smartPhone.searchAddr(scanner.nextLine());
				break;
			case 4:
				System.out.println("삭제할 이름은?");
				smartPhone.deleteAddr(scanner.nextLine());
				break;
			case 5:
				System.out.println("수정할 이름은?");
				smartPhone.editAddr(scanner.nextLine(), smartPhone.inputData());
				break;
			case 6:
				scanner.close();
				System.exit(0);
				break;
			default:
				System.out.println("잘못된 입력");
				break;
			}
		}
	}

	public static void printMenu() {
		System.out.println("------------------------");
		System.out.println("1. 등록");
		System.out.println("2. 모두출력");
		System.out.println("3. 검색");
		System.out.println("4. 삭제");
		System.out.println("5. 수정");
		System.out.println("6. 종료");
		System.out.println("------------------------");
	}

}
