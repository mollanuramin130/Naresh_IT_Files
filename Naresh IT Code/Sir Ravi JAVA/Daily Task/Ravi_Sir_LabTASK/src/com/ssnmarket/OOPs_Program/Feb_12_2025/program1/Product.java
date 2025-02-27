package com.ssnmarket.OOPs_Program.Feb_12_2025.program1;

public class Product {

	public static void main(String[] args) {
		
		ProductDetails foodProduct=new ProductDetails();
		
		foodProduct.setProductData();
		foodProduct.getProductInfo();
		
		System.out.println("----------------------------------\n");
		
		ProductDetails liquidProductDetails=new ProductDetails();
		
		liquidProductDetails.setProductData();
		liquidProductDetails.getProductInfo();
		
		System.out.println("----------------------------------\n");
		foodProduct.getProductInfo();
		
		System.out.println("----------------------------------\n");
	}

}
