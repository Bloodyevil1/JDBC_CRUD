package com.jdbc;

import java.util.Scanner;

public class allAccess {

	public static void main(String[] args) {	
		all();
		
	}
		
	public static void all() {
		allAccess all = new allAccess();
		connection con = new connection();
		deleteData del = new deleteData();
		InsertData ins = new InsertData();
		selectData sel = new selectData();
		updateData upd = new updateData();
		customQuery cstm = new customQuery();
		while(true) {
		System.out.println("1.check Connection.");
		System.out.println("2.insert Data.");
		System.out.println("3.delete Data.");
		System.out.println("4.Get data.");
		System.out.println("5.update data.");
		System.out.println("6.customize your query");
		Scanner sc = new Scanner(System.in);
		int no = sc.nextInt();
	switch(no) {
		case 1:{
			con.connect();
			break;
		}
		case 2:{
			ins.insert();
			break;
		}
		case 3:{
			del.delete();
			break;
		}
		case 4:{
			sel.select();
			break;
		}
		case 5:{
			upd.update();
			break;
		}
		case 6:{
			cstm.custom();
		}
		}
		}
	}
	}


