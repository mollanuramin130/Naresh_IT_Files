package com.ssnmarket.OOPs_Program.Feb_11_2025.Program2;

public class FanDetails {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Fan secFan=new Fan();
		secFan.fanName="SEC";
		secFan.fanWings=3;
		secFan.coilName="silver";
		
		secFan.switchOn();
		secFan.switchOff();
		System.out.println("------------------------------------------");
		
		Fan bajaFan=new Fan();
		
		bajaFan.fanName="Super fast Lumina";
		bajaFan.fanWings=4;
		bajaFan.coilName="Golden";
		
		bajaFan.switchOn();
		bajaFan.switchOff();
		
		System.out.println("------------------------------------------");
		
		secFan.fanName="Rapid Cooler";
		secFan.switchOn();
		secFan.switchOff();

	}

}
