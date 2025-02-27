package com.ssnmarket.OOPs_Program.Feb_14_2025.Program2;

public class Batter {
	String name;
	int runs,matches;
	float batting_avg;
	
	public void batterDetails(String name,int runs,int matches) {
		this.name=name;
		this.runs=runs;
		this.matches=matches;
	}
	public void computeBattingAverage() {
		if(runs<0 || matches<0) {
			System.out.println("This is computeBattingAverage() method calling result");
			System.out.println("ERROR: Runs and Matches must be non negetive...");
		}else {
			batting_avg=runs*1.0f/matches;
			System.out.println("This is computeBattingAverage() method calling result");
			System.out.println("Name: "+name+"\nBatting_Avg: "+batting_avg);
		}
	}
	
	public void getStatistics() {
		if(runs<0 || matches<=0) {
			System.out.println("\n\nThis is getStatistics() method calling result");
			System.out.println("ERROR: Runs and Matches must be non negetive....");
		}else {
			System.out.println("\n\nThis is getStatistics() method calling result");
			System.out.println("Name: "+name+"\nRuns: "+runs+"\nMatches: "+matches);
		}
	}
	
}
