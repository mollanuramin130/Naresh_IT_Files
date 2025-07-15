package com.nit.hk.oracle.jdbc.driver.impli;

import com.nit.hk.jdbc.spec.InterfaceA;
import com.nit.hk.jdbc.spec.InterfaceB;

public class OracleA implements InterfaceA {       
    @Override
	public InterfaceB getB(){
	   System.out.println("OracleA class returns OracleB object"); 
	   return new OracleB();
	}
}	
