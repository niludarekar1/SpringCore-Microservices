package com.nilesh.spring.springcore.cust;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ClassPathXmlApplicationContext ctx=new ClassPathXmlApplicationContext("com/nilesh/spring/springcore/cust/mapconfig.xml");
		Customer object= (Customer) ctx.getBean("customer");
		//System.out.println(object);
		System.out.println("Customer ID "+object.getId());
		System.out.println("Customer Products"+object.getProducts());
	}

}
