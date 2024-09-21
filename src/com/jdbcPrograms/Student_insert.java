package com.jdbcPrograms;

import java.sql.*;
//import java.sql.DriverManager;
import java.util.Scanner;

public class Student_insert {

	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
		 
		 System.out.println("Enter the roll no: ");
		 int rNo = sc.nextInt();
		 
		 System.out.println("Enter the name :");
		 String sName = sc.next();
		 
		 System.out.println("Enter the address :");
		 String sAddress = sc.next();
		 
		 try {
			 Class.forName("com.mysql.cj.jdbc.Driver");// for loading and register driver
			 Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/JDBC_DB", "root", "root");
			 //System.out.println("Connection established...........");
			 
			 PreparedStatement ps = con.prepareStatement("insert into student values (?,?,?)");
			 ps.setInt(1, rNo);
			 ps.setString(2, sName);
			 ps.setString(3, sAddress);
			 
			 int x = ps.executeUpdate();
			 System.out.println(x);
			 
			 if(x>0) {
				 System.out.println("Student record successfully inserted.. ");
			 }
			 else {
				 System.out.println("Student record did not inserted successfully .. ");
			 }
			 
			 con.close();
			 
			 
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		 
		 

	}

}
