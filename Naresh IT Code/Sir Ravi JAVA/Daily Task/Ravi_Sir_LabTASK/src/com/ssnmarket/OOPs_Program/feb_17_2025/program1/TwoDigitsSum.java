package com.ssnmarket.OOPs_Program.feb_17_2025.program1;

public class TwoDigitsSum {
	
	public static int getSumOfDigits(int number) {
		
		// return (number/10)+(number%10); //This logic for two digits number only
		
		int sum=0;
		
		while(number>0) {
			sum+=number%10;
			number/=10;
		}
		
		return sum;
	}
}
