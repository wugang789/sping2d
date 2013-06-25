package com.icss.oa.methodBeforeAdvice;

import java.lang.reflect.Method;

import org.springframework.aop.AfterReturningAdvice;

public class ProxySubjectAfterAdvice implements AfterReturningAdvice {

	public void afterReturning(Object arg0, Method arg1, Object[] arg2,
			Object arg3) throws Throwable {
		System.out.println("方法调用之后...") ;
	}

}
