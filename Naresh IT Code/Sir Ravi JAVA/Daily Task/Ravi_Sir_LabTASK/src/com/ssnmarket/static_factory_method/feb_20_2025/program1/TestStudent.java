package com.ssnmarket.static_factory_method.feb_20_2025.program1;

import java.util.Scanner;

public class TestStudent {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter number of Object");
		int noOfObject=sc.nextInt();
		
		for(int i=0;i<noOfObject;i++) {
			Student obj=Student.createStudent();
			System.out.println(obj);
		}
	
	}

}
