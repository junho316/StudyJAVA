package com.javaStudy.threadWaitNotify;

public class DataBox {

	private String data;

	public synchronized String getData() {

		if (this.data == null) {
			try {
				wait();
			} catch (InterruptedException e) {
			}

		}
		String returnValue = data;
		System.out.println("Consumer Thread가 읽은 데이터 : " + returnValue);
		data = null;
		notify();

		return returnValue;
	}

	public synchronized void setData(String data) {
		if (this.data != null) {
			try {
				wait();
			} catch (InterruptedException e) {
			}
		}
		this.data = data;
		System.out.println("Producer Thread가 만든 데이터 : " + data);
		notify();

	}

}
