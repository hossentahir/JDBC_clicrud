package com.jdbcPrograms;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class Student_delete {

	public static void main(String[] args) {
		try {
			 Class.forName("com.mysql.cj.jdbc.Driver");// for loading and register driver
			 Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/JDBC_DB", "root", "root");
			 //System.out.println("Connection established...........");
			 
			 PreparedStatement ps = con.prepareStatement("delete from student where rNo = ?");
			 
			 ps.setInt(1, 110);
			 
			 int x = ps.executeUpdate();
			 System.out.println(x);
			 
			 if(x>0) {
				 System.out.println("Record deleted sucessfully.. ");
			 }
			 else {
				 System.out.println("Record is not deleted successfully .. ");
			 }
			 
			 con.close();
			 
			 
			
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
