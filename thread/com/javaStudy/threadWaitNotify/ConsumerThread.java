package com.javaStudy.threadWaitNotify;

public class ConsumerThread extends Thread {

	private DataBox dateBox;

	public ConsumerThread(DataBox dateBox) {
		this.dateBox = dateBox;
	}

	@Override
	public void run() {
		
		for (int i = 1; i <= 3; i++) {
			String data = dateBox.getData();
		
		}
	}
}
