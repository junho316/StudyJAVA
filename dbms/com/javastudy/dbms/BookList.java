package com.javastudy.dbms;

import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.*;

public class BookList {
	Connection con;

	public BookList() {
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String userid = "scott";
		String pwd = "tiger";

		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("드라이브 로드 성공");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}

		try {
			System.out.println("데이터베이스 연결 준비...");
			con = DriverManager.getConnection(url, userid, pwd);
			System.out.println("데이터베이스 연결 성공");
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	private void sqlRun() {
		String query = "SELECT * FROM BOOK";
		try {
			Statement stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery(query);
			System.out.println("BOOK NO \tBOOK NAME \t\t PUBLISHER \tPRICE");
			while (rs.next()) {
				System.out.println("\t" + rs.getInt(1));
				System.out.println("\t" + rs.getString(2));
				System.out.println("\t" + rs.getString(3));
				System.out.println("\t" + rs.getInt(4));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}
	
	public static void main(String args[]) {
		BookList so = new BookList();
		so.sqlRun();
	}
}
