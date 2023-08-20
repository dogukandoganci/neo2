package com.neotech.lesson26;

public class Employee {
		
	private String name;
	private int age;
	private double salary; //this can be access only within the same class
	
	//we can define getters and setters
	
	//I want to provide a method that allows the user who use my class to get the name
	//getter:
	
	public String getName() 
	{
		return name;
	}
	
	//I want to provide a method that allows user of the class to set the name
	
	//setters:
	public void setName(String name)
	{
		//I want to allow this only if the string sent
		if(!name.isEmpty() && name.length()>3) {
			this.name=name;
		}
	}
	
	
	
}
