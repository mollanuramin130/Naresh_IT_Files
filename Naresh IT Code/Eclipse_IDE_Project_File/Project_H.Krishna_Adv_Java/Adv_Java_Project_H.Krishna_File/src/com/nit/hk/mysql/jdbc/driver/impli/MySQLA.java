package com.nit.hk.mysql.jdbc.driver.impli;

import com.nit.hk.jdbc.spec.InterfaceA;
import com.nit.hk.jdbc.spec.InterfaceB;

public class MySQLA implements InterfaceA {       
    @Override
	public InterfaceB getB(){
	   System.out.println("MySQLA class returns MySQLB object"); 
	   return new MySQLB();
	}
}	
