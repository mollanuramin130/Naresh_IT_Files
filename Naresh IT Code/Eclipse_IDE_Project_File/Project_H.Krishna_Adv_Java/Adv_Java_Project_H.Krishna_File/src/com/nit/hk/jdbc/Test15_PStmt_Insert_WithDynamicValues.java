//Test15_PStmt_Insert_WithDynamicValues.java 
package com.nit.hk.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Scanner;

public class Test15_PStmt_Insert_WithDynamicValues {
	
	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
		
		final String insertStudentSQL = 
				"""
				INSERT INTO student(sid, sname, course_id, fee)
				VALUES(student_seq.nextval, ?, ?, ?)
				""";
		
		final String selectCourseIdSQL = 
				"""
				SELECT course_id FROM course
				WHERE course_name=?
				""";
		
		final String selectAllCourseNamesSQL = 
				"""
				SELECT course_name FROM course ORDER BY course_id 
				""";
		
		try (
			//1. Establishing connection
			Connection con = DriverManager.getConnection(
					"jdbc:oracle:thin:@localhost:1521:XE",
					"hknit11am", "hari");
			
			//2. Creating Prepared Statements object
			PreparedStatement insertStudentPstmt 	= con.prepareStatement(insertStudentSQL);
			PreparedStatement selectCoursePstmt 	= con.prepareStatement(selectCourseIdSQL);
			PreparedStatement selectAllCourseNamesPstmt = con.prepareStatement(selectAllCourseNamesSQL);
		){
			System.out.println("Connection is created");
			System.out.println("PreparedStetements are created");
			
			
			int count = 1;
			
			String option = "N";
			program: do {
				System.out.println("\nEnter student"+ count++ +" details");

				System.out.print("Enter sname: ");
				insertStudentPstmt.setString(1, scn.nextLine());
				
				int courseId;
				while(true) {
					System.out.print("Enter course: ");
					String course = scn.nextLine();
					
					selectCoursePstmt.setString(1, course);
					
					try(ResultSet courseIdRs = selectCoursePstmt.executeQuery()){
						
						if(courseIdRs.next()) {
							courseId = courseIdRs.getInt(1);
							break;
						}else {
							System.out.println("Error: The course "+course+" is not available\n");
							
							try(ResultSet coursesNameRs = selectAllCourseNamesPstmt.executeQuery()){
								ArrayList<String> coursesNamesList = new ArrayList<>();
								if(coursesNameRs.next()) {
									
									do {
										coursesNamesList.add("'"+coursesNameRs.getString(1)+"'");
									}while(coursesNameRs.next());
									
									System.out.println("The available courses are");
									System.out.println("  "+coursesNamesList); 
								}else {
									System.out.println("Error: No course is created yet");
									System.out.println("Error: First create course, then insert student");
									break program;
								}
							}catch (SQLException e) {
								e.printStackTrace();
								
							}//coursesNames try,catch close
							
						}//while(true) close
						
					}catch (SQLException e) {
						e.printStackTrace();
						
					}//course_id try,catch close
					
				}//while(true) end
				
				insertStudentPstmt.setInt(2, courseId);
				
				System.out.print("Enter fee: ");
				insertStudentPstmt.setDouble(3, scn.nextDouble());
				
				insertStudentPstmt.executeUpdate();
				System.out.println("1 row is inserted");
				
				System.out.print("\nDo you want to continue(Y/N)?:  ");
				option = scn.next();  scn.nextLine();
				
			}while(option.equalsIgnoreCase("Y"));
			//end of program:do...while(-)
			
			System.out.println("\n============== Thank You, Bye, See You Again Soon ================");
			
		} catch(SQLException e) {
			e.printStackTrace();
		}

	}//main close
}//class close











