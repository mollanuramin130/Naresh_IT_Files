package com.ssnmarket.OOPs_Program.Feb_14_2025.Program1;

public class BowlerInput {

	public static void main(String[] args) {
		Bowler sachinBowler= new Bowler();
		sachinBowler.bowlerDetails("Sachin", 10, 5, 750, 463);
		sachinBowler.computeBowlingAverage();
		sachinBowler.computeStrikeRate();
		sachinBowler.showStatistics();
		
		Bowler mdShamiBowler= new Bowler();
		mdShamiBowler.bowlerDetails("Md Shami", 15,7, 2000, -1530);
		mdShamiBowler.computeBowlingAverage();
		mdShamiBowler.computeStrikeRate();
		mdShamiBowler.showStatistics();
	}

}
