package com.ssnmarket.OOPs_Program.Feb_13_2025.Program1;

public class StudentDetails {
	int studentId;
	String studentName;
	int marks;
	char grade;
	
	public void setStudentData(int id,String name,int mark) {
		studentId=id;
		studentName=name;
		marks=mark;
	}
	
	public void calculateGrade() {
		if(marks>=90) {
			grade='A';
		}
		else if (marks>=80 && marks<90) {
			grade='B';
		}
		else if (marks>=70 && marks<80	) {
			grade='C';
		}
		else if (marks>=60 && marks<70) {
			grade='D';
		}
		else {
			grade='E';
		}
	}
	
	public String displayDetails() {
		return "Student [name= "+studentName+", studentId= "+studentId+", marks= "+ marks+", grade= "+grade+"]";
	}
	
}
