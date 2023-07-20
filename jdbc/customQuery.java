package com.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

public class customQuery {
	public static void custom() {
		try {
			Scanner sc = new Scanner(System.in);
			System.out.print("Enter Query: ");
			String query = sc.nextLine();
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/employee","root","rootpassword");
			PreparedStatement stmt = con.prepareStatement(query);
			
			if(query.toLowerCase().startsWith("select")) {
			ResultSet rs = stmt.executeQuery();
			while(rs.next()) {
				System.out.println(rs.getInt("id"));
				System.out.println(rs.getString("name"));
				System.out.println(rs.getDouble("salart"));
				System.out.println(rs.getString("DOj"));
			}
		}
			else {
			int count = stmt.executeUpdate();
			System.out.println(count+ " Rows affected");
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
		return;
	}
}
	

