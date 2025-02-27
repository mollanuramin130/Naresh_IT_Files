package com.ssnmarket.jan_30_2025.dominos;

import java.util.HashMap;
import java.util.Scanner;

public class DominosBillGenerate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean flag = true;
		int finalAmount = 0;
		HashMap<String, Integer> map = new HashMap<>();
		Scanner sc = new Scanner(System.in);
		while (flag) {
			System.out.print(
					"Select your Items\n------------------------\n\nOption 1: Chicken Rolls\nOption 2: Vegetable puffs\nOption 3: Generate Bills\n\nEnter Your Option : ");
			int option = sc.nextInt();
			System.out.print("Enter the Quantity : ");
			int qty = sc.nextInt();
			switch (option) {
			case 1:
				map.put("chicken_roll", qty);
				System.out.println("Do you want one more Item Enter 1 or To generate bill Enter 2 : ? ");
				int choose = sc.nextInt();
				switch (choose) {
				case 1:
					break;
				case 2:
					finalAmount += generateBill(map);
					System.out.println("Your Total bill : " + finalAmount);
					break;
				}
			}
			// flag=false;
		}
		sc.close();
	}

	public static int generateBill(HashMap<String, Integer> map) {

		return 2;
	}
}
