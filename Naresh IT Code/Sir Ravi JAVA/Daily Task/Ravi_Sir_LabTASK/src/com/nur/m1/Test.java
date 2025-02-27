package com.nur.m1;

public class Test{
	
	static String collegeString="NIT";
	int roll=100;
	public Test(int roll) {
		this.roll=roll;
	}
	public static void main(String[] args) {
		m1();
		m2();
		Test2 y1=new Test2();

	}
	
	static void m1() {
		Test t1=new Test(201);
		Test t2=new Test(301);
		
		t1.roll++;
		t2.roll--;
		
		t1.collegeString="DBUU";
		System.out.println(t1.roll+"\n"+t2.roll+"\n"+t2.collegeString);
	}
	
	static void m2() {
		Test x1=new Test(201);
		System.out.println(x1.collegeString);
	}
}

class Test2{
	Test2(){
		Test y1=new Test(201);
		System.out.println(y1.collegeString);
	}
	
}