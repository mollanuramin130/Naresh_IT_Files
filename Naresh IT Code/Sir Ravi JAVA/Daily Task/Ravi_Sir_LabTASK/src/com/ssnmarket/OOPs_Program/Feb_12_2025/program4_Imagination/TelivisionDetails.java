package com.ssnmarket.OOPs_Program.Feb_12_2025.program4_Imagination;

import java.util.Scanner;

public class TelivisionDetails {
	int telivisionSerialNumber;
	String telivisionName;
	double telivisionPrice;
	
	public void setTelivisionData() {
		Scanner scanner=new Scanner(System.in);
		
		System.out.print("Enter the Telivision Serial Number: ");
		telivisionSerialNumber=scanner.nextInt();
		
		System.out.print("Enter the Telivision Name: ");
		telivisionName=scanner.nextLine();
		telivisionName=scanner.nextLine();
		
		System.out.print("Enter the Telivision Price: ");
		telivisionPrice=scanner.nextDouble();
		
		
	}
	
	public void getTelivisionData() {
		System.out.println("\n\nTelivision Serial No: "+telivisionSerialNumber+"\nTelivision Name: "+telivisionName+"\nTelivision Price: "+telivisionPrice+"\n");
	}
}
