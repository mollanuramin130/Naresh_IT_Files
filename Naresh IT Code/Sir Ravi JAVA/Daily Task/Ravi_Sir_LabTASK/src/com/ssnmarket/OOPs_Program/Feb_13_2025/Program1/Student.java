package com.ssnmarket.OOPs_Program.Feb_13_2025.Program1;

public class Student {

	public static void main(String[] args) {
		StudentDetails nurDetails =new StudentDetails();
		

nurDetails.setStudentData(102, "Nur Amin Molla", 50);
		
		nurDetails.calculateGrade();
		System.out.println(nurDetails.displayDetails());
	}

}
