package com.ssnmarket.feb_05_2025.Palindrom_Check;

import java.util.Scanner;

public class PalindromCheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your Number : ");
		int number =sc.nextInt();
		int temp=number,revNumber=0;
		if(number<=0) {
			System.out.println(-1+"\nThe given number is -ve kindly provide the +ve number only");
		}
		else {
			int count=0;
			while(temp>0) {
				int rem=temp%10;
				revNumber=revNumber*10+rem;
				temp=temp/10;
				count++;
			}if (count!=3) {
				System.out.println(-2+"\nThis program can check the operation for the 3 number only.");
			}
			else if(revNumber==number) {
				System.out.println(1+"\nThe number is pallindrome");
			}else {
				System.out.println(0+"\nThe number is not a pallindrome");
			}	
		}
		
		sc.close();
	}

}
