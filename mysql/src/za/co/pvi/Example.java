package za.co.pvi;

import java.sql.*;
import java.util.Scanner;

public class Example {
	
	//STEP 1
	
	//JDBC Driver name and database URL
	
	static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
	static final String DB_URL = "jdbc:mysql://localhost/EMP";
	
	//Database Credentials
	static final String USER = "root";

	static final String PASS = "1986";
	

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		

		Connection conn = null;
		Statement state = null;
		
		
		try {
			// Step 2 Register JDBC Driver
			Class.forName("com.mysql.jdbc.Driver");
			
			//Step 3 open a connection
			System.out.println("connecting to database....");
			 conn = DriverManager.getConnection(DB_URL, USER, PASS);
			 
			 //Step 4 Execute a query
			 System.out.println("creating statement....");
			 state = conn.createStatement();
			 String sql;
			 sql = "SELECT id, age, name FROM Employees";
			 ResultSet rs = state.executeQuery(sql);
			 //executeupdate
			 
			 //Step 5 Extract data from database
			 while (rs.next()) {
				
				 int id = rs.getInt("id");
				 int age = rs.getInt("age");
				 String name = rs.getString("name");
				 
				 System.out.println("ID :" + id);
				 System.out.println("AGE :" + age);
				 System.out.println("NAME :" + name);
			}
			 
			 
			rs.close();
			state.close();
			conn.close();
				
				
			
		} catch (SQLException se) {
			// TODO: handle exception
			se.printStackTrace();
		}catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}finally {
			try {
				if (state !=null) {
					state.close();
				}
			} catch (SQLException e2) {
				// TODO: handle exception
				e2.printStackTrace();
			}
			try {
				if (conn !=null) {
					conn.close();
				}
			} catch (SQLException se) {
				// TODO: handle exception
				se.printStackTrace();
			}
		}
         System.out.println("GOODBYE");
	}

}
