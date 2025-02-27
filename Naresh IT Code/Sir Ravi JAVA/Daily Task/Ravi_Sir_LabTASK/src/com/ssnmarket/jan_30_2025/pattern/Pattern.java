package com.ssnmarket.jan_30_2025.pattern;

public class Pattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int row=7,col=7;
		
		for(int i=0;i<row;i++) {
			for(int j=0;j<col;j++) {
				if(i==0||i==row-1||j==0||j==col-1) {					
					System.out.print("@ ");
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
		
		System.out.println("@ @ @ @ @ @\n@         @\n@         @\n@         @\n@         @\n@ @ @ @ @ @");
	} 

}
