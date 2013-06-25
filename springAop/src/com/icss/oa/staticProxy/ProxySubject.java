package com.icss.oa.staticProxy;

public class ProxySubject implements Subject {
	
	private Subject sub = null;
	
	public ProxySubject(Subject sub){
		this.sub = sub;
	}
	
	
	public void before(){
		System.out.println("真正实现之前");
	}

	public void request() {
		this.before();
		this.sub.request();
		this.after();
	}
	public void after(){
		System.out.println("真正实现之后");
	}


	public void addUser() {
		// TODO Auto-generated method stub
		
	}

}
