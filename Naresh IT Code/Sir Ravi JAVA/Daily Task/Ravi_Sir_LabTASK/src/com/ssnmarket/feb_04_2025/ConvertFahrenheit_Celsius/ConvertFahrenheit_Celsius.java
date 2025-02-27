package com.ssnmarket.feb_04_2025.ConvertFahrenheit_Celsius;

import java.util.Scanner;

public class ConvertFahrenheit_Celsius {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Fahrenheit value: ");
		float fahrenheit=sc.nextFloat();
		System.out.println(fahrenheit+" deg Fahrenheit = "+((fahrenheit-32)*(5.0/9))+" deg Celsius.");
		sc.close();

	}

}
