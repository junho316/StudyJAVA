package com.javaStudy.ioEx2;

import java.io.FileInputStream;
import java.io.InputStream;

public class Main {

	public static void main(String[] args) throws Exception {
		InputStream is = new FileInputStream("C:/Temp/test.txt");
		int readByteNo;
		byte[] readBytes = new byte[6];
		readByteNo = is.read(readBytes, 2, 3);

		System.out.println("읽은 바이트 수" + readByteNo);
		for (int i = 0; i < readBytes.length; i++) {
			System.out.println(readBytes[i]);
		}
		
		is.close();
	}

}
