package com.ssnmarket.static_factory_method.feb_20_2025.program2;

import java.util.Scanner;

import com.ssnmarket.static_factory_method.feb_20_2025.program1.Student;

public class Employee {
	private int id;
	private String name;
	private double salary;
	private String department;
	private double annualSalary;
	public Employee(int id, String name, double salary, String department) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.department = department;
	}
	
	public static Employee creatEmployee() {
		Scanner scanner=new Scanner(System.in);
		
		System.out.print("Enter your Id: ");
		int id=scanner.nextInt();
		
		System.out.print("Enter your Name: ");
		String name=scanner.nextLine();
		name=scanner.nextLine();
		
		System.out.print("Enter your Salary: ");
		double salary= scanner.nextDouble();
		
		System.out.print("Enter your Department Name: ");
		String department=scanner.nextLine();
		department=scanner.nextLine();
		
		Employee objEmployee=new Employee(id, name, salary, department);
		objEmployee.calculateAnnualSalary();
		return objEmployee;
	}
	
	public double calculateAnnualSalary() {
		annualSalary=12*salary;
		if(department.equalsIgnoreCase("sales")) {
			annualSalary=annualSalary+annualSalary*0.1;
			return annualSalary;
		}
		else if(department.equalsIgnoreCase("engineering")) {
			annualSalary=annualSalary+annualSalary*0.15;
			return annualSalary;
		}
		else if(department.equalsIgnoreCase("hr")) {
			annualSalary=annualSalary+annualSalary*0.08;
			return annualSalary;
		}
		else {
			annualSalary=annualSalary+annualSalary*0.05;
			return annualSalary;
		}
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + ", department=" + department
				+ ", annualSalary=" + annualSalary + "]";
	}
}
