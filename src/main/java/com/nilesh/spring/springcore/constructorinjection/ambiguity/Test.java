package com.nilesh.spring.springcore.constructorinjection.ambiguity;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ApplicationContext context=new ClassPathXmlApplicationContext("com/nilesh/spring/springcore/constructorinjection/ambiguity/config.xml");
		
		Addition add = (Addition) context.getBean("addition");
		
		System.out.println(add);
		//System.out.println("Emp ID"+emp.getId());
		//System.out.println("House no"+emp.getAddress());
	}

}
