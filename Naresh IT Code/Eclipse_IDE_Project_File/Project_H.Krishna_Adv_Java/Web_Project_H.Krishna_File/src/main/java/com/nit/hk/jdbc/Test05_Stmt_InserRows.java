/*
Program #5: Develop a program to insert rows in course table 
        In this program we must use "stmt.executeUpdate()" method
	
	1. Insert queries 
		INSERT INTO course(course_id, course_name, course_fee)
		VALUES(course_seq.nextval, "Core Java", 3500);
 
		INSERT INTO course(course_id, course_name, course_fee)
		VALUES(course_seq.nextval, "Oracle", 2500);
		
		INSERT INTO course(course_id, course_name, course_fee)
		VALUES(course_seq.nextval, "HTML, CSS, JS", 2500);
		
		INSERT INTO course(course_id, course_name, course_fee)
		VALUES(course_seq.nextval, "Adv Java", 3500);
*/

//Test05_Stmt_InsertRows.java
package com.nit.hk.jdbc;

import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.SQLException;

public class Test05_Stmt_InserRows {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {

		// 1. Loading driver
		Class.forName("oracle.jdbc.driver.OraclerDriver");

		// 2. Establishing connection
		Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "hknit4pm2", "hari");

		// 3. Creating Statement object
		Statement stmt = con.createStatement();

		// 4. Execute queries
		stmt.executeUpdate("""
				INSERT INTO course(course_id, course_name, course_fee)
				VALUES(course_seq.nextval, "Core Java", 3500);
				""");

		stmt.executeUpdate("""
				INSERT INTO course(course_id, course_name, course_fee)
				VALUES(course_seq.nextval, "Oracle", 2500);
				""");

		stmt.executeUpdate("""
				INSERT INTO course(course_id, course_name, course_fee)
				VALUES(course_seq.nextval, "HTML, CSS, JS", 2500);
				""");

		stmt.executeUpdate("""
				INSERT INTO course(course_id, course_name, course_fee)
				VALUES(course_seq.nextval, "Adv Java", 3500);
				""");

		System.out.println("Rows are inserted");

		// 5. closing connection
		stmt.close();
		con.close();

	}
}
