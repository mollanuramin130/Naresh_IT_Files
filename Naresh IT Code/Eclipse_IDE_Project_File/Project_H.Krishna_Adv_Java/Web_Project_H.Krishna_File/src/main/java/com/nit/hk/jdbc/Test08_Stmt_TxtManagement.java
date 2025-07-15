/*
Program #8: Develop a program to run insert queries as batch, 
	    If any of the query execution is failed rollback all rows,
	    else commit all rows permanently.
*/

//Test08_Stmt_TxtManagement .java

package com.nit.hk.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Arrays;

public class Test08_Stmt_TxtManagement {

	public static void main(String[] args) {

		Connection con = null;
		Statement stmt = null;
		try {
			// 1. Loading driver
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("Driver loaded");

			// 2. Establishing connection
			con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "hknit4pm2", "hari");
			System.out.println("Connection is created");

			// Step #1: Making auto commit mode to false,
			// then [I, U and D] result is not stored in main table
			con.setAutoCommit(false);

			// 3. Creating Statement object
			stmt = con.createStatement();
			System.out.println("Statement is created is created");

			// 4. Execute queries
			stmt.addBatch("""
					INSERT INTO student(sid, sname, course_id, fee)
					VALUES(student_seq.nextval, 'S7', 1, 3500)
					""");

			stmt.addBatch("""
					INSERT INTO student(sid, sname, course_id, fee)
					VALUES(student_seq.nextval, 'S8', 1, 3500)
					""");
			// VALUES(student_seq.nextval, 'S8', 12345, 3500)

			stmt.addBatch("""
					INSERT INTO student(sid, sname, course_id, fee)
					VALUES(student_seq.nextval, 'S9', 1, 3500)
					""");

			System.out.println("Queries are added to the batch and executing them ...");
			int[] rowsCount = stmt.executeBatch();
			System.out.println(Arrays.toString(rowsCount));

			System.out.println(rowsCount[0] + rowsCount[1] + rowsCount[2] + " Students details are stored");

			// Step #2: committing result to DB main table
			con.commit();
			System.out.println("Results are committed to the main table");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			// Step #3: rolling back the result
			try {
				con.rollback();
				System.out.println("Results are rolled back");
			} catch (SQLException e1) {
			}

			e.printStackTrace();
		} finally {
			// 5. closing connection

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
