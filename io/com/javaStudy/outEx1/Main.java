package com.javaStudy.outEx1;

import java.io.FileOutputStream;
import java.io.OutputStream;

public class Main {

	public static void main(String[] args) throws Exception {
		OutputStream os = new FileOutputStream("C:/Temp/test.txt");
		byte[] data = "안녕하세요".getBytes();

		os.write(data, 3, 3);
		os.flush();
		os.close();

	}

}
