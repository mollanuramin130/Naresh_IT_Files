package com.ssnmarket.OOPs_Program.Feb_11_2025.Program3;

public class BookDetails {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Book storyBook = new Book();
		storyBook.bookName = "Mistory of Forest";
		storyBook.bookAuthorName = "Sartrendrona Nath Basu";
		storyBook.bookPages = 210;
		storyBook.bookPrice = 350.50;

		storyBook.bookDetails();
		storyBook.bookAuthorDetails();

		System.out.println("---------------------------------------");

		Book poemBook = new Book();
		poemBook.bookName = "Nature poem";
		poemBook.bookAuthorName = "Jems Scott";
		poemBook.bookPages = 120;
		poemBook.bookPrice = 650.50;

		poemBook.bookDetails();
		poemBook.bookAuthorDetails();

	}

}
