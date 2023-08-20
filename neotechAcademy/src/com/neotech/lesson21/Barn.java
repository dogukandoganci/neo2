package com.neotech.lesson21;

public class Barn {
	public static void main(String[] args) {
		Animal a = new Animal();
		a.name = "DayDay";
		a.color = "Brown";
		a.age = 5;

		a.sleep();
		a.eat();
		a.displayInfo();

		System.out.println("---------");
		Dog d = new Dog();
		d.name = "Nice";// coming from Animal
		d.age = 2;// coming from Animal
		d.color = "White"; // coming from Animal
		d.breed = "Husky"; // coming from Dog

		d.eat();// coming from Animal
		d.sleep();// coming from Animal
		d.displayInfo();// coming from Animal
		d.bark();// coming from Dog
		
		System.out.println("---------");
		Cat c = new Cat();
		c.name = "Lucky";// coming from Animal
		c.age = 2;// coming from Animal
		c.color = "Orange";// coming from Animal
		c.weight = 15;// coming from Animal

		c.eat();// coming from Animal
		c.sleep();// coming from Animal
		c.displayInfo();// coming from Animal
		c.meow();// coming from Cat

		System.out.println("---------");
		Puppy p = new Puppy();
		p.name = "Tiny";// coming from Animal
		p.age = 1;// coming from Animal
		p.breed = "Pug";// coming from Dog
		p.hasPottyTraining = false;// coming from Puppy
	}

}
