package com.javaStudy.threadWaitNotify;

public class ProducerThread extends Thread {
	private DataBox dateBox;

	public ProducerThread(DataBox dateBox) {
		this.dateBox = dateBox;
	}

	@Override
	public void run() {
		for (int i = 1; i <= 3; i++) {
			
			String data = "data" + i;
			dateBox.setData(data);
			
		}
	}
}
