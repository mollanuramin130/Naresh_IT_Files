package com.ssnmarket.static_factory_method.feb_21_2025.program1;

import java.util.Scanner;

public class Loan {
	private double principal;
	private double interestRate;
	private int durationMonths;
	
	public Loan(double principal, double interestRate, int durationMonths) {
		
		if(principal<=0 || interestRate<=0 || durationMonths<=0 ) {
			System.err.println("Error: Every value must be positive..");
		}
		else {
			this.principal = principal;
			this.interestRate = interestRate;
			this.durationMonths = durationMonths;
		}
	}
	
	public double calculateMonthlyPayment() {
		double totalAmount=principal+(principal*((double)durationMonths/12)*interestRate)/100;
		
		return totalAmount/durationMonths;
	}
	
	public double getPrincipal() {
		return principal;
	}
	
	public double getInterestRate() {
		return interestRate;
	}
	
	public int getDurationMonths() {
		return durationMonths;
	}
	
	public static Loan setLoanDetails() {
		Scanner scanner=new Scanner(System.in);
		
		System.out.println("Enter your Principal ammount..");
		double principal=scanner.nextDouble();
		
		System.out.println("Enter interest rate..");
		double interestRate=scanner.nextDouble();
		
		System.out.println("Enter Duration Months..");
		int duration=scanner.nextInt();
		
		Loan objLoan=new Loan(principal, interestRate, duration);
		
		//objLoan.calculateMonthlyPayment();
		return objLoan;
	}

	@Override
	public String toString() {
		return "Loan [principal=" + principal + ", interestRate=" + interestRate + ", durationMonths=" + durationMonths
				+ ", calculateMonthlyPayment()=" + calculateMonthlyPayment() + "]";
	}
	
	
	
}
