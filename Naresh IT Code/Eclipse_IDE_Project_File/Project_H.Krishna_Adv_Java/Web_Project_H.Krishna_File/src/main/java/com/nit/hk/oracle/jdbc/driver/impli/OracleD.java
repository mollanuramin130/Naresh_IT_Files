package com.nit.hk.oracle.jdbc.driver.impli;

import com.nit.hk.jdbc.spec.InterfaceD;

public class OracleD implements InterfaceD {

	public int getInt() {
		System.out.print("OracleD returned integer");
		return 3;
	}

	public double getDouble() {
		System.out.print("OracleD returned double");
		return 4.5;
	}

	public char getChar() {
		System.out.print("OracleD returned char");
		return 'd';
	}

	public boolean getBoolean() {
		System.out.print("OracleD returned boolean");
		return true;
	}

	public String getString() {
		System.out.print("OracleD returned string");
		return "HK";
	}
}