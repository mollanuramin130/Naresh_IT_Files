package com.ssnmarket.static_factory_method.feb_20_2025.program1;

import java.util.Scanner;

public class Student {
	private String name;
	private int age;
	private String grade;
	public Student(String name, int age, String grade) {
		super();
		this.name = name;
		this.age = age;
		this.grade = grade;
	}
	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + ", grade=" + grade + "]";
	}
	
	public static Student createStudent() {
		Scanner scanner=new Scanner(System.in);
		
		System.out.print("Enter your Name: ");
		String name=scanner.nextLine();
		
		System.out.print("Enter your age: ");
		int age=scanner.nextInt();
		
		System.out.print("Enter your Grade: ");
		String grade= scanner.nextLine();
		grade= scanner.nextLine();
		
		Student objStudent=new Student(name, age, grade);
		
		
		return objStudent;
		
	}
	
}
