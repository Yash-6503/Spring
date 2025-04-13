package com.yw.sbeans;

import java.time.LocalDate;

public class DatePrinter 
{
	private LocalDate currentDate;

	public LocalDate getCurrentDate() {
		return currentDate;
	}

	public void setCurrentDate(LocalDate currentDate) {
		this.currentDate = currentDate;
	}

	@Override
	public String toString() {
		return "DatePrinter [currentDate=" + currentDate + "]";
	}

	public void printDate() {
		System.out.println("Current Date : "+currentDate.getYear()+"-"+currentDate.getMonth()+"-"+currentDate.getDayOfMonth());
	}
	

}
