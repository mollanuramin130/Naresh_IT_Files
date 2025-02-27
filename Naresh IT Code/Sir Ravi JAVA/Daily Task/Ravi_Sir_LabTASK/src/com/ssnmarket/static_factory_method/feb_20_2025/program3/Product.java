package com.ssnmarket.static_factory_method.feb_20_2025.program3;

import java.util.Scanner;


public class Product {
	private int productId;
	private String productName;
	private double price;
	private int quantity;
	private double total;
	
	
	public Product(int productId, String productName, double price, int quantity) {
		super();
		this.productId = productId;
		this.productName = productName;
		this.price = price;
		this.quantity = quantity;
	}

	public static Product creatProduct(int productId, String productName, double price, int quantity) {
		
		
		Product objProduct=new Product(productId, productName, price, quantity);
		objProduct.calculateTotalAmount();
		return objProduct;
	}
	
	public double calculateTotalAmount() {
		total=price*quantity;
		if(total>1000) {
			total=total -total*.1;
			return total;
		}
		else if(total>500) {
			total=total -total*.05;
			return total;
		}
		else {
			return total;
		}
	}

	@Override
	public String toString() {
		return "Product [productId=" + productId + ", productName=" + productName + ", price=" + price + ", quantity="
				+ quantity + ", total=" + total + "]";
	}

	
}
