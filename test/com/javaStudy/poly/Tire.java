package com.javaStudy.poly;

public class Tire {

	int maxRotation;
	int accmulatedRotation;
	String location;
	
	public Tire(String location, int maxRotation) {
		this.location = location;
		this.maxRotation = maxRotation;
	}
	
	public boolean roll() {
		++accmulatedRotation;
		if(accmulatedRotation<maxRotation) {
			System.out.println(location + "\tTire 수명\t " + ( maxRotation -accmulatedRotation ) + "회");
			return true;
		}else {
			System.out.println("***" + location + "Tire 평크 ***");
			return false;
		}
		
	}
}
