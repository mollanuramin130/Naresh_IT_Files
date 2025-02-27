package com.ssnmarket.jan_30_2025.Fahrenheit_Calculate;

public class FahrenheitCalculate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double fahrenheit = Double.parseDouble(args[0]);
		double celsius=((fahrenheit-32)*5)/9.0;
		
		System.out.println(fahrenheit +" Fahrenheit = "+celsius+" Celsius");
	}

}
