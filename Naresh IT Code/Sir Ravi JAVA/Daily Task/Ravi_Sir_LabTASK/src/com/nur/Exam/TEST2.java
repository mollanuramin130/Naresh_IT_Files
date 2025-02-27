package com.nur.Exam;

import java.util.*;

public class TEST2{
    public static void main(String [] args){
        Employee swati = new Employee();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter employee Number :");
        int employeeNumber=sc.nextInt();
        System.out.println("Enter employee Name :");
        String employeeName=sc.nextLine();
        employeeName=sc.nextLine();
        System.out.println("Enter employee Salary :");
        double employeeSalary=sc.nextDouble();

        swati.setEmployeeDetails(employeeNumber,employeeName,employeeSalary);
        swati.getEmployeeDetails();
        swati.calculateSalaryIncrement();
        sc.close();

    }
}
class Employee{
    int employeeNumber ;
    String employeeName ;
    double employeeSalary ;

    public void  setEmployeeDetails(int number ,String name,double salary ){
        employeeNumber=number;
        employeeName=name;
        employeeSalary=salary;
    }
        public void calculateSalaryIncrement(){
            
    
            getEmployeeDetails();
            if(employeeSalary<50000){
                double increment=employeeSalary*0.1;
                System.out.println("Salary increment amount: "+increment+"\nUpdated salary: "+(employeeSalary+increment));
            }
            else if(employeeSalary>=50000 && employeeSalary<=80000){
                double increment=employeeSalary*0.07;
                System.out.println("Salary increment amount: "+increment+"\nUpdated salary: "+(employeeSalary+increment));
            }
            else{
                double increment=employeeSalary*0.5;
                System.out.println("Salary increment amount: "+increment+"\nUpdated salary: "+(employeeSalary+increment));
            }
    }

        
        public void getEmployeeDetails(){
            System.out.println("Employee Number: "+employeeNumber+"\nEmployee Name: "+employeeName+"\nEmployee Salary: "+employeeSalary);
        }
    
}
