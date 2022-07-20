package com.rohit.spring.springadvance.autowiring.annotations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Employee {
	/* @Autowired on filed */

	@Autowired(required = false)
	@Qualifier("address1")
	private Address address;

	/*
	 * @Autowired public Employee(Address address) { super(); this.address =
	 * address; }
	 */
	public Address getAddress() {
		return address;
	}

	/* @Autowired on ser]t */
	public void setAddress(Address address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Emloyee [address=" + address + "]";
	}

}
