package com.neotech.lesson23;

public class Degree {
	void getPrerequisite()
	{
		System.out.println("To get a degree you need high school diploma");
	}
}

class Bachelors extends Degree
{
	Bachelors(){
		System.out.println("Bachelors class constructor");
	}
}

class Masters extends Degree
{
	void getPrerequisite()
	{
		System.out.println("To get a MS degree you need a bachelors degree");
	}
}