package com.neotech.lesson07;

import java.util.Scanner;

public class ScannerAndSwitch {

	public static void main(String[] args) {
		//ask user country
		//print the language
		
		Scanner scan = new Scanner(System.in);
		String country;
		
		System.out.println("Where are you from ?");
		country = scan.next();
		
		if(country.equals("Albania")) {
			System.out.println("You speak Albanian!");
		}
		else if(country.equals("USA")||country.equals("UK")||country.equals("Australia")) {
			System.out.println("You speak English!");
		}
		else {
			System.out.println("I dont know what language you speak!");
		}

		//using switch:
		
				//convert user input to lowercase: ALBANIA --> albania
				//country = country.toLowerCase();
		switch(country) {
		case "Albania":
			System.out.println("You speak Albanian");
			break;
		case "USA":
		case "UK":
		case "Australia":
			System.out.println("You speak English!");
			break;
		case "Turkiye":
			System.out.println("You speak Turkish!");
			break;
		default:
			System.out.println("I dont know what language you speak!");
			break;
			
		}
		//how can we ignore the Upper cases???
				//for the if condition: 
					// I can use .equalsIgnoreCase() instead of .equals() (see the first if condition)
					//both of these methods are used to compare if two Strings are the same
				
				//for the case (and the if as well): 
					//I can use a method (.toLowerCase) to convert the use input to lower case.
		
		
	}

}
