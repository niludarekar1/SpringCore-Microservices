package com.nilesh.spring.springcore.list;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ClassPathXmlApplicationContext ctx=new ClassPathXmlApplicationContext("com/nilesh/spring/springcore/list/listconfig.xml");
		Hospital object= (Hospital) ctx.getBean("hospital");
		
		System.out.println("Hospital Name "+object.getName());
		System.out.println("Hospital Dept Name "+object.getDepartments());
	}

}
