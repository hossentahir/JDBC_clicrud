package com.jdbcPrograms;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class Student_reading {

	public static void main(String[] args) {
		try {
			 Class.forName("com.mysql.cj.jdbc.Driver");// for loading and register driver
			 Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/JDBC_DB", "root", "root");
			 //System.out.println("Connection established...........");
			 
			 PreparedStatement ps = con.prepareStatement("select * from student");
			 
			 ResultSet rs = ps.executeQuery();
			 
			 while(rs.next()) {
				 System.out.println(rs.getInt(1)+"\t"+rs.getString(2)+"\t"+rs.getString(3));
			 }
			 
			 con.close();
			 
			 
			
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
