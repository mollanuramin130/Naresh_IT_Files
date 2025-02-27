package com.ssnmarket.OOPs_Program.Feb_12_2025.program3_Imagination;

import java.util.Scanner;

public class NareshItDetails {
	int branchId;
	String branchName;
	int branchNumberOfEmployee;
	double averageSalary;
	double totalSalaryExpences;
	
	public void setBranchData() {
		Scanner scanner=new Scanner(System.in);

		System.out.print("Enter the Branch Id: ");
		branchId=scanner.nextInt();
		
		System.out.print("Enter the Branch Name: ");
		branchName=scanner.nextLine();
		branchName=scanner.nextLine();
		
		System.out.println("Enter total number of employees: ");
		branchNumberOfEmployee=scanner.nextInt();
		
		System.out.print("Enter the Average salary of Employee: ");
		averageSalary=scanner.nextDouble();
		
		totalSalaryExpences=branchNumberOfEmployee*averageSalary;
		
	}
	
	public void getBranchData() {
		System.out.println("\n\nName of Branch : "+branchName+"\nTotal number of employees are: "+branchNumberOfEmployee+"\nTotal salay of the Branch is: "+totalSalaryExpences);
	}
	
}
