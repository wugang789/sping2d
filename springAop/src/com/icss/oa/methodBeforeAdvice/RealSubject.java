package com.icss.oa.methodBeforeAdvice;

public class RealSubject implements Subject {

	public void request() {
		System.out.println("真实实现 --> 只关注于煮饭") ;
	}

}
