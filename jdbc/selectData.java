package com.jdbc;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.*;
public class selectData {

	public static void select() {
		Scanner sc = new Scanner(System.in);
		System.out.println("1.select all");
		System.out.println("2.Select with Id");
		int num = sc.nextInt();
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/employee","root","rootpassword");
			switch(num) {
			case 1:{
				PreparedStatement  stmt = con.prepareStatement("select* from employees");
				ResultSet rs = stmt.executeQuery();
				while(rs.next()) {
					System.out.println(rs.getInt("id"));
					System.out.println(rs.getString("name"));
					System.out.println(rs.getDouble("salart"));
					System.out.println(rs.getString("Doj"));
				}
				con.close();
				break;
			}
			case 2:{
				System.out.print("Enter Id");
				int id = sc.nextInt();
				PreparedStatement  stmt = con.prepareStatement("select* from employees where id = ?");
				stmt.setInt(1, id);
				ResultSet rs = stmt.executeQuery();
				while(rs.next()) {
					System.out.println(rs.getInt("id"));
					System.out.println(rs.getString("name"));
					System.out.println(rs.getDouble("salart"));
					System.out.println(rs.getString("Doj"));
				}
				con.close();
				break;
				
			}
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
		return;
	}

}
