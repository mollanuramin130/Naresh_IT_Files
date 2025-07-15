/*
Develop a program to run a cursor from Java application
	for reading all employees details from a given dept.

Step #1: Login to hknit11am/hari schema

Step #2: Create employee table

	CREATE TABLE employee( 
		eno		NUMBER(5) PRIMARY KEY, 
		ename	VARCHAR2(20),
		sal		NUMBER(12,2),
		dept	VARCHAR2(10)
	);

Step #3: Insert few records
	
	INSERT INTO employee VALUES(4, 'Hari', 99999, 'JAVA');
	INSERT INTO employee VALUES(5, 'Balayya', 99999, 'JAVA');
	INSERT INTO employee VALUES(6, 'Mahesh', 989898, 'Python');
	commit;

Step #5:	Compile below procedure with cursor 
				for retrieving all employees records from DB
				for the given dept.

	CREATE or REPLACE PROCEDURE 
		getAllEmpDetailsFromDept(
			empdept			IN	VARCHAR2,
			dept_emp_cur	OUT	SYS_REFCURSOR
		 )
	IS 
	BEGIN
		OPEN dept_emp_cur FOR 

			SELECT *
			FROM	employee
			WHERE	dept LIKE empdept;

	END;
	/
	 

Step #6: Run below application to execute above procedure

*/
//Test22_Cstmt_RunCursor.java
package com.nit.hk.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.CallableStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.Types;

//import oracle.jdbc.OracleTypes;

import java.util.Scanner;

public class Test22_Cstmt_RunCursor {

	public static void main(String[] args) throws Exception {
		
		//Loading driver & creating connection
		Class.forName("oracle.jdbc.driver.OracleDriver");
		System.out.println("Driver is loaded");
		
		Connection con = 
				DriverManager.getConnection(
						"jdbc:oracle:thin:@localhost:1521:XE",
						"hknit11am", "hari");
		System.out.println("Connection is created");

		//Creating CallableStatement
		CallableStatement cstmt = 
			con.prepareCall( 
				"{ call getAllEmpDetailsFromDept(?, ?) }") ;
		System.out.println("Driver is loaded");

		//registering out parameters
		//cstmt.registerOutParameter(2, OracleTypes.REF_CURSOR);  	//before Java 8v old version
		cstmt.registerOutParameter(2, Types.REF_CURSOR);			//From Java 8v version
		
		//reading dept  
		Scanner scn = new Scanner(System.in);
		
		System.out.print("Enter dept: ");
		String dept = scn.nextLine().toUpperCase();
		
		//setting eno to cstmt object IN parameter
		cstmt.setString(1, dept);
		
		//executing procedure with Cursor
		cstmt.execute();
		
		//reading results from OUT parameter, i.e; cursor
		ResultSet rs =  (ResultSet) cstmt.getObject(2);

		//printing result
		if( rs.next() ){
			//rows available, obtaining RSMD object
			ResultSetMetaData rsmd = rs.getMetaData();
			
			//retrieving number of columns
			int noOfColumns = rsmd.getColumnCount();

			//iterating over columns & printing column name
			for (int i=1; i<=noOfColumns; i++){
				System.out.print("\t"+rsmd.getColumnName(i) );
			}
			System.out.println("\n-----------------------------------");
			
			//for counting number of rows	
			int count = 0;	

			//iterating over all rows 
			//to read & print each column value from every row
			do{

				//reading data from all columns of current row	
//				System.out.println(rs.getInt(1) + "\t" + rs.getString(2) + "\t" 
//										+ rs.getDouble(3) + "\t" + rs.getString(4));
				
				//one row all columns data is printed
				for (int i = 1; i <= noOfColumns ; i ++){
					System.out.print("\t");
					String value = rs.getString(i);
					if(value != null){
						System.out.print(value);
					}
				} 
				
				//moving control to the next line on Console
				System.out.println();

				//incrementing row count
				count++; 

				//checking next row available or not
			}while(rs.next()); 

			//printing number of rows selected
			System.out.println("\n"+ count + " rows selected.");
		}else{
			System.out.println("\nno rows selected.");
		}

		//closing cstmt & con objects
		cstmt.close();
		con.close();
	}
}