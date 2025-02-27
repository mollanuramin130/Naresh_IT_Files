package com.ssnmarket.feb_04_2025.CompoundInterest;

import java.util.Scanner;

public class CompoundInterest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the principal amount : ");
		float principal=scanner.nextFloat();
		System.out.println("Enter the interest rate : ");
		float rate=scanner.nextFloat();
		float amount=principal*(1+(rate/100))*(1+(rate/100))*(1+(rate/100));
		System.out.println("Compound interest for 3 years of "+principal+" is:"+(amount-principal));
		scanner.close();
	}

}
