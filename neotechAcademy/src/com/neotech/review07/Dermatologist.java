package com.neotech.review07;

public class Dermatologist extends Doctor {
	
	String dermId;
	
	Dermatologist(){
		//super();
		// implicitly it is calling the default constructor
	}
	
	//The constructors are NOT inherited
	Dermatologist(String name, int salary, String licenceId, String dermId){
		
		super(name, salary, licenceId);
	//	super.name=name;
	//	super.salary=salary;
	//	super.licenceId=licenceId;
		this.dermId=dermId;
	}
	
	public void applySkinTreatment() {
		System.out.println("Doctor "+name+" applies skin treatment");
	}
}
