package com.neotech.review07;

public class Animal {

	String name;
	int legs;
	
	Animal(String name, int legs){
		this.name=name;
		this.legs=legs;
		
	}
	
	public void sleeps() {
		System.out.println("All animals sleep");
	}
	
	void displayInfo() {
		System.out.println(name+" has "+legs+" legs");
	}
}

class Wolf extends Animal{
	public Wolf(String name, int legs) {
		super(name, legs);
	}
}

class Fox extends Animal{
	String furColor;
	public Fox(String name, int legs, String furColor) {
		super(name, legs);
		this.furColor=furColor;
	}
}

class Bear extends Animal{
	void roar() {
		System.out.println(name+" roars!!");
	}
	
	public Bear(String name, int legs) {
		super(name,legs);
	}
}