package com.nit.hk.jdbc;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

/**
 * Develop a program to connect the Java program to any DB dynamically
 * ===================================================================
 * - For connecting a Java program to any database we must not hard code 
 *   driver class name, url, username and password in Java program directly  
 * 
 * - We must pass the driver four values from a properties file dynamically 
 * 
 * - A text file whose extension is properties and stores data in the format 
 *   (name=value) pair is called properties file 
 * 
 * - The (name=value) pair is called property
 * - In a properties file
 * 		- In a property name and value is separated by = 
 * 		- Each property is placed in one separate line 
 * 
 * - In the Java program, for storing the properties
 *   We have a predefined class called 'Properties' in java.util package
 *   
 * - Steps to follow for reading properties from properties file and storing in Java program
 * 		1. Create a properties file with the required number of properties
 * 			right click on project -> file -> enter file and save below properties
 * 
 * 				//driverinfor.properties 
 * 				DRIVER=oracle.jdbc.driver.OracleDriver
 * 				URL=jdbc:oracle:thin:@localhost:1521:xe
 * 				USN=hknit11am
 * 				PWD=hari
 * 				
 * 		2. Inside main method create Properties object
 * 
 *      3. Load properties from the properties file into Properties object 
 *      	by using the method load(FR) of Properties class
 *      
 *      		public void load(FileReader fr) throws IOException
 *      
 *      4. Read properties from the Properties object by property name
 *         by using the method getProperty(pname)
 *      
 *      		public String getProperty(String propetyName)
 *       	
 * 		5. Store the returned property value in a local variable
 *         then use this local variable in the next lines of program
 * 
 * Below program explains connecting to a DB dynamically by reading 
 * driver properties and query from properties file
 *  
 */

public class Test17_DynaDBConnection_ProperitesFile {
	public static void main(String[] args) 
							throws FileNotFoundException, IOException, 
									ClassNotFoundException, SQLException {
		
	//1. creating empty properties object
		Properties props = new Properties();
		
	//2. loading properties from Properties file
		props.load(new FileReader("driverinfo.properties"));
		
	//3. reading properties from Properties object
		final String DRIVER = props.getProperty("DRIVER");
		final String URL = props.getProperty("URL");
		final String USN = props.getProperty("USN");
		final String PWD = props.getProperty("PWD");
		final String QUERY = props.getProperty("QUERY");
		
	//4. passing the values to JDBC program
		
	// 1. Loading driver
		Class.forName(DRIVER);

	//2. Establishing connection
		Connection con = DriverManager.getConnection(URL, USN, PWD);

	//3. Creating Statement object
		Statement stmt = con.createStatement();
		
	//4. Executing SELECT Query and obtains ResultSet and RSMD objects
		ResultSet 	  		rs = stmt.executeQuery(QUERY);
		ResultSetMetaData rsmd = rs.getMetaData();
		
	//5. Fetching Columns and Rows RSMD and RS  
		int count = 0;
		if(rs.next()) {

			for(int i=1; i<=rsmd.getColumnCount(); i++) {
				System.out.print(rsmd.getColumnName(i) +"\t");
			}
			System.out.println("\n-----------------------------------------------");
			
			do{
				for(int i=1; i<=rsmd.getColumnCount(); i++) {
					System.out.print(rs.getString(i) +"\t");
				}
				System.out.println();
				count++;
			}while(rs.next()); 
		}
		
		System.out.println("\n"+ count + " rows selected");
		 
	//6. closing connections
		rs.close();
		stmt.close();
		con.close();

		
	}
}
