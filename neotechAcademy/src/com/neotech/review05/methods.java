package com.neotech.review05;

public class methods {
	void sayWelcome() {
		for (int i = 1; i <= 5; i++) {
			System.out.print("Welcome ");
		}
		System.out.println();
	}

	void sayWelcomeWithNumber(int n) {
		for (int i = 1; i <= n; i++) {
			System.out.print("Welcome ");
		}
		System.out.println();
	}

	void sayGreeting(String greeting) {
		for (int i = 1; i <= 5; i++) {
			System.out.print(greeting + " ");
		}
		System.out.println();
	}

	void sayGreetingWithNumber(String greeting, int n) {
		for (int i = 1; i <= n; i++) {
			System.out.print(greeting + " ");
		}
		System.out.println();
	}

	void methodWithFourParameters(String name, int age, String lastName, String nationality) {
		System.out.println("My full name is -> " + name + " " + lastName);
		System.out.println("My age is -> " + age);
		System.out.println("My nationality is -> " + nationality);
	}

	public static void main(String[] args) {

		methods m = new methods();
		m.sayWelcome();
		m.sayWelcomeWithNumber(3);
		m.sayWelcomeWithNumber(8);
		m.sayGreeting("Hola");
		m.sayGreeting("Salut");

		m.sayGreetingWithNumber("Merbaha", 2);
		m.sayGreetingWithNumber("Ciao", 8);

		// Compile-time error
		// You have to provide 2 parameters, String & int
		// m.sayGreetingWithNumber("Konnichiwa");

		System.out.println("--------------------------------");
		m.methodWithFourParameters("American", 25, "Bird", "Huseyin");
	}

}
