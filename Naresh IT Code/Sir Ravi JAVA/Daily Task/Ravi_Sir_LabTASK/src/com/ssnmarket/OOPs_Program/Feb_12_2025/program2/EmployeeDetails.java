package com.ssnmarket.OOPs_Program.Feb_12_2025.program2;

import java.util.Scanner;

public class EmployeeDetails {
	int employeeId;
	String employeeName;
	double employeeSalary;
	
	public void setEmployeeData() {
		Scanner scanner=new Scanner(System.in);
		
		System.out.print("Enter employee ID: ");
		employeeId=scanner.nextInt();
		
		System.out.print("Enter employee Name: ");
		employeeName=scanner.nextLine();
		employeeName=scanner.nextLine();
		
		System.out.print("Enter employee Salary: ");
		employeeSalary=scanner.nextDouble();
	}
	
	public void getEmployeeData() {
		System.out.println("Employee Id is: "+employeeId);
		System.out.println("Employee Id is: "+employeeName);
		System.out.println("Employee Id is: "+employeeSalary);
	}
	
}
