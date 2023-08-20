package com.neotech.review07;

public class World {
	public static void main(String[] args) {

		// 1st way, using the constructor with NO parameters
		Person p1 = new Person();
		p1.displayInfo();

		p1.name = "Yasemin";
		p1.age = 20;
		p1.weight = 120;
		// p1.hairColor = "Black";

		p1.displayInfo();

		System.out.println("----------------");

		// 2nd way, using the constructor with TWO parameters
		Person p2 = new Person("Ermal", 40);
		p2.displayInfo();

		p2.weight = 240;
		p2.displayInfo();

		System.out.println("----------------");

		Person p3 = new Person("Alban", 27);

		System.out.println("----------------");

		// 3rd way, using the constructor with THREE parameters
		Person p4 = new Person("Emilija", 22, 125);
		p4.displayInfo();

	}
}
