package com.ssnmarket.OOPs_Program.Feb_14_2025.Program2;

public class BatterInput {

	public static void main(String[] args) {
		
		Batter rohitBatter=new Batter();
		
		rohitBatter.batterDetails("Rohit Sharma", 18000, 463);
		rohitBatter.computeBattingAverage();
		rohitBatter.getStatistics();
		
		System.out.println("\n------------------------");
		Batter viratBatter=new Batter();
		
		viratBatter.batterDetails("virat Koheli", -12000, 320);
		viratBatter.computeBattingAverage();
		viratBatter.getStatistics();
	}

}
