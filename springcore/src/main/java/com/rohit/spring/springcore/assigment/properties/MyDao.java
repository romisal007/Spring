package com.rohit.spring.springcore.assigment.properties;

public class MyDao {


private String url;
private String userName;
private String userPassword;

public MyDao(String url, String userName, String userPassword) {
	super();
	this.url = url;
	this.userName = userName;
	this.userPassword = userPassword;
}

@Override
public String toString() {
	return "MyDao [url=" + url + ", userName=" + userName + ", userPassword=" + userPassword + "]";
}


}
