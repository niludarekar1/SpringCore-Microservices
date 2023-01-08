package com.nilesh.spring.springcore.lc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     ApplicationContext context=new ClassPathXmlApplicationContext("com/nilesh/spring/springcore/lc/config.xml");
     
     Patient pt=(Patient) context.getBean("patient");
	System.out.println("Patient id"+pt.getId());
	}

}
