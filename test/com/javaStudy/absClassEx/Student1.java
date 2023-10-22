package com.javaStudy.absClassEx;

public class Student1 extends LunchMenu {

	@Override
	void banana() {
		order(false, price.banana);
	}

	@Override
	void milk() {
		order(true, price.milk);
	}

	@Override
	void almond() {
		order(true, price.almond);
	}
	
}
