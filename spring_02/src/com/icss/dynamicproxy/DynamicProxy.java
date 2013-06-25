package com.icss.dynamicproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class DynamicProxy implements InvocationHandler {

	Object object;
	
	public Object bind(Object object){
		this.object = object;
		return Proxy.newProxyInstance(object.getClass().getClassLoader(), object.getClass().getInterfaces(), this);
	}
	
	
	public Object invoke(Object proxy, Method method, Object[] args)
			throws Throwable {

		System.out.println("Ȩ�޼��");
		Object result = method.invoke(object, args);//�ص�addUser
		System.out.println("�ƺ���");
		return result;
	}

}
