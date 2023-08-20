package com.neotech.lesson22;

public class Car {
/*
 * Write a Java program called Car. Specify features and behaviours of the Car class.
    Create SportsCar and FamilyCar subclasses of the Car class with their
     own features and behaviours.
    Next, create a LuxurySportsCar that will inherit the SportsCar and 
    also will have its own features and behaviours.
    Create objects from each class and test them.
 */
	
	String make, model;
	int year;
	
	Car(){
		System.out.println("I am the Car Class consructor!");
	}
	
	Car(String make, String model, int year){
		this.make=make;
		this.model=model;
		this.year=year;
	}

}

class SportsCar extends Car{
	String transmission;
	int speed;
	
	SportsCar(){
		//Car() runs -- we checked it in debug mode
		
		//super(); //is called by default
		//super("Default make","Default model",2000);
		
		//we can also call other constructors within the same 
		this("MB","E",2000,"Automatic",220);
	}
	
	SportsCar(String make,String model,int year,String transmission,int speed){
		//can I call super()?? yes, what would mean we are calling the default constructor 
		//of the super class
		
		//call the super constructor to initialize the parameters in the super class
		super(make, model, year);
		
		//using this keyword to initialize instance variables
		this.transmission=transmission;
		this.speed=speed;
	
	}
}

class FamilyCar extends Car{
	
	boolean childLock;
	int seats;
	
	FamilyCar()
	{
		System.out.println("FamilyCar default constructor");
	}
}

class LuxurySportsCar extends SportsCar{
	boolean designerSeats;
	
	//left with default constructor
}


