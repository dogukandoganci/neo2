package com.neotech.lesson15;

public class Dog {

	
	
	String name;
	String breed;
	String size;
	String hairColor;
	int age;
	int poopsADay;
	
	void plays() {
		System.out.println(name+" is a "+breed+" and loves to play games in backyard!");
	}
	void poops() {
		System.out.println(name+" is a "+size+" size dog and poops "+poopsADay+" times a day.");
	}
}
