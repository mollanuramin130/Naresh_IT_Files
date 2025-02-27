package com.ssnmarket.OOPs_Program.Feb_11_2025.Program2;

public class Fan {
	String fanName;
	String coilName;
	int fanWings;
	
	public void switchOn() {
		System.out.println(fanName + " fan is now on.");
		System.out.println("Since fan is on "+fanWings+" wings not visiable.");
	}
	public void switchOff() {
		System.out.println(fanName + " fan is now Off.");
		System.out.println("Since fan is off "+fanWings+" wings are visiable.");
		System.out.println("Fan containg coil name is: "+coilName);
	}
}
