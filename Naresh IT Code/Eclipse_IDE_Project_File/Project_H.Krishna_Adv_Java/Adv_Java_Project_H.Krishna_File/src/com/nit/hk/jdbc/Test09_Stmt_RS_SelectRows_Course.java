//Program #9: Develop a program to retrieve data from Course table 
//Test09_Stmt_RS_SelectRows_Course.java

package com.nit.hk.jdbc;

import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Test09_Stmt_RS_SelectRows_Course {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {

		// 1. Loading driver
		Class.forName("oracle.jdbc.driver.OracleDriver");

		// 2. Establishing connection
		Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "hknit11am", "hari");

		// 3. Creating Statement object
		Statement stmt = con.createStatement();

		// 4. Executing SELECT Query
		ResultSet rs = stmt.executeQuery("SELECT * FROM course");

		// 5. Fetching results from DB by using ResultSet object
		while (rs.next()) {
			System.out.println(rs.getInt(1) + "\t" + rs.getString(2) + "\t\t" + rs.getDouble(3));
		}

		// 6. closing connections
		rs.close();
		stmt.close();
		con.close();

	}
}