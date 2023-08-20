package com.neotech.review07;

public class HospitalApplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Doctor d1=new Doctor("olga",310000,"RU123");
		d1.checkUp("Abril");
		
		//these are methods and variables of the child class
		// d1.dermId="XYZ";
		// d1.applySkinTreatment();
		
		//Creating a Dermatologist with NO initial information
		Dermatologist d2=new Dermatologist();
		d2.name="June";
		d2.salary=450000;
		d2.licenceId="JL345";
		d2.dermId="D789";
		
		d2.checkUp("Mel");
		d2.applySkinTreatment();
		
		System.out.println("-------------");
		
		Dermatologist d3=new Dermatologist("Alban",380000,"AL352","D938");
		d3.checkUp("Cihan");
		d3.applySkinTreatment();
		
		System.out.println("-------------");
		
		//The constructors are not inherited
		
	}

}
