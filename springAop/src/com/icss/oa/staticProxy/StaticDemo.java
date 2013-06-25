package com.icss.oa.staticProxy;

public class StaticDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Subject sub = new ProxySubject(new RealSubject());
		
		sub.request();

	}

}
