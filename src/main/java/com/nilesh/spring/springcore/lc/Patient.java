package com.nilesh.spring.springcore.lc;

public class Patient {
	
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

}
