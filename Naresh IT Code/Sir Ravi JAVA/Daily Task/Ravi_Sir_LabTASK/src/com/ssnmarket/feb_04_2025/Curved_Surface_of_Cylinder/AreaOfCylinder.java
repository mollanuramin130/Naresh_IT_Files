package com.ssnmarket.feb_04_2025.Curved_Surface_of_Cylinder;

import java.util.Scanner;

public class AreaOfCylinder {
	final static double PI=3.14;
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the height of cylinder: ");
		float height=sc.nextFloat();
		System.out.print("Enter the radious of cylinder: ");
		float radious=sc.nextFloat();
		System.out.println("The total surface area of a cylinder is: "+((2*PI*radious*radious)+(2*PI*height*radious)));
		sc.close();

	}

}
