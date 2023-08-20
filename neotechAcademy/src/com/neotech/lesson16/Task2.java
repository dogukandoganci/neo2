package com.neotech.lesson16;

public class Task2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Create a String and if the String is not empty perform the following: 
		 * - if the String has an odd number of characters and has 3 or more 
		 * characters, print the character in the middle of the String.
		 */
		
		
		String str = "Olga  Belyakova";
		
		//isEmpty()
		if(!str.isEmpty()) { //if the string is not empty
			int length= str.length();
			
			if(length %2==1 && length>=3) {
				
				System.out.println(str.charAt(length/2));
				
			}
			}
		else {
			System.out.println("Either th elength is even or is less than 3");
		}
		
		
	}

}
