package com.nilesh.spring.springcore.constructorinjection.ambiguity;

public class Addition {

	Addition(int a,int b){
		System.out.println("Inside constructor..i");
	}
	Addition(double a,double b){
		System.out.println("Inside constructor..ii");
	}
	Addition(String a,String b){
		System.out.println("Inside constructor..iii");
	}
	
}
