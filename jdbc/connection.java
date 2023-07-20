package com.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class connection {

	public static void connect(){
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/employee","root","rootpassword");
			System.out.println("Connection Successfull....");
			con.close();
		}catch(Exception e) {
			e.printStackTrace();
		}
		return;
	}

}
