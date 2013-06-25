package com.icss.staticproxy;

import com.icss.service.UserService;
import com.icss.service.UserServiceImpl;

public class StaicDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		UserService userService = new UserServiceImpl();
		
		StaticProxy proxy = new StaticProxy(userService);
		
		proxy.addUser();
		
	}

}
