package com.yw.sbeans;

import java.time.LocalDate;
import java.time.LocalTime;

public class WishMessageGenerator 
{
	private LocalTime time;
	private LocalDate date;
	
	public void setTime(LocalTime time) {
		System.out.println("WishMessageGenerator.setTime()");
		this.time = time;
	}
	
	public LocalTime getTime() {
		System.out.println("WishMessageGenerator.getTime()");
		return time;
	}
	
	public void setDate(LocalDate date) {
		System.out.println("WishMessageGenerator.setDate()");
		this.date = date;
	}
	
	public String showWishMessage(String user)
	{
		System.out.println("WishMessageGenerator.showWishMessage()");
		
		int hour = time.getHour();
		
		if(hour < 12) {
			return "Good Morning : "+user+"\nTime is "+time+"\nDate is "+date;
		}else if(hour < 16) {
			return "Good Afternoon: "+user+"\nTime is "+time+"\nDate is "+date;
		}else if(hour < 18) {
			return "Good Evening: "+user+"\nTime is "+time+"\nDate is "+date;
		}else {
			return "Good Night: "+user+"\nTime is "+time+"\nDate is "+date;
		}
	}
}
