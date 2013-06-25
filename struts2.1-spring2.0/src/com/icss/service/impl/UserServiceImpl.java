package com.icss.service.impl;

import com.icss.service.UserService;

public class UserServiceImpl implements UserService {

	public void addUser() {
		// TODO Auto-generated method stub

	}

	public void delUser() {
		// TODO Auto-generated method stub

	}

	public void findUser() {
		// TODO Auto-generated method stub

	}

	public boolean isValid(String userName, String pwd) {
		if("zhangsan".equals(userName) && "123".equals(pwd)){

			return true;
			}

			return false;
	}

	public void updateUser() {
		// TODO Auto-generated method stub

	}

}
