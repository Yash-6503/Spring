package com.yw.main;

import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.yw.sbeans.DatePrinter;

public class MainClass {

	public static void main(String[] args) 
	{
		FileSystemXmlApplicationContext ctx = new FileSystemXmlApplicationContext("D:\\Spring Coding\\SpringTask1_Q1\\src\\com\\yw\\cfgs\\applicationContext.xml");
		
		Object obj = ctx.getBean("dp");
		
		DatePrinter datep = (DatePrinter) obj;
		
		System.out.println(datep);
		datep.printDate();
		
	}
}

/*
DatePrinter [currentDate=2025-04-14]
Current Date : 2025-APRIL-14
*/