package com.tolgaduran.spring.demo;

import java.sql.Connection;
import java.sql.DriverManager;

public class TestJDBC {

	public static void main(String[] args) {

		String user="springstudent";
		String pass="springstudent";
		
		String url="jdbc:mysql://localhost:3306/web_customer_tracker?useSSL=false";
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection myConn=DriverManager.getConnection(url, user, pass);
			
			System.out.println("Connection successful!!!");
			myConn.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
