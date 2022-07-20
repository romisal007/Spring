package com.rohit.spring.springcore.propertyplaceholder;

public class MyDAO {

	private String dbserver;
	MyDAO(String dbserver){
		this.dbserver=dbserver;
	}
	@Override
	public String toString() {
		return "MyDAO [dbserver=" + dbserver + "]";
	}
	
}
