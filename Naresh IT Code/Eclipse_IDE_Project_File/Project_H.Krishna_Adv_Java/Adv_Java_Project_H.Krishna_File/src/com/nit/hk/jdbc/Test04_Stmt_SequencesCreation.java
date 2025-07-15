/*
Program #4: Develop a program to create sequences 
               for Course and Student tables in Oracle DB 
	====================================================================
	1. Sequence creation Queries
	====================================================================
		CREATE SEQUENCE course_seq 
		START WITH 1 
		INCREMENT BY 1;
		
		CREATE SEQUENCE student_seq 
		START WITH 101 
		INCREMENT BY 1;
			
	====================================================================
	2. Query for retrieving all sequences created in the database
	====================================================================
		SELECT SEQUENCE_NAME, MIN_VALUE, MAX_VALUE, INCREMENT_BY, 
		       CYCLE_FLAG, ORDER_FLAG, CACHE_SIZE, LAST_NUMBER
		FROM USER_SEQUENCES;
	====================================================================
	
	3. Query for retrieving current value and next value from sequence
	====================================================================
		SELECT course_seq.nextval FROM dual;
		SELECT course_seq.currval FROM dual;
	     ____________________________________________________________	
		- 'nextval' work as post increment operator
		  it returns the existing value from the sequence
		  and incresed by 1 in the sequence
		  
		- 'currval' just returns the existing value from the sequence  
	=========================================================================
*/
//Test04_Stmt_SequencesCreation.java
package com.nit.hk.jdbc;

import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.SQLException;

public class Test04_Stmt_SequencesCreation {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {

		// 1. Loading DB driver
		Class.forName("oracle.jdbc.driver.OracleDriver");
		System.out.println("Driver is loaded");

		// 2. Establishing connection
		Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "hknit4pm2", "hari");
		System.out.println("Connection is created");

		// 3. Creating Statement object
		Statement stmt = con.createStatement();
		System.out.println("Statement is created");

		// 4. Executing Sequences creation queries
		StringBuilder courseTableSeqQueryBuilder = new StringBuilder();
		courseTableSeqQueryBuilder.append("CREATE SEQUENCE course_seq\n");
		courseTableSeqQueryBuilder.append("START WITH 1\n");
		courseTableSeqQueryBuilder.append("INCREMENT BY 1");

		String studentTableSeqQuery = """
				CREATE SEQUENCE student_seq
				START WITH 101
				INCREMENT BY 1
				""";

		stmt.execute(courseTableSeqQueryBuilder.toString());
		System.out.println("Course_Seq is created");

		stmt.execute(studentTableSeqQuery);
		System.out.println("Student_Seq is created");

		// 5.closing connection
		stmt.close();
		con.close();

	}
}