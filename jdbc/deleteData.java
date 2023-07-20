package com.jdbc;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.*;

public class deleteData {

	public static void delete() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Eneter Id");
		int id = sc.nextInt();
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/employee","root","rootpassword");
			PreparedStatement stmt = con.prepareStatement("delete from employees where id =?");
			stmt.setInt(1, id);
			int count = stmt.executeUpdate();
			System.out.println(count+" Rows Deleted");
			con.close();
		}catch(Exception e) {
			e.printStackTrace();
		}
		return;
	}

}
