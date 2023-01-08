package com.nilesh.spring.springcore.car;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class test {
	
	public static void main(String args[]) {
		
		ApplicationContext context=new ClassPathXmlApplicationContext("com/nilesh/spring/springcore/car/setconfig.xml");
	
	   CarDealer cd=(CarDealer) context.getBean("cardealer");
	   
	   System.out.println("Car Dealer Name"+cd.getName());
	   System.out.println("Car Dealer Name"+cd.getModels());
	   
	}

}
