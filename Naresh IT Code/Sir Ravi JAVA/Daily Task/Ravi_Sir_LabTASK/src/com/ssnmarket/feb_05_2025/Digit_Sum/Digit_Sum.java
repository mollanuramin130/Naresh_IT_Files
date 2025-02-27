package com.ssnmarket.feb_05_2025.Digit_Sum;

import java.util.Scanner;

public class Digit_Sum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your Number : ");
		int number =sc.nextInt();
		if(number<0) {
			System.out.println(-3);
		}else if (number>99) {
			System.out.println(-2);
		}else if (number>=0 && number<=9) {
			System.out.println(-1);
		}else {
			System.out.println("The digit sum of "+number+" is: "+(number%10+number/10));
		}
		sc.close();
	}

}
