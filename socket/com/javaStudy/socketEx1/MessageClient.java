package com.javaStudy.socketEx1;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.Socket;
import java.util.Scanner;

public class MessageClient {

	public static void main(String[] args) throws Exception {

		Socket s = new Socket("172.30.1.7", 8888);

		DataInputStream din = new DataInputStream(s.getInputStream());
		DataOutputStream dout = new DataOutputStream(s.getOutputStream());
		Scanner scanner = new Scanner(System.in);

		String str = "";
		String str2 = "";

		while (!str.equals("exit")) {
			str = scanner.nextLine();
			dout.writeUTF(str);
			dout.flush();
			str2 = din.readUTF();
			System.out.println("Server message : " + str2);
		}
		din.close();
		s.close();

	}

}
