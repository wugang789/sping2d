package com.icss.advice;

import java.lang.reflect.Method;

import org.springframework.aop.MethodBeforeAdvice;

public class BeforeUserMethodAdvice implements MethodBeforeAdvice {
//	advice
	public void before(Method arg0, Object[] arg1, Object arg2)
			throws Throwable {

		System.out.println("addUser之前的权限验证");
	}

}
