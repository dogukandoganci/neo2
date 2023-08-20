package com.neotech.lesson22;

public class Parent {

	
	String name="Parent Name";
	String lastName="Parent Lastname";
	
	void hello() {
		System.out.println("I am the parent class!");
	}
		
}

class Child extends Parent{
	String name="Child Name";
	
	void display() {
		System.out.println(name); //Java adds this keyword in front of it
		System.out.println(this.name);
		System.out.println(super.name);
		System.out.println(super.lastName);
		System.out.println(lastName);
		System.out.println(this.lastName);
	}
	
	void hello() {
		System.out.println("I am the child class!");
	}
	
	void sayHello() {
		display(); // Java automatically adds this in front of the method
		hello();  //Java automatically adds this in front of the method
		super.hello(); //we are 
	}
	
	
	
	
	
	
	
}