//Test14_JDBC_Select_Program_WithDynamicValues.java 
package com.nit.hk.jdbc;

import java.util.Scanner;

import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;

public class Test14_Stmt_Select_Program_WithDynamicValues {
	
	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
		System.out.print("Enter course: ");
		String course = scn.nextLine();
		
		try (
			//1. Establishing connection
			Connection con = DriverManager.getConnection(
					"jdbc:oracle:thin:@localhost:1521:XE",
					"hknit11am", "hari");
			
			//2. Creating Statement object
			Statement stmt = con.createStatement();
			
			//3. Executed SELECT and obtain ResultSet and RSMD object
			ResultSet rs = stmt.executeQuery(
							"SELECT * FROM student " + 
							"WHERE course_id = (select course_id from course where course_name = '"+course+"') "+ 
							"ORDER BY sid");
			){

			ResultSetMetaData rsmd = rs.getMetaData();
			
			//5. Fetching results from DB
			int count = 0;
			if(rs.next()) {

				for(int i=1; i<=rsmd.getColumnCount(); i++) {
					System.out.print(rsmd.getColumnName(i) +"\t");
				}
				System.out.println("\n-----------------------------------------------");
				
				do{
					System.out.println(
					    rs.getInt(1) + "\t"+ rs.getString(2) + "\t" + 
					    rs.getInt(3) + "\t"+ rs.getDouble(4));
					    
					count++;
				}while(rs.next()); 
			}
			System.out.println("\n"+ count + " rows selected");
			
		} catch(SQLException e) {
			e.printStackTrace();
		}

	}//main close
}//class close











