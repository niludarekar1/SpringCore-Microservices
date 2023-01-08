package com.nilesh.spring.springcore.lc.interfaces.copy;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Patient implements InitializingBean,DisposableBean {
	
	private int id;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		System.out.println("Inside Setter ");
		this.id = id;
	}
	
	public void hi() {
		System.out.println("Hi..");
	}

	public void bye() {
		System.out.println("Hi..");
	}

	@Override
	public void destroy() throws Exception {
		// TODO Auto-generated method stub
		
		System.out.println("Destrroy..");
		
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		// TODO Auto-generated method stub
		
	}

}
