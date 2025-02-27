package com.ssnmarket.OOPs_Program.Feb_12_2025.program1;

import java.util.Scanner;

public class ProductDetails {
	int productId;
	String productName;
	double productPrice;

	public void setProductData() {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Enter your product id: ");
		productId = scanner.nextInt();
		System.out.print("Enter your product Name: ");
		productName = scanner.nextLine();
		productName = scanner.nextLine();
		System.out.print("Enter your product price: ");
		productPrice = scanner.nextDouble();
	}
	
	public void getProductInfo() {
		System.out.println("Product Id is: "+productId);
		System.out.println("Product name is: "+productName);
		System.out.println("Product price is: "+productPrice);
	}
}
