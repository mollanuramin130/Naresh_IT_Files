package com.nur.m2;

import com.nur.m1.Nur;

class Main{
	public static void messsage() {
		System.out.println("Hi this is m2 package..");
	}
}

public class ECL {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Main.messsage();
		com.nur.m1.Main.message();
		String argString[]= {"hi","heloo"};
		Nur.main(argString);
		
	}

}
