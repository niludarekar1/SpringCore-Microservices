package com.nilesh.spring.springcore.propertyplaceholder;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nilesh.spring.springcore.list.Hospital;

public class Test {

	public static void main(String[] args) {
		
		ApplicationContext ctx=new ClassPathXmlApplicationContext("com/nilesh/spring/springcore/propertyplaceholder/listconfig.xml");
		MyDAO object= (MyDAO) ctx.getBean("myDAO");
		System.out.println(object);
	}
}
