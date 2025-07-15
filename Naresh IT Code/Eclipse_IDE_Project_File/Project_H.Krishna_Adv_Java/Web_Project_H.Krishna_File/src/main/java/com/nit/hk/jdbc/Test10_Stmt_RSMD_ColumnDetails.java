/*
Below program shows retriving and printing columns details
	//Test10_Stmt_RSMD_ColumnDetails.java
	///
*/

package com.nit.hk.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Types;

public class Test10_Stmt_RSMD_ColumnDetails {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {

		// 1. Loading driver
		Class.forName("oracle.jdbc.driver.OracleDriver");

		// 2. Establishing connection
		Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "hknit4pm2", "hari");

		// 3. Creating Statement object
		Statement stmt = con.createStatement();

		// 4. Executing SELECT Query
		ResultSet rs = stmt.executeQuery("SELECT * FROM course");
		ResultSetMetaData rsmd = rs.getMetaData();

		System.out.println(rsmd.getColumnCount());
		System.out.println();

		System.out.println(rsmd.getColumnName(1));
		System.out.println(rsmd.getColumnName(2));
		System.out.println(rsmd.getColumnName(3));
		System.out.println();

		System.out.println(rsmd.getColumnTypeName(1));
		System.out.println(rsmd.getColumnTypeName(2));
		System.out.println(rsmd.getColumnTypeName(3));
		System.out.println();

		System.out.println(rsmd.getColumnDisplaySize(1));
		System.out.println(rsmd.getColumnDisplaySize(2));
		System.out.println(rsmd.getColumnDisplaySize(3));
		System.out.println();

		System.out.println(rsmd.getPrecision(1));
		System.out.println(rsmd.getPrecision(2));
		System.out.println(rsmd.getPrecision(3));

		// try other method available in RSMD by following API documentation

		// 6. closing connections
		rs.close();
		stmt.close();
		con.close();

	}
}
