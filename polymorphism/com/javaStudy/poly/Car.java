package com.javaStudy.poly;

public class Car {

	Tire frontLeftTire =  new Tire("앞왼쪽", 6);
	Tire frontRightTire =  new Tire("앞오룬쪽", 2);
	Tire backLefTire = new Tire("뒤왼쪽", 3);
	Tire backRighTire = new Tire("뒤 오른쪽", 4);
	
	int run() {
		System.out.println("[자동차가 달립니다.]");
		if (frontLeftTire.roll()==false) {
			stop();
			return 1;
		}
		if (frontRightTire.roll() == false) {
			stop();
			return 2;
		}
		if (backLefTire.roll() == false) {
			stop();
			return 3;
		}
		if (backRighTire.roll() == false) {
			stop();
			return 4;
		}
		return 0;
	}
	
	void stop() {
		System.out.println("[자동차가 멈춥니다.]");
	}
}
