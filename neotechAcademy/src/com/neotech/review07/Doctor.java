package com.neotech.review07;

//OOP -Object Oriented Programming
//1.Inheritance(Miras)
//2.Polymorphism
//3.Abstraction
//4.Encapsulation

//Every class in Java extending the Object
//Object class is like Adam in humanity :)
public class Doctor {

	String name;
	int salary;
	String licenceId;
	
	//it is a good practice to leave the default constructor
	Doctor(){
		
	}
	
	Doctor(String name, int salary, String licenceId){
		this.name=name;
		this.salary=salary;
		this.licenceId=licenceId;
	}
	
	public void checkUp(String patientName) {
		System.out.println("Doctor "+name+" makes a checkup on "+patientName);
	}
}
