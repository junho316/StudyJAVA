package com.javaStudy.poly;

public class KumhoTire extends Tire {
	public KumhoTire(String location, int maxRotation) {
		super(location, maxRotation);
	}

	@Override
	public boolean roll() {
		++accmulatedRotation;
		if(accmulatedRotation<maxRotation) {
			System.out.println(location + "\tKumhoTire 수명\t" + ( maxRotation -accmulatedRotation ) + "회");
			return true;
		}else {
			System.out.println("***" + location + "KumhoTire 평크 ***");
			return false;
		}
	}
}
