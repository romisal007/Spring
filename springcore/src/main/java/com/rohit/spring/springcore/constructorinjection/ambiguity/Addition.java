package com.rohit.spring.springcore.constructorinjection.ambiguity;

public class Addition {

	Addition(double a, double b){
		System.out.println("insite Double");
	}
	Addition(int a, int b){
		System.out.println("insite integer");
	}

	Addition(String a, String b){
		System.out.println("insite String");
	}
	Addition(int a, double b){
		System.out.println("insite constructor");
		System.out.println(a);
		System.out.println(b);

	}
	@Override
	public String toString() {
		return "Addition [getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString()
				+ "]";
	}
	
}
