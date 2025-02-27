package com.ssnmarket.jan_30_2025.Salary_Calculate;

public class SalaryCalculation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double basic = Double.parseDouble(args[0]);
		double hra = basic * (15.0 / 100);
		double entertainment = basic * (10.0 / 100);
		double conveyance = basic * (15.0 / 100);
		double total=(basic+hra+entertainment+conveyance);
		
		System.out.println("The total salary is: "+total);
	}

}
