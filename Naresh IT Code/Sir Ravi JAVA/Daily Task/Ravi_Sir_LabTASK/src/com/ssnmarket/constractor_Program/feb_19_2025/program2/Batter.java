package com.ssnmarket.constractor_Program.feb_19_2025.program2;

public class Batter {
	public String name;
	public int runs;
	public int matches;
	public float batting_avg;
	
	public Batter(String name, int runs, int matches) {
		super();
		this.name = name;
		this.runs = runs;
		this.matches = matches;
	}
	
	public void computeBattingAverage() {
		
		if(name=="") {
			System.err.println("Error: Name cannot be empty.");
		}
		else if(matches<=0 || runs<0) {
			System.err.println("Error: Runs and matches must be non-negative.");
		}
		else {
			batting_avg = (float)runs/matches;
			
			System.out.println("Name: "+name);
			System.out.println("Batting_Avg: "+batting_avg);
		}
	}
	
	void getStatistics() {
		if(name=="") {
			System.err.println("Error: Name cannot be empty.");
		}
		else if(matches<=0 || runs<0) {
			System.err.println("Error: Runs and matches must be non-negative.");
		}
		else {						
			System.out.println("Name: "+name+"\nRuns: "+runs+"\nMatches: "+matches);
		}
	}

	@Override
	public String toString() {
		return "Batter [name=" + name + ", runs=" + runs + ", matches=" + matches + ", batting_avg=" + batting_avg
				+ "]";
	}
	
	
}
