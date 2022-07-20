package testJava.com.supertest;

public class Puppy extends Dog {

	void eat() {
		System.out.println("Puppy eating");
	}
	void bark() {
		System.out.println("Puppy is barking");
	}

	void work() {

		super.eat();
		bark();
	}
}
