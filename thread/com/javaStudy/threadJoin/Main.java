package com.javaStudy.threadJoin;

public class Main {

	public static void main(String[] args) {
		SumThread sumThread = new SumThread();
		sumThread.start();
		try {
			sumThread.join();
		} catch (InterruptedException e) {

		}
		
		System.out.println(sumThread.getSum());
	}

}
