package com.nit.hk.mysql.jdbc.driver.impli;

import com.nit.hk.jdbc.spec.InterfaceD;

public class MySQLD implements InterfaceD {

	public int getInt() {
		System.out.print("MySQLD returned integer");
		return 3;
	}

	public double getDouble() {
		System.out.print("MySQLD returned double");
		return 4.5;
	}

	public char getChar() {
		System.out.print("MySQLD returned char");
		return 'd';
	}

	public boolean getBoolean() {
		System.out.print("MySQLD returned boolean");
		return true;
	}

	public String getString() {
		System.out.print("MySQLD returned string");
		return "HK";
	}
}