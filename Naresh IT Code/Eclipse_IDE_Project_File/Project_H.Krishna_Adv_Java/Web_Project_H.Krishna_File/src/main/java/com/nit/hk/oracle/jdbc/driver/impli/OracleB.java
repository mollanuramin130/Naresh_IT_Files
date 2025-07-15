package com.nit.hk.oracle.jdbc.driver.impli;

import com.nit.hk.jdbc.spec.InterfaceB;
import com.nit.hk.jdbc.spec.InterfaceC;

public class OracleB implements InterfaceB {
	@Override
	public InterfaceC getC() {
		System.out.println("OracleB class returns OracleC object");
		return new OracleC();
	}
}