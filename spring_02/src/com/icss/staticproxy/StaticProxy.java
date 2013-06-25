package com.icss.staticproxy;

import com.icss.service.UserService;

public class StaticProxy implements UserService {

	UserService userService;
	
	public StaticProxy(UserService userService){
		this.userService = userService;
	}
	
	
	public void addUser() {
		System.out.println("addUser֮ǰ��Ȩ����֤");
		userService.addUser();
		System.out.println("addUser֮����ƺ���");
	}

	public void delUser() {
		
	}

	public void updateUser() {

	}


	public void findUser() {
		
	}

}
