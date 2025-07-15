package com.nit.hk.jdbc.driver.main;

import java.util.Scanner;

import com.nit.hk.jdbc.spec.InterfaceA;
import com.nit.hk.jdbc.spec.InterfaceB;
import com.nit.hk.jdbc.spec.InterfaceC;
import com.nit.hk.jdbc.spec.InterfaceD;

public class Test {
	public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException  {

		Scanner scn = new Scanner(System.in);

		//Reading interface A implementation class name (Driver class name)	
		System.out.print("Enter interface A implmentation class name: ");
		String classAName = scn.next();

		//Loading the implementation class (loading driver)
		Class cls = Class.forName(classAName);
		InterfaceA a1 = (InterfaceA) cls.newInstance();	//obtaining A object by loading its class
		
		InterfaceB b1 = a1.getB();	//obtaining B object from object A
		InterfaceC c1 = b1.getC();	//obtaining C object from object B
		InterfaceD d1 = c1.getD();	//obtaining D object from object C
		
		System.out.println(" " + d1.getInt());		//retrieving data from D object
		System.out.println(" " + d1.getDouble());
		System.out.println(" " + d1.getChar());
		System.out.println(" " + d1.getBoolean());
		System.out.println(" " + d1.getString());

	}
}
