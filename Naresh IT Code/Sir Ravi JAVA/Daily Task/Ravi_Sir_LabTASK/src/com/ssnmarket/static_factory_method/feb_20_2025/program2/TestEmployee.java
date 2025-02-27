package com.ssnmarket.static_factory_method.feb_20_2025.program2;

import java.util.Scanner;

import com.ssnmarket.static_factory_method.feb_20_2025.program1.Student;

public class TestEmployee {

	public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter number of Object");
		int noOfObject=sc.nextInt();
		Object arr[] =new Object[noOfObject];
		
		for(int i=0;i<noOfObject;i++) {
			Employee obj=Employee.creatEmployee();
			
			arr[i]=obj;
		}
		for(int i=0;i<noOfObject;i++) {
			
			System.out.println(arr[i]);
		}
	}

}
