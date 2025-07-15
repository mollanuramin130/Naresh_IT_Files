/*
Program #7: Develop a program to run insert, update and delete queries as a batch
	//1. Insert new students in adv java course
	//2. Update HTML course students fee to 2000
	//3. Delete oracle students 
*/

//Test07_Stmt_BatchUpdate_InsertUpdateDeleteStudentRows.java
package com.nit.hk.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Arrays;

public class Test07_Stmt_BatchUpdate_InsertUpdateDeleteStudentRows {

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
				VALUES(student_seq.nextval, 'S13', 4, 3500)
				""");

		stmt.addBatch("""
				INSERT INTO student(sid, sname, course_id, fee)
				VALUES(student_seq.nextval, 'S14', 4, 3500)
				""");

		stmt.addBatch("""
				UPDATE student set fee=2000 WHERE course_id=3
				""");

		stmt.addBatch("""
				DELETE FROM student WHERE course_id=2
				""");

		System.out.println("Queries are added to the batch");
		System.out.println("Executing them ...");

		// Step #2: executing batch
		int[] rowsCount = stmt.executeBatch();
		System.out.println(Arrays.toString(rowsCount));
		System.out.println();

		System.out.println(rowsCount[0] + rowsCount[1] + " Students are stored");
		System.out.println(rowsCount[2] + " Students are updated");
		System.out.println(rowsCount[3] + " Students are deleted");

		// 5. closing connection
		stmt.close();
		con.close();

	}
}
