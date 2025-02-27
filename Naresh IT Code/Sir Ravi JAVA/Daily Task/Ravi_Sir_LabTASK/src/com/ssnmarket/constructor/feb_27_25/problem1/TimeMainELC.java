package com.ssnmarket.constructor.feb_27_25.problem1;

public class TimeMainELC {

	public static void main(String[] args) {
		
		Time t1=new Time(2, 30, 40);
		Time t2=new Time(4, 40, 21);
		
		Time addTime=Time.add(t1, t2);
		
		addTime.show();
		

	}

}
