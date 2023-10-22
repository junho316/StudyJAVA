package com.javaStudy.classEx;

import java.util.Scanner;

public class AccountMain {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		
		System.out.println("계좌 정보를 입력하세요");
		System.out.print("계좌명의 : ");
		String name = scanner.next();
		System.out.print("계좌번호 : ");
		int accountNumber = scanner.nextInt();
		System.out.print("잔고 : ");		
		int balance = scanner.nextInt();
		
		Account account = new Account(name, accountNumber, balance);
		System.out.println("계좌 기본 정보 :{" + account.getName() + "," + account.getNo() + "," + account.getBalance() + "}");

		System.out.print("출금액 : ");		
		int deposit = scanner.nextInt();
		account.deposit(deposit);
		
		System.out.print("잔금은  " + account.getBalance() + "입니다.");

		scanner.close();
	}

}
