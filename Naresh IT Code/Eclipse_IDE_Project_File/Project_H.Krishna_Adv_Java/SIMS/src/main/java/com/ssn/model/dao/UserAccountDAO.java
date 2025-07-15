package com.ssn.model.dao;

import java.io.InputStream;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Properties;

import com.ssn.model.pojo.UserAccountPOJO;

public class UserAccountDAO {
	Connection connection;
	PreparedStatement userInsertPstmt;
	PreparedStatement userSelectPstmt;
	PreparedStatement userUpdatePstmt;
	PreparedStatement userDeletePstmt;
	PreparedStatement userLoginPstmt;

	public boolean openConnection() {
		Properties properties = new Properties();
		InputStream driverinfoResource = getClass().getClassLoader().getResourceAsStream("driverinfo.properties");
		if (driverinfoResource == null) {
			System.err.println("Could not find driverinfo.properties file.");
			return false;
		}
		try {
			properties.load(driverinfoResource);
			String driver = properties.getProperty("DRIVER");
			String db_url = properties.getProperty("DB_URL");
			String db_user = properties.getProperty("DB_USERNAME");
			String db_password = properties.getProperty("DB_PASSWORD");

			Class.forName(driver);
			connection = java.sql.DriverManager.getConnection(db_url, db_user, db_password);
			System.out.println("Connection established successfully.");
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}

	public boolean closeConnection() {
		if (connection != null) {
			try {
				connection.close();
				return true;
			} catch (Exception e) {
				e.printStackTrace();
				return false;
			}
		}
		return false;
	}

	public Connection getConnection() {
		if (connection == null) {
			if (!openConnection()) {
				System.err.println("Failed to open connection.");
			}
		}
		return connection;
	}

	public boolean createStatement() {
		String userInsertQuery = """
				INSERT INTO user_sims (USER_ID,FULLNAME, USERNAME, EMAIL, PHONE, ADDRESS, DOB, PASSWORD)
				VALUES (SQ_USER_SIMS_USER_ID.NEXTVAL,?, ?, ?, ?, ?, ?, ?)
				""";

		String userSelectQuery = """
					SELECT * FROM user_sims WHERE USERNAME = ?
				""";

		String userUpdateQuery = """
					UPDATE user_sims SET FULLNAME = ?, EMAIL = ?, PHONE = ?, ADDRESS = ?, DOB = ?, PASSWORD = ?
					WHERE USERNAME = ?
				""";

		String userDeleteQuery = """
					DELETE FROM user_sims WHERE user_id = (
						SELECT user_id FROM user_sims WHERE USERNAME = ?
					)
				""";

		String userLoginQuery = """
					SELECT * FROM user_sims WHERE USERNAME = ? AND PASSWORD = ?
				""";
		try {
			userInsertPstmt = getConnection().prepareStatement(userInsertQuery);
			userSelectPstmt = getConnection().prepareStatement(userSelectQuery);
			userUpdatePstmt = getConnection().prepareStatement(userUpdateQuery);
			userDeletePstmt = getConnection().prepareStatement(userDeleteQuery);
			userLoginPstmt = getConnection().prepareStatement(userLoginQuery);
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}

	public void closeStatement() {
		try {
			if (userInsertPstmt != null)
				userInsertPstmt.close();
			if (userSelectPstmt != null)
				userSelectPstmt.close();
			if (userUpdatePstmt != null)
				userUpdatePstmt.close();
			if (userDeletePstmt != null)
				userDeletePstmt.close();
			if (userLoginPstmt != null)
				userLoginPstmt.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		connection = null; // Reset connection to allow reopening
	}

	public boolean createUser(UserAccountPOJO user) {
		if (user == null || !createStatement()) {
			return false;
		}
		try {
			userInsertPstmt.setString(1, user.getFullName());
			userInsertPstmt.setString(2, user.getUserName());
			userInsertPstmt.setString(3, user.getEmail());
			userInsertPstmt.setString(4, user.getPhone());
			userInsertPstmt.setString(5, user.getAddress());
			userInsertPstmt.setDate(6, java.sql.Date.valueOf(user.getDob()));
			userInsertPstmt.setString(7, user.getPassword());
			int rowsAffected = userInsertPstmt.executeUpdate();
			return rowsAffected > 0;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		} finally {
			closeStatement();
		}
	}

	public UserAccountPOJO loginUser(String userName, String password) {
		if (userName == null || password == null ) {
			//System.out.println("userName : " + userName + ", password: " + password);
			return null;
		}
		try {
			userLoginPstmt.setString(1, userName);
			userLoginPstmt.setString(2, password);
			ResultSet resultSet = userLoginPstmt.executeQuery();
			if (resultSet.next()) {
				UserAccountPOJO user = new UserAccountPOJO();
				user.setFullName(resultSet.getString("FULLNAME"));
				user.setUserName(resultSet.getString("USERNAME"));
				user.setEmail(resultSet.getString("EMAIL"));
				user.setPhone(resultSet.getString("PHONE"));
				user.setAddress(resultSet.getString("ADDRESS"));
				user.setDob(resultSet.getDate("DOB").toLocalDate().toString());
				user.setPassword(resultSet.getString("PASSWORD"));
				return user;
			}
			return null; // User not found
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		} finally {
			closeStatement();
		}
	}
	
//	public UserAccountPOJO loginUser(String userName, String password) {
//		if (userName == null || password == null || !createStatement()) {
//			return -1;
//		}
//		try {
//			userLoginPstmt.setString(1, userName);
//			userLoginPstmt.setString(2, password);
//			var resultSet = userLoginPstmt.executeQuery();
//			if (resultSet.next()) {
//				return resultSet.getLong("USER_ID");
//			}
//			return -1; // User not found
//		} catch (Exception e) {
//			e.printStackTrace();
//			return -1;
//		} finally {
//			closeStatement();
//		}
//	}

	public boolean updateUser(UserAccountPOJO user) {
		if (user == null || !createStatement()) {
			return false;
		}
		try {
			userUpdatePstmt.setString(1, user.getFullName());
			userUpdatePstmt.setString(2, user.getEmail());
			userUpdatePstmt.setString(3, user.getPhone());
			userUpdatePstmt.setString(4, user.getAddress());
			userUpdatePstmt.setDate(5, java.sql.Date.valueOf(user.getDob()));
			userUpdatePstmt.setString(6, user.getPassword());
			userUpdatePstmt.setString(7, user.getUserName());
			int rowsAffected = userUpdatePstmt.executeUpdate();
			return rowsAffected > 0;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		} finally {
			closeStatement();
		}
	}

	public boolean deleteUser(String userName) {
		if (userName == null || !createStatement()) {
			return false;
		}
		try {
			userDeletePstmt.setString(1, userName);
			int rowsAffected = userDeletePstmt.executeUpdate();
			return rowsAffected > 0;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		} finally {
			closeStatement();
		}
	}

	public ResultSet getUserByUserName(String userName) {
		if (userName == null || !createStatement()) {
			return null;
		}
		try {
			userSelectPstmt.setString(1, userName);
			return userSelectPstmt.executeQuery();
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		} finally {
			closeStatement();
		}
	}

	public ArrayList<UserAccountPOJO> getAllUsers() {
		ArrayList<UserAccountPOJO> userList = new ArrayList<>();
		if (!createStatement()) {
			return userList;
		}
		String query = "SELECT * FROM user_sims";
		try (PreparedStatement pstmt = getConnection().prepareStatement(query); ResultSet rs = pstmt.executeQuery()) {
			while (rs.next()) {
				UserAccountPOJO user = new UserAccountPOJO();
				user.setFullName(rs.getString("FULLNAME"));
				user.setUserName(rs.getString("USERNAME"));
				user.setEmail(rs.getString("EMAIL"));
				user.setPhone(rs.getString("PHONE"));
				user.setAddress(rs.getString("ADDRESS"));
				user.setDob(rs.getDate("DOB").toLocalDate().toString());
				user.setPassword(rs.getString("PASSWORD"));
				userList.add(user);
			}
			return userList;
		} catch (Exception e) {
			e.printStackTrace();
			return userList;
		} finally {
			closeStatement();
		}
	}
}
