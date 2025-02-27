package com.nur.Exam;

import java.util.Scanner;

public class StudentGradeCalculatorELC{
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
        String name=sc.nextLine();
        int marks=sc.nextInt();
        Student stud=new Student(name,marks);
        
        StudentGrade studGrade= CalculateStudentGrade.calculateGrade(stud);
        System.out.println(studGrade);
	}
}

class Student{
    private String name;
    private int marks;

    Student(String name,int marks){
        super();
        this.name=name;
        this.marks=marks;
    }

    public void setName(String name){
        this.name=name;
    }
    public String getName(){
        return this.name;
    }

    public void setMarks(int marks){
        this.marks=marks;
    }

    public int getMarks(){
        return this.marks;
    }
    
    public String toString(){
        return this.name;
    }
}

class StudentGrade{
    private Student stud;
    private char studentGrade;

    StudentGrade(Student stud,char studentGrade){
        this.stud=stud;
        this.studentGrade=studentGrade;
    }

    public String toString(){
        return "The Student "+stud+" has '"+this.studentGrade+"' Grade";
    }
}

class CalculateStudentGrade{
    public static StudentGrade calculateGrade(Student s){
        int marks=s.getMarks();

        if(marks>=90){
            return new StudentGrade(s,'A');
        }
        else if(marks>=75 && marks<90){
            return new StudentGrade(s,'B');
        }
        else if(marks>=60 && marks<75){
            return new StudentGrade(s,'C');
        }
        else{
            return new StudentGrade(s,'D');
        }
    }
}