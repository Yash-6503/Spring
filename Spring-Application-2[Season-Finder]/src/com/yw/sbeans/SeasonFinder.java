package com.yw.sbeans;

import java.time.LocalDate;
import java.time.Month;

public class SeasonFinder 
{
	private LocalDate date;
	
	public void setDate(LocalDate date) {
		System.out.println("SeasonFinder.setDate()");
		this.date = date;
	}
		
	public String showSeason() {
		if(date.getMonthValue() >= 3 && date.getMonthValue() <= 6 ) {
			return "Summer";
		}else if(date.getMonthValue() >= 7 && date.getMonthValue() <= 10 ) {
			return "Rainy";
		}else {
			return "Winter";
		}
	}
}
