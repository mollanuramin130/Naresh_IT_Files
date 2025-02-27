package com.ssnmarket.constractor_Program.feb_19_2025.program3;

public class Employee {
	public int employeeNumber;
	public String employeeName;
	public double employeeSalary;
	
	public Employee(int employeeNumber, String employeeName, double employeeSalary) {
		super();
		this.employeeName=employeeName;
		this.employeeNumber=employeeNumber;
		this.employeeSalary=employeeSalary;
		
		if(employeeNumber<0) {
			this.employeeNumber =0;
			System.err.println("Employee Number must be always positive integer");
		}
		if(employeeSalary<0) {
			this.employeeSalary =0.0;
			System.err.println("Employee Salary must be always positive");
		}
		if(employeeName=="") {
			this.employeeName ="Nur Amin";
			System.err.println("Employee Name not be empty Default Name: Nur Amin");
		}
		
	}

	public int getEmployeeNumber() {
		return employeeNumber;
	}

	public void setEmployeeNumber(int employeeNumber) {
		this.employeeNumber = employeeNumber;
	}

	public String getEmployeeName() {
		return employeeName;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	public double getEmployeeSalary() {
		return employeeSalary;
	}

	public void setEmployeeSalary(double employeeSalary) {
		this.employeeSalary = employeeSalary;
	}

	@Override
	public String toString() {
		return "Employee [employeeNumber=" + employeeNumber + ", employeeName=" + employeeName + ", employeeSalary="
				+ employeeSalary + "]";
	}
	
}
