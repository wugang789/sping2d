package com.icss.dynamicproxy;

import com.icss.service.UserService;
import com.icss.service.UserServiceImpl;

public class DynamicDemo {

	public static void main(String[] args) {

		UserService userService = new UserServiceImpl();
		DynamicProxy proxy = new DynamicProxy();
		UserService service = (UserService) proxy.bind(userService);
		service.addUser();
	}

}
