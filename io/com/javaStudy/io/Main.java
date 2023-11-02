package com.javaStudy.io;

import java.io.FileInputStream;
import java.io.InputStream;

public class Main {

	public static void main(String[] args) throws Exception {
		InputStream is = new FileInputStream("C:/Temp/test.txt");

		int readByte;
		while (true) {
			readByte = is.read();
			if (readByte == -1)
				break;
			System.out.println(readByte);
			System.out.println((char)readByte);
			
		}
	}

}
