package com.icss.oa.methodBeforeAdv;

import java.lang.reflect.Method;

import org.springframework.aop.MethodBeforeAdvice;



public class BeforeAdv implements MethodBeforeAdvice {

	public void before(Method arg0, Object[] arg1, Object arg2)
			throws Throwable {
		System.out.println("����ʵ��֮ǰ-->Ȩ�޼��");
		
	}

}
