package com.nilesh.spring.springcore.dependancycheck;

import org.springframework.beans.factory.annotation.RequiredAnnotationBeanPostProcessor;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     ApplicationContext context=new ClassPathXmlApplicationContext("com/nilesh/spring/springcore/dependancycheck/config.xml");
     
     Prescription pt= (Prescription) context.getBean("prescription");
	//System.out.println("Patient id"+pt.getId());
	  System.out.println(pt);
	  
	}

}
