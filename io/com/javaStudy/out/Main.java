package com.javaStudy.out;

import java.io.FileOutputStream;
import java.io.OutputStream;

public class Main {

	public static void main(String[] args) throws Exception {
		OutputStream os = new FileOutputStream("C:/Temp/test.txt");
		// byte[] data = "A".getBytes();
		byte[] data = "한".getBytes();

		os.write(data);
		System.out.println(data.length);
		os.flush();
		os.close();

	}

}
