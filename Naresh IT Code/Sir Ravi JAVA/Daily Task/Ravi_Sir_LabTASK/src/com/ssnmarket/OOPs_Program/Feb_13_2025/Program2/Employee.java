package com.ssnmarket.OOPs_Program.Feb_13_2025.Program2;

public class Employee {

	public static void main(String[] args) {
		EmployeeDetails nurEmployeeDetails=new EmployeeDetails();
		
	nurEmployeeDetails.setEmployeeData("Nur","Amin"	, 1002,56000, 11);	
	//nurEmployeeDetails.calculateSalary();
	System.out.println(nurEmployeeDetails.displayDetails());
	EmployeeDetails shadabEmployeeDetails=new EmployeeDetails();
	
	shadabEmployeeDetails.setEmployeeData("Shadab","Khan"	, 2001,55000, 9);	
	//shadabEmployeeDetails.calculateSalary();
	System.out.println(shadabEmployeeDetails.displayDetails());
		
	}

}
