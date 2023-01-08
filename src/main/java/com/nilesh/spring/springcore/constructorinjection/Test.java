package com.nilesh.spring.springcore.constructorinjection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ApplicationContext context=new ClassPathXmlApplicationContext("com/nilesh/spring/springcore/constructorinjection/config.xml");
		
		Employee emp = (Employee) context.getBean("employee");
		
		System.out.println(emp);
		System.out.println("Emp ID"+emp.getId());
		System.out.println("House no"+emp.getAddress());
	}

}
