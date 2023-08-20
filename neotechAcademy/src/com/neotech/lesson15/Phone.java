package com.neotech.lesson15;

public class Phone {

	
	String make;
	String model;
	String color;
	
	int year;
	
	void videoRecord() {
		System.out.println(make+" "+model+" can record vidos in 1080p");
	}
	void battery() {
		System.out.println(make+" "+model+" have 8 hours battery life.");
	}
}
