package com.ssnmarket.feb_04_2025.ConvertFahrenheit_Celsius;

import java.util.Scanner;

public class CelsiusToFahrenheit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Celsius value: ");
		float celsius=sc.nextFloat();
		System.out.println(celsius+" deg Celsius = "+(((9*celsius)/5)+32)+" deg Fahrenheit.");
		sc.close();
	}

}
