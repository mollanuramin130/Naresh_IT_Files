/*
===========================================================================================
		JDBC program with try-with-resource
===========================================================================================
*/
//Test12_JDBC_Code_With_try_with_resource.java
package com.nit.hk.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;

public class Test12_JDBC_Code_With_try_with_resource {

	public static void main(String[] args) {

		try (
				// 1. Establishing connection
				Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "hknit4pm2",
						"hari");

				// 2. Creating Statement object
				Statement stmt = con.createStatement();

				// 3. Executed SELECT and obtain ResultSet and RSMD object
				ResultSet rs = stmt.executeQuery("SELECT * FROM course ORDER BY course_id ");) {
			ResultSetMetaData rsmd = rs.getMetaData();

			// 4. Fetching results from DB
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

		} catch (SQLException e) {
			e.printStackTrace();
		}

	}
}
