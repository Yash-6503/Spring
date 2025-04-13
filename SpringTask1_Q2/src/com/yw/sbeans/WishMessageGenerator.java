package com.yw.sbeans;

import java.time.LocalDate;
import java.time.LocalTime;

public class WishMessageGenerator
{
	private LocalDate currentDate;
	private LocalTime currentTime;
	
	public LocalDate getCurrentDate() {
		return currentDate;
	}
	public void setCurrentDate(LocalDate currentDate) {
		this.currentDate = currentDate;
	}
	public LocalTime getCurrentTime() {
		return currentTime;
	}
	public void setCurrentTime(LocalTime currentTime) {
		this.currentTime = currentTime;
	}
	
	public String generateWishMessage() {
		if(currentTime.getHour()  <  12 && currentTime.getHour() > 6) {
			return "Good Morning";
		}else if(currentTime.getHour() < 18 && currentTime.getHour() > 12 ) {
			return "Good Afternoon";
		}else if(currentTime.getHour() < 21 && currentTime.getHour() > 18) {
			return "Good Evening";
		}else {
			return "Good Night";
		}
	}
	
}
