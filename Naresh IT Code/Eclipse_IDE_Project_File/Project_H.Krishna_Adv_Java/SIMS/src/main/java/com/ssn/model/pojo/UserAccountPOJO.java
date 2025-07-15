package com.ssn.model.pojo;
/*
 * SQL> desc user_sims;

Name        Null?       Type            
___________ ___________ _______________ 
USER_ID     NOT NULL    NUMBER(6)       
FULLNAME    NOT NULL    VARCHAR2(30)    
USERNAME    NOT NULL    VARCHAR2(30)    
EMAIL                   VARCHAR2(50)    
PHONE       NOT NULL    VARCHAR2(15)    
ADDRESS                 VARCHAR2(60)    
DOB                     DATE            
PASSWORD    NOT NULL    VARCHAR2(20)  
 */

public class UserAccountPOJO {
 
	private String fullName;
	private String userName;
	private String email;
	private String phone;
	private String address;
	private String dob;
	private String password;

	// Getters and Setters
	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getDob() {
		return dob;
	}

	public void setDob(String dob) {
		this.dob = dob;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}	
}
