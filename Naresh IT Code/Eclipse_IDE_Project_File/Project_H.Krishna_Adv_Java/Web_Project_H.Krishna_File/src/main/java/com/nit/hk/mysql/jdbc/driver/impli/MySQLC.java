package com.nit.hk.mysql.jdbc.driver.impli;

import com.nit.hk.jdbc.spec.InterfaceC;
import com.nit.hk.jdbc.spec.InterfaceD;

public class MySQLC implements InterfaceC {
	@Override
	public InterfaceD getD() {
		System.out.println("MySQLC class returns MySQLD object");
		return new MySQLD();
	}
}