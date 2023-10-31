package com.javaStudy.threadEx2;

public class Main {

	public static void main(String[] args) {
		Thread mainThread = Thread.currentThread();
		System.out.println("프로그램 시작 스레드 이름 " + mainThread.getName());

		Thread threadA = new ThreadA();
		System.out.println("작업스레드 이름 " + threadA.getName());
		threadA.start();

		Thread threadB = new ThreadB();
		System.out.println("작업스레드 이름 " + threadB.getName());
		threadB.start();
//
//		Thread threadC = new ThreadC();
//		System.out.println("작업스레드 이름 " + threadC.getName());
//		threadC.start();
//
//		Thread threadD = new ThreadD();
//		System.out.println("작업스레드 이름 " + threadD.getName());
//		threadD.start();

	}

}
