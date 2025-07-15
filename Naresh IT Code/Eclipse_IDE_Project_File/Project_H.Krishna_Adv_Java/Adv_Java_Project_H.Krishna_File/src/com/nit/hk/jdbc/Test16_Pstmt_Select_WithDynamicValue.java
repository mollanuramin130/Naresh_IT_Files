package com.nit.hk.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.Scanner;

/**
 * Display all students available in the Student table
 * 
 * Test Case #1:
 * 	You must provide option to the user 
 * 		1. either selecting all courses students
 * 		2. or selecting one given course students
 * 
 * Test Case #2: 
 * 	You must display course_Name but not couse_id
 * 
 */
public class Test16_Pstmt_Select_WithDynamicValue {
	public static void main(String[] args) {
		
		final String selectAllStudents = 
				"""
				SELECT s.sid, s.sname, c.course_name, s.fee
				FROM   student s, course c
				WHERE  s.course_id=c.course_id
				ORDER  BY s.sid  
				""";
		
		final String selectCourseStudents = 
				"""
				SELECT s.sid, s.sname, c.course_name, s.fee
				FROM   student s, course c
				WHERE  s.course_id=c.course_id
				AND	   c.course_name=?
				ORDER  BY s.sid
				""";

		try(

			Connection con = DriverManager.getConnection(
								"jdbc:oracle:thin:@localhost:1521:xe",
								"hknit11am", "hari");
				
			PreparedStatement selectAllStudentsPstmt = con.prepareStatement(selectAllStudents);
			PreparedStatement selectCourseStudentsPstmt = con.prepareStatement(selectCourseStudents);
				
		){
			System.out.println("Connection is created");
			System.out.println("PreparedStatements are created");
			
			Scanner scn = new Scanner(System.in);
			
			loop: while(true) {
				System.out.println("\nChoose one option");
				System.out.println("1. Select all students");
				System.out.println("2. Select given course students");
				System.out.println("3. Exit");
				System.out.print("\nEnter option: ");
				
				int option = scn.nextInt(); scn.nextLine();
				
				switch(option) {
					case 1: { //all students
						try(ResultSet rs = selectAllStudentsPstmt.executeQuery()){
							printResults(rs);
						}catch(SQLException e) {
							e.printStackTrace();
						}
						break;
					}
					
					case 2: {//given course students
						
						System.out.print("Enter course name: ");
						String courseName = scn.nextLine();
						
						selectCourseStudentsPstmt.setString(1, courseName);
						
						try(ResultSet rs = selectCourseStudentsPstmt.executeQuery()){
							printResults(rs);
						}catch(SQLException e) {
							e.printStackTrace();
						}
					
						break;
					}
					
					case 3: {//Exit
						System.out.println("Thank You, Visit Again");
						break loop;
					}
					
					default: {
						System.out.println("Error: Invalid option");
					}
					
				}//switch close
			}//while(true) close
			
		}catch(SQLException e) {
			e.printStackTrace();
		}
		
	}//main close

	private static void printResults(ResultSet rs) throws SQLException {
		
			ResultSetMetaData rsmd = rs.getMetaData();
			int count = 0;
			if(rs.next()) {
				System.out.println("======================================================");
				for(int i=1; i<=rsmd.getColumnCount(); i++) {
					System.out.print(rsmd.getColumnName(i) + "\t");
				}
				System.out.println("\n======================================================");
				
				do {
					System.out.println(rs.getInt(1) + "\t" + rs.getString(2) + "\t" +
										rs.getString(3) + "\t"+ rs.getDouble(4));
					count++;
				}while(rs.next());
				System.out.println("======================================================");
			}
			System.out.println("\n"+count + " rows selected");
			
	}
}










