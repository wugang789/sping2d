package com.icss.oa.methodBeforeAdvice;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class AdviceDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ApplicationContext ctx = new FileSystemXmlApplicationContext("/WebRoot/WEB-INF/applicationContext.xml") ;
		Subject sub = (Subject)ctx.getBean("proxy") ;
		sub.request() ;
	}

}
