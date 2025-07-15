/*
Program #6: Develop a program to run insert queries as batch
	//Test06_Stmt_BatchUpdate_InsertRowsInStudentTable.java
	
*/

package com.nit.hk.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Arrays;

public class Test06_Stmt_BatchUpdate_InsertRowsInStudentTable {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {

		// 1. Loading driver
		Class.forName("oracle.jdbc.driver.OracleDriver");
		System.out.println("Driver loaded");

		// 2. Establishing connection
		Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "hknit11am", "hari");
		System.out.println("Connection is created");

		// 3. Creating Statement object
		Statement stmt = con.createStatement();
		System.out.println("Statement is created is created");

		// 4. Execute queries
		// Step #1: adding queries to the batch
		stmt.addBatch("""
				INSERT INTO student(sid, sname, course_id, fee)
				VALUES(student_seq.nextval, 'S6', 1, 3500)
				""");

		stmt.addBatch("""
				INSERT INTO student(sid, sname, course_id, fee)
				VALUES(student_seq.nextval, 'S7', 12345, 3500)
				""");

		stmt.addBatch("""
				INSERT INTO student(sid, sname, course_id, fee)
				VALUES(student_seq.nextval, 'S8', 1, 3500)
				""");

		System.out.println("Queries are added to the batch and executing them ...");

		// Step #2: executing batch (sending all queries to DB at a time and execute
		// them one after one)
		int[] rowsCount = stmt.executeBatch();
		System.out.println(Arrays.toString(rowsCount));

		System.out.println(rowsCount[0] + rowsCount[1] + rowsCount[2] + " Students details are stored");

		// 5. closing connection
		stmt.close();
		con.close();

	}
}