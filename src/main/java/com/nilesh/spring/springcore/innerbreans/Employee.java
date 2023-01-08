package com.nilesh.spring.springcore.innerbreans;

public class Employee {

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
