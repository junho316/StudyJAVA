package com.javaStudy.cla;

public class Calculator {

	int firstNum;
	int secondNum;
	
	public Calculator(int firstNum, int secondNum) {
		this.firstNum = firstNum;
		this.secondNum = secondNum;
	}
	
	int plus(){
		return firstNum + secondNum;
	}
	int subtract(){
		return firstNum - secondNum;
	}
	int multiply(){
		return firstNum * secondNum;
	}
	int divide(){
		return firstNum / secondNum;
	}
	
}
