package com.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class InsertData {

	public static void insert(){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Id");
		int id = sc.nextInt();
		System.out.println("Enter name");
		String name = sc.next();
		System.out.println("Enter salary");
		double salary = sc.nextDouble();
		System.out.println("Enter DOj");
		String Doj = sc.next();
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/employee","root","rootpassword");
			PreparedStatement stmt = con.prepareStatement("INSERT INTO employees values(?,?,?,?)");
			stmt.setInt(1, id);
			stmt.setString(2, name);
			stmt.setDouble(3, salary);
			stmt.setString(4, Doj);
			int count = stmt.executeUpdate();
			
			System.out.println(count+" ROws Inserted.....");
			
			con.close();
			
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		return;
	}

}
