package com.javaStudy.socket;

import java.io.DataOutputStream;
import java.net.Socket;

public class ClientSocket {

	public static void main(String[] args) {
		try {
			Socket s = new Socket("172.30.1.49", 9999);

			DataOutputStream dout = new DataOutputStream(s.getOutputStream());
			dout.writeUTF("무뼈닭발먹장");
			dout.flush();
			dout.close();
			s.close();

		} catch (Exception e) {
			System.out.println(e);
		}

	}

}
