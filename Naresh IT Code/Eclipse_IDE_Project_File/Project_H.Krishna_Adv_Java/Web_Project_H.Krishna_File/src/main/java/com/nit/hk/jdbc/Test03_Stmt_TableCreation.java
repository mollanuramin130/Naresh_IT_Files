/*
Program #3: 
            Develop a program to create tables Course and Student in Oracle DB 
	    Course table with the coloumns  course_id, course_name, course_fee
	    and Student table with the columns sno(pk), sname, course_id(fk), fee	
	    
	    You must create Student table as child table of Course
	    
	====================================================================
			Table creation Queries
	====================================================================
	CREATE TABLE course(
		course_id	NUMBER(4)	PRIMARY KEY,
		course_name	VARCHAR2(50)	UNIQUE NOT NULL,
		course_fee	Number(7,2)	
	);
	
	CREATE TABLE student(
		sid		NUMBER(4)	PRIMARY KEY,
		sname		VARCHAR2(20)	NOT NULL,
		course_id	NUMBER(4)	REFERENCES Course(course_id),
		fee		NUMBER(7,2)	
	);
 

	CREATE TABLE student(
		sid		NUMBER(4)	PRIMARY KEY,
		sname		VARCHAR2(20)	NOT NULL,
		course_id	NUMBER(4),
		fee		NUMBER(7,2),
		FOREIGN KEY (course_id) REFERENCES Course(course_id) 
	);
	=========================================================================
*/

//Test03_Stmt_TableCreation.java
package com.nit.hk.jdbc;

import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.SQLException;

public class Test03_Stmt_TableCreation {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {

		// 1. Loading DB driver
		Class.forName("oracle.jdbc.driver.OracleDriver");
		System.out.println("Driver is loaded");

		// 2. Establishing connection
		Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "hknit11am", "hari");
		System.out.println("Connection is created");

		// 3. Creating Statement object
		Statement stmt = con.createStatement();
		System.out.println("Statement is created");

		// 4. Executing Table creation queries
		String courseTableQuery = "CREATE TABLE course(\n" + "	course_id	NUMBER(4)	PRIMARY KEY,\n"
				+ "	course_name	VARCHAR2(50)	UNIQUE NOT NULL,\n" + "	course_fee	Number(7,2)\n" + ")";

		String studentTableQuery = """
				CREATE TABLE student(
				   sid			NUMBER(4)		PRIMARY KEY,
				   sname		VARCHAR2(20)	NOT NULL,
				   course_id	NUMBER(4)		REFERENCES Course(course_id),
				   fee			NUMBER(7,2)
				)
				"""; // Java 15v new features Text blocks (""" """)

		stmt.execute(courseTableQuery);
		System.out.println("Course table is created");

		stmt.execute(studentTableQuery);
		System.out.println("Student table is created");

		// 5.closing connection
		stmt.close();
		con.close();

	}
}
