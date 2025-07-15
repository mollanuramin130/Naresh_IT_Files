/*
 * ========================================================================================
 * 					PreparedStatement with Select query with joins 
 * ========================================================================================
 *	Develop the a program to retrieve records from Student table
 *  You must display the course name in place of course_id 
 *	
 *				Output must be as below 
 *	 ==============================================
 *		sid		sname		course			fee
 *	 ==============================================
 *		101		S1			Core Java		3500
 *		102		S2			Core Java		3500
 *		103		S3			Oracle			300
 *		104		S4			HTML, CSS, JS	2500
 *		104		S5			Adv Java		3500
 *	 ==============================================
 *
 * You must give choice to user to retrieve either
 * 		1. All records
 * 		2. Given course records
 * 		3. Given more than one courses records
 * 
 * 		All records query
 *         SELECT *
 *         FROM Student;
 *         
 * 		Given course records
 *         SELECT *
 *         FROM Student
 *         WHERE course_name='given course name';
 *         
 * 		Given multiple course records
 *         SELECT *
 *         FROM Student
 *         WHERE course_name IN ('course1', 'course2', 'course3') ;
 *
 *                 
 * Queries with join condition to display course name instead of course_id
 * ==========================================================================                
 * 		SELECT  s.sid, s.sname, c.course_name, s.fee
 * 		FROM    student s, course c 
 * 		WHERE   s.course_id=c.course_id;
 * 	===========================================================
 * 		SELECT  s.sid, s.sname, c.course_name, s.fee
 * 		FROM    student s, course c 
 * 		WHERE   s.course_id=c.course_id
 * 		AND 	c.course_name IN ('Core Java');  
 * 
 * 	===========================================================
 * 		SELECT  s.sid, s.sname, c.course_name, s.fee
 * 		FROM    student s, course c 
 * 		WHERE   s.course_id=c.course_id
 * 		AND 	c.course_name IN ('Core Java', 'Oracle');  
 * 	===========================================================
 * 
 */
//Test15_Pstmt_Insert.java
package com.nit.hk.jdbc;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.Arrays;
import java.util.Properties;
import java.util.Scanner;

public class Test18_Pstmt_SelectQueryWithStreamAPI {
	public static void main(String[] args) {
		
		Connection 			con 				= null;
		PreparedStatement 	allCoursesPstmt 	= null;
		
		try {
			//Loading properties from properties file
			Properties props = new Properties();
			props.load(new FileReader("driverinfo.properties"));
			System.out.println("Driver Properies are loaded");
						
			//Reading driver properties from the Properties object
			final String DRIVER = props.getProperty("DRIVER");
			final String DB_URL	= props.getProperty("DB_URL");
			final String DB_USN	= props.getProperty("DB_USN");
			final String DB_PWD	= props.getProperty("DB_PWD");
			System.out.println("Driver Properies are read");
			
			//1. Loading JDBC driver 
			Class.forName(DRIVER);
			System.out.println("Driver is loaded");
			
			//2. Establishing connection
			con = DriverManager.getConnection(DB_URL, DB_USN, DB_PWD);
			System.out.println("Connection is created");
			
			//3. Creating PreparedStatement object
			allCoursesPstmt = con.prepareStatement(
						"""
						SELECT  s.sid, s.sname, c.course_name, s.fee
						FROM    student s, course c 
						WHERE   s.course_id=c.course_id
						ORDER BY s.sid
					    """
					);

			System.out.println("Prepared Statements are created");
			
			Scanner scn = new Scanner(System.in);
			loop: while(true) {
				System.out.println("\nChoose one option");
				System.out.println(" 1. Select All Couses Students ");
				System.out.println(" 2. Select Given Course(s) Students");
				System.out.println(" 3. Exit");
				
				System.out.print("\nEnter option: ");
				int option = scn.nextInt(); scn.nextLine();
				
				switch(option) {
					case 1: //all courses
						displyRows(allCoursesPstmt);
						
						break;
						
					case 2: //given course(s)
						
						//reading courses from end-user
						System.out.println("Enter courses with | separator");
						String courses = scn.nextLine(); 	//1. "Core Java"
															//2. "Core Java | Adv Java"

						//Split the courses to use each course separately
						String[] coursesArray = courses.split("\\|"); //Suppressing | meaning to use it as |
						
						//Preparing number of place holders (?s) dynamically 
						//based on number of courses entered by the user
				/*	
				  	//Old Style, Java 7v Style, code with loop and StringBuilder object
						StringBuffer placeholders = new StringBuffer();
						for(int i=0; i<coursesArray.length;i++ ) {
							placeholders.append("?,");
						}

						//removing last , from this placeholders string
						int lastCommaIndex = placeholders.lastIndexOf(",");
						placeholders.deleteCharAt(lastCommaIndex);
				*/		
					//Modern style, Java 8v Stream API style, code 	
						String placeholders = 
								String.join("," ,	Arrays.stream(coursesArray) 
													.map(course -> "?")
													.toArray(String[]::new)
											);						
								
						//substituting placeholders in the query
						String query = 								
								"""
								SELECT  s.sid, s.sname, c.course_name, s.fee
								FROM    student s, course c 
								WHERE   s.course_id=c.course_id
								AND 	c.course_name IN (%s)
								ORDER BY c.course_name, s.sid
							    """;
						query = query.formatted(placeholders);
						
						//printing final query
						System.out.println(query);
						
						//Creating Pstmt object with this dynamic placeholders query
						try(
							PreparedStatement 	givenCoursesPstmt = con.prepareStatement(query)
						){

							//setting given courses, each course separately to the each ?  
							StringBuffer sb = new StringBuffer();
							for(int i=0; i<coursesArray.length; i++) {
								givenCoursesPstmt.setString(i+1, coursesArray[i].trim());
							}
							
							//executing query
							displyRows(givenCoursesPstmt);
							
						}catch(SQLException e) {
							e.printStackTrace();
						}
						break;
						
					case 3: //exit
						System.out.println("Thank you, Tata Bye Bye");
						break loop;
						
					default: //invalid option
						System.out.println("Invalid option");;
						
				}
			}//while close
		}catch(ClassNotFoundException e) {
			System.out.println("Driver class is not found");
			
		}catch(IOException | SQLException e) {
			e.printStackTrace();
			
		}finally {
			try {
				if(allCoursesPstmt != null)
					allCoursesPstmt.close();
			}catch(SQLException e) { }
			
			try {
				if(con != null)
					con.close();
			}catch(SQLException e) { }
			
		}

	}//main close
	
	private static void displyRows(PreparedStatement pstmt) {
		
		try(ResultSet rs = pstmt.executeQuery()){
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
							rs.getInt(1) + "\t"+ 
							rs.getString(2) + "\t"+ 
							rs.getString(3) + "\t"+ 
							rs.getDouble(4));
					count++;
				}while(rs.next()); 
			}
			System.out.println("\n"+ count + " rows selected");
		}catch(SQLException e){
			e.printStackTrace();
		}
		
	}//displyRows() method close
		
}//class close
