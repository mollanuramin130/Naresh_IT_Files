package com.ssnmarket.static_factory_method.feb_21_2025.program2;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Enter Movie title: ");
		String title= scanner.nextLine();
		

		System.out.print("Enter Movie release Year: ");
		int releaseYear= scanner.nextInt();
		

		System.out.print("Enter Movie Genre: ");
		String genre= scanner.nextLine();
		genre= scanner.nextLine();
		
		Movie objMovie=new Movie(title, releaseYear, genre);
		
		System.out.println("\nMovice Details\n===================\n");
		
		System.out.println("Movie Title: "+objMovie.getTitle()+"\nMovie Release year: "+objMovie.getReleaseYear()+"\nMovice Catagory: "+objMovie.getGenre());
		
		
		System.out.print("Enter Title for updated: ");
		objMovie.setTitle(scanner.nextLine());
		
		System.out.print("Enter Release year for update: ");
		objMovie.setReleaseYear(scanner.nextInt());
		
		System.out.print("Enter genre for updated: ");
		objMovie.setGenre(scanner.nextLine());
		objMovie.setGenre(scanner.nextLine());
		
		System.out.println("\n\nAfter update Movie Details\n======================\n");
		System.out.println("Movie Title: "+objMovie.getTitle()+"\nMovie Release year: "+objMovie.getReleaseYear()+"\nMovice Catagory: "+objMovie.getGenre());
	
	}

}
