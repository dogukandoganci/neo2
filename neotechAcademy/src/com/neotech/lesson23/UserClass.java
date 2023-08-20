package com.neotech.lesson23;

public class UserClass {
/*
 * Homework 4:
    Write program: UserClass that has a constructor that
    initializes instance variable name and mobile number.
    Create a subclass UserInfo that will have user address
    variable and it also being initialized through constructor
    call. Print users name, mobile number and address in
    userDetails method. Test your code.

 */
	String name;
	long mobileNumber;
	
	//if we define a parametrized constructor, but we do not define a default constructor
	//Java will not let the users of the class to call the default constructor
	
	//default constructor
	UserClass()
	{
		
	}
	UserClass(String name, long mobileNumber)
	{
		this.name=name;
		this.mobileNumber=mobileNumber;
	}
}

class UserInfo extends UserClass{
	String userAdress;
	UserInfo(String name, long mobileNumber, String userAdress)
	{
		//super();//if i do this , then name and mobileNumber are initialized with default
		super(name, mobileNumber);
		this.userAdress=userAdress;
	}
	
	void userDetails()
	{
		System.out.println("User Details:");
		System.out.println("Name--> "+name);
		System.out.println("Mobile--> "+super.mobileNumber);
		System.out.println("Adress--> "+userAdress);
	}
}
