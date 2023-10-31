package com.javaStudy.threadEx1;

import java.awt.Toolkit;

public class BeepTask extends Thread {

	
	public void run() {
		//Toolkit toolkit = Toolkit.getDefaultToolkit();

		for (int i = 0; i < 5; i++) {
			//toolkit.beep();
			System.out.println("땅");
			try {
				Thread.sleep(500);
			} catch (Exception e) {

			}
		}
	}
}
