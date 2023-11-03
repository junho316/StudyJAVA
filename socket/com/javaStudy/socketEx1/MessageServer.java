package com.javaStudy.socketEx1;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class MessageServer {

	public static void main(String[] args) throws Exception {

		ServerSocket ss = new ServerSocket(8888);
		Socket s = ss.accept();

		DataInputStream din = new DataInputStream(s.getInputStream());
		DataOutputStream dout = new DataOutputStream(s.getOutputStream());

		Scanner scanner = new Scanner(System.in);
		String str = "";
		String str2 = "";

		while (!str.equals("exit")) {
			str = din.readUTF();
			System.out.println("client Server : " + str);
			str2 = scanner.nextLine();
			dout.writeUTF(str2);
			dout.flush();
		}
		din.close();
		s.close();
		ss.close();

	}

}
