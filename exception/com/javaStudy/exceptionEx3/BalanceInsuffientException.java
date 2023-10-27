package com.javaStudy.exceptionEx3;

public class BalanceInsuffientException extends Exception {

	public BalanceInsuffientException() {
	}

	public BalanceInsuffientException(String message) {
		super(message);
	}
}
