package com.javaStudy.exceptionEx3;

public class Main {

	public static void main(String[] args) {
		Account account = new Account();

		account.deposit(10000);
		System.out.println("예금액" + account.getBalance());

		try {
			account.withdraw(30000);
		} catch (BalanceInsuffientException e) {
			String message = e.getMessage();
			System.out.println(message);
			System.out.println("");
			e.printStackTrace();
		}
	}

}
