package com.neotech.lesson16;

import java.util.Scanner;
public class HomeWork1 {
	/*Create a method createEmail(). Based on provided users firstName, lastName and emailType, your method should return complete email address.
	Example: 
	firstName -> john
	lastName -> snow
	emailType -> gmail
	return -> johnsnow@gmail.com
	
	 */
	
	String createEmail(String firstName, String lastName, String emailType, int year)
	{
		//return type only defines what we send back
		//parameters are inputs String, String, String, int
		
		//firstNamelastNameYear@emailType.com
		String email= firstName + lastName + year + "@" + emailType + ".com";
		
		
		
		// return firstName + lastName + year + "@" + emailType + ".com";
		return email;
	}
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Please enter youtr first name: ");
		String fName=scan.next();
		
		System.out.println("Please enter your last name: ");
		String lName=scan.next();
		
		System.out.println("Please enter the year you were born: ");
		int y=scan.nextInt();
		
		System.out.println("Please enter your email type: ");
		String eType=scan.next();	
		
		
		HomeWork1 hw=new HomeWork1();
		String fullEmail=hw.createEmail(fName, lName, eType, y);
		System.out.println("The full email is: "+fullEmail);
		
		
	}
}
