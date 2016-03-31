package com.test.testSpringHibernateAOP.customer.model;

public class Customer {
	public long custId;
	public String name;
	public long age;
	
	public Customer() {
		
	}
	
	public Customer(String name, long age) {
		this.name = name;
		this.age = age;
	}
	
	public long getCustId() {
		return custId;
	}
	public void setCustId(long custId) {
		this.custId = custId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public long getAge() {
		return age;
	}
	public void setAge(long age) {
		this.age = age;
	}
	
	@Override
	public String toString() {
		return "Customer: " + this.getCustId() + " " + this.getName() + " " + this.getAge();
	}
}
