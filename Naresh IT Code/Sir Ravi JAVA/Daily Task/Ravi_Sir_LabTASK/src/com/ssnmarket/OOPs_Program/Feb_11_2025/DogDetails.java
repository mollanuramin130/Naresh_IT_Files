package com.ssnmarket.OOPs_Program.Feb_11_2025;

public class DogDetails {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Dog desiDog = new Dog();
		
		desiDog.dogName="Popy";
		desiDog.dogHeight= 2.4;
		desiDog.dogAge = 10;
		
		desiDog.getDogInformation();
		desiDog.bark();
		
		Dog hybridDog = new Dog();
		
		hybridDog.dogName="Tom";
		hybridDog.dogHeight=3.1;
		hybridDog.dogAge=8 ;
		
		hybridDog.getDogInformation();
		hybridDog.bark();
	}

}
