package com.yw.main;

import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.yw.sbeans.WishMessageGenerator;

public class MainClass {

	public static void main(String[] args) 
	{
		FileSystemXmlApplicationContext ctx = new FileSystemXmlApplicationContext("D:\\Spring Coding\\SpringTask1_Q2\\src\\com\\yw\\cfgs\\applicationContext.xml");
		
		Object obj = ctx.getBean("wmg");
		
		WishMessageGenerator message = (WishMessageGenerator) obj;
		
		System.out.println(message.generateWishMessage());
	}

}

/*
 * Good Night
*/