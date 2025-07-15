/*
===========================================================================================	
14. JDBC program for catching exception and closing connections in finally block	
===========================================================================================	
*/

//Test12_JDBC_Code_With_EH.java 
package com.nit.hk.jdbc;

import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;

public class Test12_JDBC_Code_With_EH {

	public static void main(String[] args) {

		Connection con = null;
		Statement stmt = null;
		ResultSet rs = null;

		try {
			// 1. Loading JDBC driver
			// Class.forName("oracle.jdbc.driver.OracleDriver");

			// 2. Establishing connection
			con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "hknit11am", "hari");

			// 3. Creating Statement object
			stmt = con.createStatement();

			// 4. Executed SELECT and obtain ResultSet and RSMD object
			rs = stmt.executeQuery("SELECT * FROM student ORDER BY sid ");
			ResultSetMetaData rsmd = rs.getMetaData();

			// 5. Fetching results from DB
			int count = 0;
			if (rs.next()) {

				for (int i = 1; i <= rsmd.getColumnCount(); i++) {
					System.out.print(rsmd.getColumnName(i) + "\t");
				}
				System.out.println("\n-----------------------------------------------");

				do {
					System.out.println(
							rs.getInt(1) + "\t" + rs.getString(2) + "\t" + rs.getInt(3) + "\t" + rs.getDouble(4));

					count++;
				} while (rs.next());
			}
			System.out.println("\n" + count + " rows selected");

		} // try close
			// catch(ClassNotFoundException e) {
			// System.out.println("Driver class is not found");
			// }
		catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				if (rs != null)
					rs.close();
			} catch (SQLException e) {
			}

			try {
				if (stmt != null)
					stmt.close();
			} catch (SQLException e) {
			}

			try {
				if (con != null)
					con.close();
			} catch (SQLException e) {
			}

		}
	}
}
