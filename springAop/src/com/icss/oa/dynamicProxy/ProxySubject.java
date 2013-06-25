package com.icss.oa.dynamicProxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class ProxySubject implements InvocationHandler {
	
	private Object obj = null;
	
	public Object bind(Object obj){
		this.obj = obj;
//		Proxy p = null;
		return Proxy.newProxyInstance(obj.getClass().getClassLoader(), obj.getClass().getInterfaces(), this);
		
	}
	
	

	public Object invoke(Object proxy, Method method, Object[] arg2)
			throws Throwable {
		System.out.println("代理之前");
		
		Object o = method.invoke(this.obj, arg2);
		
		System.out.println("代理之后");
		
		return o;
	}

}
