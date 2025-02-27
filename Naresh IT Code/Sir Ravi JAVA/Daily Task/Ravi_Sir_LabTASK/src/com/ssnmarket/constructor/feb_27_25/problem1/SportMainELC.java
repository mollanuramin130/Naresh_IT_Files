package com.ssnmarket.constructor.feb_27_25.problem1;

import java.util.Scanner;

public class SportMainELC {

	public static void main(String[] args) {
		
//		Scanner scanner=new Scanner(System.in);
//		
//		System.out.print("Enter sport name: ");
//		String sportName = scanner.nextLine();
//		
//		System.out.print("Enter team Size: ");
//		int teamSize = scanner.nextInt();
//		
//		System.out.print("Enter sport type: ");
//		String sportType = scanner.nextLine();
//		sportType = scanner.nextLine();
		
		Sports sports1=new Sports("Football",1,"Indoor");
		sports1.displayInfo();
		
		System.out.println("_________________________________");
		
		Sports sports2=new Sports("Football",-1);
		sports2.displayInfo();
		
		System.out.println("_________________________________");
		Sports sports3=new Sports();
		sports3.displayInfo();
	}

}
