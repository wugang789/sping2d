package com.icss.service;

public interface UserService {

	public boolean isValid(String userName,String pwd);
	public void addUser();
	public void delUser();
	public void updateUser();
	public void findUser();
}
