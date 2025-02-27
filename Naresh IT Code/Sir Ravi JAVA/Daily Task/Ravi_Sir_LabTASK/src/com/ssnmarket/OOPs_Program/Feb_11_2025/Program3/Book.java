package com.ssnmarket.OOPs_Program.Feb_11_2025.Program3;

public class Book {
	String bookName;
	int bookPages;
	String bookAuthorName;
	double bookPrice;
	
	public void bookDetails() {
		System.out.println("Book name is: "+bookName);
		System.out.println("Total pages: "+bookPages);
		System.out.println("Book price: "+bookPrice);
	}
	
	public void bookAuthorDetails() {
		System.out.println("book Author name is: "+bookAuthorName);
		System.out.println(bookAuthorName+" born in India.");
	}
}
