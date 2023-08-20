package com.neotech.lesson05;

public class HomeWork01 {

	public static void main(String[] args) {
		
		boolean allergy = true ;
		boolean peanut = true;
		boolean lactose = false;		
		boolean bee = true ;
		boolean seafood = true;
				
		if (allergy) {
			System.out.println("You have an allergy.");
			
			if (peanut) {
				System.out.println("Dont eat peanuts!");
			}
			
			if (lactose) {
				System.out.println("Dont drink milk!");
			}
			else {
				System.out.println("You can drink milk!");
			}
			if (seafood) {
				System.out.println("Dont eat fish!");
			}
			if (bee) {
				System.out.println(" ");
			}
		}
		
		else {
			System.out.println("You are healthy!");
		}
	}

}
