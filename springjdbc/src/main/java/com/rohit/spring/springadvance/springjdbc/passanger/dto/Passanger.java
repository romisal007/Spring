package com.rohit.spring.springadvance.springjdbc.passanger.dto;

public class Passanger {

	private int id;
	private String firstName;
	private String lastName;

	@Override
	public String toString() {
		return "Passanger [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + "]";
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

}
