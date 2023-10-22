package com.javaStudy.interfaceEx1;

public interface RemoteControl {

	public int MAX_VOLME = 10;
	public int MIN_VOLME = 0;
	
	public void turnOn();
	public void turnOff();
	public void setVolume(int volume);
	
	public default void defauitMe() {
		System.out.println("default");
	}
	public static void staticMe() {
		System.out.println("static");
	}
}
