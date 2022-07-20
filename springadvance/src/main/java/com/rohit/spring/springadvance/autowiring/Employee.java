package com.rohit.spring.springadvance.autowiring;

public class Employee {

	private Address address;

	
	public Employee(Address address) {
		super();
		this.address = address;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Emloyee [address=" + address + "]";
	}

}
