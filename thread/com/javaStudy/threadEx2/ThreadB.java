package com.javaStudy.threadEx2;

public class ThreadB extends Thread {
	public ThreadB() {
		setName("스레드 B");
	}

	public void run() {
		for (int i = 0; i < 2; i++) {
			System.out.println(getName() + "가 출력한 내용");
		}

	}
}
