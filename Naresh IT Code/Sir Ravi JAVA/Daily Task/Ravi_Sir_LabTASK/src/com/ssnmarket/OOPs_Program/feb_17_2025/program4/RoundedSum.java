package com.ssnmarket.OOPs_Program.feb_17_2025.program4;

public class RoundedSum {
	
	public static int sumOfRoundedValues(int number1,int number2,int number3) {
		int sum = (((number1/10)+(number1%10)/5)*10)+(((number2/10)+(number2%10)/5)*10)+(((number3/10)+(number3%10)/5)*10);
		return sum;
	}
	
}
