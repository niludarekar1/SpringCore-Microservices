package com.nilesh.spring.springcore.annotation;
import javax.annotation.*;
import org.springframework.*;
//import javax.annotation.PreDestroy;
public class Patient {
	
	private int id;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		System.out.println("Inside Setter ");
		this.id = id;
	}
	@PostConstruct
	public void hi() {
		System.out.println("Hi..");
	}

	@PreDestroy
	public void bye() {
		System.out.println("Hi..Destroy");
	}

}
