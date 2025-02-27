package com.ssnmarket.static_factory_method.feb_20_2025.program3;

import java.util.Scanner;


public class TestProduct {

	public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter number of Object");
		int noOfObject=sc.nextInt();
		Object arr[] =new Object[noOfObject];
		
		for(int i=0;i<noOfObject;i++) {
			System.out.print("Enter your product Id: ");
			int id=sc.nextInt();

			System.out.print("Enter your product Name: ");
			String name=sc.nextLine();
			name=sc.nextLine();

			System.out.print("Enter your product price: ");
			double price= sc.nextDouble();

			System.out.print("Enter your product quantity: ");
			int quantity=sc.nextInt();
			
			Product obj=Product.creatProduct(id, name, price, quantity);
			
			arr[i]=obj;
		}
		for(int i=0;i<noOfObject;i++) {
			
			System.out.println(arr[i]);
		}
	}

}


