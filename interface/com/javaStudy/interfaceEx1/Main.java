package com.javaStudy.interfaceEx1;

public class Main {

	public static void main(String[] args) {

		RemoteControl rc;
		
		rc = new Television();
		rc.turnOn();
		rc.turnOff();
		rc.setVolume(10);
		
		
		rc = new Audio();
		rc.turnOn();
		rc.turnOff();
		rc.setVolume(5);
		rc.defauitMe();
		
		RemoteControl.staticMe();

	}

}
