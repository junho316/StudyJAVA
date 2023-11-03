package com.javaStudy.read;

import java.io.FileReader;
import java.io.Reader;

public class Main {

	public static void main(String[] args) throws Exception {
		Reader reader = new FileReader("C:/Temp/test.txt");

		int i = 0;
		while (true) {
			i++;
			int readData = reader.read();
			if (readData == -1)
				break;

			System.out.println(readData);
			System.out.println((char) readData);
		}
		System.out.println("i : " + (i - 1));
		reader.close();
	}

}
