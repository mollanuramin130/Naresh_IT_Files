//Test01_Connection.javar
	package com.nit.hk.jdbc;

	import java.sql.DriverManager;
	import java.sql.Connection;
	import java.sql.SQLException;

	public class Test01_Connection {
		public static void main(String[] args) 
					throws ClassNotFoundException, 
						SQLException {

		//1. Loading Oracle driver into JVM	
			Class.forName("mysql driver class name");
			
		//2. Creating connection to DB
			Connection con = DriverManager.getConnection(
						"mysql url", 
						"mysql usn", 
						"mysql pwd");

			System.out.println("Connection is established");
			
		//3. Printing connection object class name	
			System.out.println("con: " + con);
			
			
		//4. Closing connection 
			con.close();

		}
	}
	