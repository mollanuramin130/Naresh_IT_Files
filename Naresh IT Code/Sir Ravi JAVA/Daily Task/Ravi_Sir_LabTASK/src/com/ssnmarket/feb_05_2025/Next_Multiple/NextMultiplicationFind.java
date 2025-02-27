package com.ssnmarket.feb_05_2025.Next_Multiple;

import java.util.Scanner;

public class NextMultiplicationFind {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your Number : ");
		int number =sc.nextInt();
		if(number<=0) {
			System.out.println(-1);
		}
		else {
			System.out.println("Next multiplication of "+number+" is: "+(number/100+1)*100);
		}
		sc.close();
	}

}
