package za.co.pvi;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;


public class School {

	static final String JDBC_Driver = "com.mysql.cj.jdbc.Driver";
	static final String DB_URL = "jdbc:mysql://localhost/SCH";

	static final String USER = "root";
	static final String PASS = "1986";

	public static void main(String[] args) {
		Connection con = null;
		Statement state = null;

		try {

			Class.forName("com.mysql.cj.jdbc.Driver");
			
			System.out.println("connecting to databases.......");
			con = DriverManager.getConnection(DB_URL, USER, PASS);

			System.out.println("creating Statement");
			state = con.createStatement();
			String sql;
			sql = "INSERT INTO Students VALUES ('" + "TOPE" + 28 + 2018101 + "PHP" + "')";
			//As represented below in the Students database;
			//INSERT INTO Students VALUES ("brandon", 26, 2018100, "JAVA");
			state.executeUpdate(sql);

			con.close();
			state.close();

		} catch (SQLException se) {

			se.printStackTrace();

		} catch (Exception e) {

			e.printStackTrace();

		} finally {
			try {
				if (con != null) {
					con.close();
				}

			} catch (SQLException se2) {

				se2.printStackTrace();
			}
			try {
				if (state != null) {
					state.close();
				}
			} catch (SQLException se3) {
				se3.printStackTrace();
			}
		}
		System.out.println("THANK YOU");
	}

}
