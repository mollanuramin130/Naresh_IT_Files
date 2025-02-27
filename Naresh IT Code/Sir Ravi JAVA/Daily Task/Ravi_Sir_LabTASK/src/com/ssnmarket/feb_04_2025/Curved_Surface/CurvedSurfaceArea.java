package com.ssnmarket.feb_04_2025.Curved_Surface;

import java.util.Scanner;

public class CurvedSurfaceArea {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the length of surface: ");
		int length=sc.nextInt();
		System.out.println("The curved surface area of a cube is: "+(6*length*length));
		sc.close();
	}

}
