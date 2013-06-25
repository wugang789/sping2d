package com.icss.oa.methodBeforeAdv;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class AdviceDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ApplicationContext ctx = new FileSystemXmlApplicationContext("applicationContext.xml");
		
		Subject sub = (Subject) ctx.getBean("proxy1");
		
		sub.addUser();

	}

}
