package com.yw.main;

import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.yw.sbeans.SeasonFinder;

public class SeasonDependencyInjectionTester 
{
	public static void main(String[] args) 
	{
			FileSystemXmlApplicationContext ctx = new FileSystemXmlApplicationContext("D:\\Spring Coding\\Spring-Application-2[Season-Finder]\\src\\com\\yw\\cfgs\\applicationContext.xml");
			
			Object obj = ctx.getBean("season");
			
			SeasonFinder message = (SeasonFinder) obj;
			
			String msg = message.showSeason();
			
			System.out.println("Current Season : "+msg);
			
			ctx.close();
	}

}
