package com.ssnmarket.constructor.feb_27_25.problem1;

//import java.sql.Time;

public class Time {
	private int hh;
	private int mm;
	private int ss;
	
	public Time() {
		this.hh=0;
		this.mm=0;
		this.ss=0;
	}

	public Time(int hh, int mm, int ss) {
		super();
		this.hh = hh;
		this.mm = mm;
		this.ss = ss;
	}
	
	public void show() {
		System.out.println(hh+":"+mm+":"+ss);
	}
	
	public static Time add(Time t1, Time t2) {
		int hours=t1.hh+t2.hh;
		int minutes=t1.mm+t2.mm;
		int second=t1.ss+t2.ss;
		
		if(second>=60) {
			minutes=minutes+second/60;
			second=second%60;
		}
		if(minutes>=60) {
			hours=hours+minutes/60;
			minutes=minutes%60;
		}
		if(hours>12) {
			hours=hours%12;
		}
		
		Time addTime = new Time(hours,minutes,second);
		
		return addTime;
	}
}
