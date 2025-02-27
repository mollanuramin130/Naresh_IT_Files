package com.ssnmarket.constructor.feb_27_25.problem1;

public class Sports {
	private String sportName;
	private int teamSize;
	private String sportType;
	
	
	
	public Sports() {
		this("Unknown", 0,"Unknown");
	}

	public Sports(String sportName, int teamSize) {
		this(sportName, teamSize,"Unknown");		
	}
	
	public Sports(String sportName, int teamSize, String sportType) {
		
		if(teamSize<0) {
			this.teamSize = 0;
			System.err.println("Team size must be positive.");
			System.exit(1);
		}
		this.teamSize = teamSize;
		this.sportName = sportName;
		
		this.sportType = sportType;
	}
	
	public void displayInfo() {
		System.out.println("Sport Name: "+sportName+"\nTeam size: "+teamSize+"\nSport type: "+sportType);
	}
	
}
