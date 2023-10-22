package com.javaStudy.absClassEx;

public abstract class LunchMenu {

	Price price = new Price();
	int toalPrice = 0;
	boolean order;
	
	void rice() {
		order(true, price.rice);
	}
	
	void bulgogi() {
		order(true, price.bulgogi);
	}
		
	abstract void banana();
	abstract void milk();
	abstract void almond();
	
	void test() {
		rice();
		bulgogi();
		banana();
		milk();
		almond();
		
	}
	
	void order(boolean bool, int price) {
		if(bool) {
			toalPrice += price;
		}
	}
}
