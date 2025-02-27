package com.ssnmarket.constractor_Program.feb_19_2025.program3;

public class Tester {

	public static void main(String[] args) {
		
		Employee nareshEmployee = new Employee(232, "", 43000);
		
		double salary=nareshEmployee.getEmployeeSalary();
		
		if(salary>=60000) {
			System.out.println("Employee is a Developer");
		}
		else if(salary>=40000 && salary<60000) {
			System.out.println("Employee is a Designer");
		}
		else if(salary<40000) {
			System.out.println("Employee is Tester");
		}
		System.out.println(nareshEmployee);
	}

}
