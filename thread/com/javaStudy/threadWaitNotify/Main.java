package com.javaStudy.threadWaitNotify;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		DataBox dataBox = new DataBox();

		ProducerThread producerThread = new ProducerThread(dataBox);
		ConsumerThread consumerThread = new ConsumerThread(dataBox);

		producerThread.start();
		consumerThread.start();
		

	}

}
