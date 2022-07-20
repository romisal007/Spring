package testJava.com.supertest;

public class Dog extends Animal {

	void bark() {
		System.out.println("dog is barking");
	}

	void work() {

		super.eat();
		bark();
	}

	void eat() {
		System.out.println("Dog eating");
	}
	
}