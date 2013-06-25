package com.icss.oa.dynamicProxy;

public class RealSubject implements Subject {

	public void request() {
		System.out.println("真正关注的实现-->煮饭");		
	}
	
	

}
