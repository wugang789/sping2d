package com.icss.staticproxy;

import com.icss.service.UserService;

public class StaticProxy implements UserService {

	UserService userService;
	
	public StaticProxy(UserService userService){
		this.userService = userService;
	}
	
	
	public void addUser() {
		System.out.println("addUser之前的权限验证");
		userService.addUser();
		System.out.println("addUser之后的善后工作");
	}

	public void delUser() {
		
	}

	public void updateUser() {

	}


	public void findUser() {
		
	}

}
