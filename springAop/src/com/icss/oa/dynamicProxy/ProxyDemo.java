package com.icss.oa.dynamicProxy;

public class ProxyDemo {
	
	public static void main(String[] args){
		
		ProxySubject ps = new ProxySubject();
		
		Subject sub = (Subject) ps.bind(new RealSubject());
		
		sub.request();
		
	}

}
