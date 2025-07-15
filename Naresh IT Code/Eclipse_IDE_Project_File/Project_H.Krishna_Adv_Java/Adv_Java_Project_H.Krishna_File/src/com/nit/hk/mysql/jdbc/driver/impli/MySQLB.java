package com.nit.hk.mysql.jdbc.driver.impli;

import com.nit.hk.jdbc.spec.InterfaceB;
import com.nit.hk.jdbc.spec.InterfaceC;

public class MySQLB implements InterfaceB {
	@Override
	public InterfaceC getC() {
		System.out.println("MySQLB class returns MySQLC object");
		return new MySQLC();
	}
}