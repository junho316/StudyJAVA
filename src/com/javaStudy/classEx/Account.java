package com.javaStudy.classEx;

public class Account {

	String name;
	int accountNumber;
	int balance;
	
	public Account(String name, int accountNumber, int balance){
		this.name = name;
		this.accountNumber = accountNumber;
		this.balance = balance;
	}
	
	String getName() {
		return name;
	}
	
	int getNo() {
		return accountNumber;
	}
	
	int getBalance() {
		return balance;
	}
	
	void deposit(int deposit) {
		balance = balance - deposit;
	}
}
