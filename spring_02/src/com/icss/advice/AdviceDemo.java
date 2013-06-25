package com.icss.advice;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.icss.service.UserService;

public class AdviceDemo {

	public static void main(String[] args) {

		BeanFactory factory = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		UserService userService = (UserService) factory.getBean("proxy");
		userService.addUser();
		
	}

}
