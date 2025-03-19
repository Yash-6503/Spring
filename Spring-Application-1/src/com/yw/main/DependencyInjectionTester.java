package com.yw.main;

import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.yw.sbeans.WishMessageGenerator;

public class DependencyInjectionTester 
{
	public static void main(String[] args) 
	{
		FileSystemXmlApplicationContext ctx = new FileSystemXmlApplicationContext("D:\\Spring Coding\\Spring-Application-1\\src\\com\\yw\\cfgs\\applicationContext.xml");
		
		Object obj = ctx.getBean("wmg");
		
		WishMessageGenerator message = (WishMessageGenerator) obj;
		
		String msg = message.showWishMessage("Raja");
		
		System.out.println("Result : "+msg);
		
		ctx.close();
	}

}
