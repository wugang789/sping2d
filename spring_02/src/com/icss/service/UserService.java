package com.icss.service;

public interface UserService {

	public void addUser();//joinpoint连接点
	public void delUser();
	public void updateUser();
	public void findUser();
	
//	连接点joinpoint的集合是切点pointcut
//	pointcut和adivce 的装配器是advisor
}
