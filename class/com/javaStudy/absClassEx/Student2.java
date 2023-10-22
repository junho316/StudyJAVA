package com.javaStudy.absClassEx;

public class Student2 extends LunchMenu {

	@Override
	void banana() {
		order(true, price.banana);
	}

	@Override
	void milk() {
		order(false, price.milk);
	}

	@Override
	void almond() {
		order(false, price.almond);
	}

}
