package com.jdbc;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.*;

public class updateData{
	public static void update() {
		Scanner sc = new Scanner(System.in);
		System.out.println("What You Want TO Update....");
		System.out.println("1.Name");
		System.out.println("2.Salary");
		System.out.println("3.Doj");
		int id = sc.nextInt();
		try {
		Class.forName("com.mysql.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/employee","root","rootpassword");
		switch(id) {
		case 1:{
			System.out.print("Enter name to Update");
			String name = sc.next();
			System.out.print("Enter id");
			int empId = sc.nextInt();
			PreparedStatement  stmt = con.prepareStatement("UPDATE employees set name = ? where id = ? ");
			stmt.setString(1, name);
			stmt.setInt(2, empId);
			int count = stmt.executeUpdate();
			System.out.println(count+" Rows Updates");
			con.close();
			break;
		}
		case 2:{
			System.out.print("Enter salary to Update");
			double salary = sc.nextDouble();
			System.out.print("Enter id");
			int empId = sc.nextInt();
			PreparedStatement  stmt = con.prepareStatement("UPDATE employees set salart = ? where id = ? ");
			stmt.setDouble(1, salary);
			stmt.setInt(2, id);
			int count = stmt.executeUpdate();
			System.out.println(count+" Rows Updates");
			con.close();
			break;
		}
		case 3:
			System.out.print("Enter DOj to Update");
			String Doj = sc.next();
			System.out.print("Enter id");
			int empId = sc.nextInt();
			PreparedStatement  stmt = con.prepareStatement("UPDATE employees set Doj = ? where id = ? ");
			stmt.setString(1, Doj);
			stmt.setInt(2, empId);
			int count = stmt.executeUpdate();
			System.out.println(count+" Rows Updates");
			con.close();
			break;
		}
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		return;
	}
}