package com.ssnmarket.OOPs_Program.Feb_14_2025.Program1;

public class Bowler {
	String name;
	int wickets,matches,balls_bowled,runs_conceded;
	
	double bowling_avg,strike_rate;
	
	public void bowlerDetails(String name,int wickets,int matches,int balls_bowled,int run_conceded	) {
		this.name=name;
		this.wickets=wickets;
		this.matches=matches;
		this.balls_bowled=balls_bowled;
		this.runs_conceded=run_conceded;
	}
	
	public void computeBowlingAverage() {
		if(runs_conceded<0 || wickets<0) {
			System.out.println("This is computeBowlingAverage() method calling result");
			System.out.println("Error: Run & Wicket must be non negetive..");
		}else {
			bowling_avg=runs_conceded*1.0/wickets;
			System.out.println("This is computeBowlingAverage() method calling result");
			System.out.println("Name : "+name+"\nbowling_avg = "+bowling_avg);
		}
	}
	
	public void computeStrikeRate() {
		if(runs_conceded>0 || balls_bowled>0) {
			if(matches<=0) {
				System.out.println("\n\nThis is computeStrikeRate() method calling result");
				System.out.println("ERROR: Matches not be zero since Boll or Run greater than Zero...");
			}
			else {
				strike_rate=runs_conceded*1.0/balls_bowled;
				System.out.println("\n\nThis is computeStrikeRate() method calling result");
				System.out.println("Name: "+name+"\nStrick_Rate = "+strike_rate);
			}
		}
	}
	
	public void showStatistics() {
		if(wickets<0 || matches<0||balls_bowled<0||runs_conceded<0) {
			System.out.println("\n\nThis is showStatistics() method calling result");
			System.out.println("ERROR: Every Values must be Positive...");
		}
		else {
			System.out.println("\n\nThis is showStatistics() method calling result");
			System.out.println("Name : "+name+"\nwickets = "+wickets+"\nMatches = "+matches+"\n\nBalls_Bowled = "+balls_bowled+"\nRun_conceded = "+runs_conceded+"\n");
		}
	}
	
}
