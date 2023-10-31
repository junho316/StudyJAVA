package com.javaStudy.threadState;

public class Main {

	public static void main(String[] args) {
		StatePrintTread statePrintTread = new StatePrintTread(new TargetThread());
		statePrintTread.start();

	}

}

