package com.ssnmarket.OOPs_Program.Feb_13_2025.Program2;

public class EmployeeDetails {
	String firstName;
	String lastName;
	int employeeId;
	double salary;
	int noOfProject;
	
	public void setEmployeeData(String firstName,String lastName,int id,double salary,int noOfProject) {
		this.firstName=firstName;
		this.lastName=lastName;
		employeeId=id;
		this.salary=salary;
		this.noOfProject=noOfProject;
		
		calculateSalary();
	}
	private void calculateSalary() {
		if(noOfProject>=5 && noOfProject<10) {
			salary=salary+5000;
		}
		else if (noOfProject>=10 && noOfProject<20) {
			salary=salary+10000;
		}
		else {
			salary+=15000;
		}
	}
	
	public String displayDetails() {
		return "["
				+ "\nEmployee Name is: "+firstName+" "+lastName
				+ "\nEmployee ID is:"+employeeId	
				+ "\nSalary: "+salary
				+ "\nNumber of Project done:"
				+noOfProject+ "\n]";
	}
}
