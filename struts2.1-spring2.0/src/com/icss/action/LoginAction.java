package com.icss.action;

import com.icss.service.UserService;
import com.icss.service.impl.UserServiceImpl;

public class LoginAction {
	
	private String userName;
	private String pwd;
	private UserService userService;

	public void setUserService(UserService userService) {
		this.userService = userService;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPwd() {
		return pwd;
	}

	public void setPwd(String pwd) {
		this.pwd = pwd;
	}

	public String execute() throws Exception{
		
		System.out.println("in the action method");
		
//		UserService userService = new UserServiceImpl();
		if(this.userService.isValid(this.getUserName(), this.getPwd())){
			return "success";
		}
		else{
			return "error";
		}

	}
}
