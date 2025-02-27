package com.ssnmarket.constractor_Program.feb_19_2025.program1;

public class Employee {
	private String firstName;
	private String lastName;
	private int employeeId;
	private double salary;
	private int noOfProject;
	
	public Employee(String firstName, String lastName, int employeeId, double salary, int noOfProject) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.employeeId = employeeId;
		this.salary = salary;
		this.noOfProject = noOfProject;
	}
	
	public void calculateSalary() {
		if(noOfProject<0) {
			System.err.println("Number of project cannot be negative");
			System.out.println("Salary remains "+salary);
		}
		else if(noOfProject>=5 && noOfProject<10) {
			salary+=5000;
			System.out.println("updated salary: "+salary);
		}
		else if(noOfProject>=10 && noOfProject<20) {
			salary+=10000;
			System.out.println("updated salary: "+salary);
		}
		else if(noOfProject>=20) {
			salary+=15000;
			System.out.println("updated salary: "+salary);
		}else {
			System.out.println("updated salary: "+salary);
		}
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public int getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public int getNoOfProject() {
		return noOfProject;
	}

	public void setNoOfProject(int noOfProject) {
		this.noOfProject = noOfProject;
	}

	@Override
	public String toString() {
		return "Employee [firstName=" + firstName + ", lastName=" + lastName + ", employeeId=" + employeeId
				+ ", salary=" + salary + ", noOfProject=" + noOfProject + "]";
	}
	
	
	
}
