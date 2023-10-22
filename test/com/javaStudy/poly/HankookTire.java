package com.javaStudy.poly;

public class HankookTire extends Tire {

	public HankookTire(String location, int maxRotation) {
		super(location, maxRotation);
	}

	@Override
	public boolean roll() {
		++accmulatedRotation;
		if(accmulatedRotation<maxRotation) {
			System.out.println(location + "\tHankookTire 수명\t " + ( maxRotation -accmulatedRotation ) + "회");
			return true;
		}else {
			System.out.println("***" + location + "HankookTire 평크 ***");
			return false;
		}
	}
}
