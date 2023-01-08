package com.nilesh.spring.springcore.constructorinjection;

public class Employee {
	
	

	public Employee(int id, Address address) {
		super();
		this.id = id;
		this.address = address;
	}
	private int id;
	@Override
	public String toString() {
		return "Employee [id=" + id + ", address=" + address + "]";
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	private Address address;
}
