package com.nit.hk.oracle.jdbc.driver.impli;

import com.nit.hk.jdbc.spec.InterfaceC;
import com.nit.hk.jdbc.spec.InterfaceD;

public class OracleC implements InterfaceC {
	@Override
	public InterfaceD getD() {
		System.out.println("OracleC class returns OracleD object");
		return new OracleD();
	}
}