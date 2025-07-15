/*
============================================================================================
7. Develop a program to display a table's 
   columns names and its row data 
   by using ResultSet and ResultSetMetaData
============================================================================================
*/
//Test10_Stmt_RS_RSMD_PrintColsRows_Course.java
package com.nit.hk.jdbc;

import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;

public class Test10_Stmt_RS_RSMD_PrintColsRows {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {

		// 1. Loading driver
		Class.forName("oracle.jdbc.driver.OracleDriver");

		// 2. Establishing connection
		Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "hknit4pm2", "hari");

		// 3. Creating Statement object
		Statement stmt = con.createStatement();

		// 4. Executing SELECT Query and obtains ResultSet and RSMD objects
		ResultSet rs = stmt.executeQuery("SELECT * FROM course");
		ResultSetMetaData rsmd = rs.getMetaData();

		// 5. Fetching Columns and Rows RSMD and RS
		int count = 0;
		if (rs.next()) {

			for (int i = 1; i <= rsmd.getColumnCount(); i++) {
				System.out.print(rsmd.getColumnName(i) + "\t");
			}
			System.out.println("\n-----------------------------------------------");

			do {
				System.out.println(rs.getInt(1) + "\t" + rs.getString(2) + "\t" + rs.getDouble(3));
				count++;
			} while (rs.next());
		}

		System.out.println("\n" + count + " rows selected");

		// 6. closing connections
		rs.close();
		stmt.close();
		con.close();

	}
}