package com.nilesh.spring.springcore;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		ClassPathXmlApplicationContext ctx=new ClassPathXmlApplicationContext("config.xml");
		
		Employee emp= (Employee) ctx.getBean("emp");
	   System.out.println("Emp Id "+emp.getId());
	   System.out.println("Emp Name "+emp.getName());
	}

}
