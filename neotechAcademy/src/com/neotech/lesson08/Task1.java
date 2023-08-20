package com.neotech.lesson08;

public class Task1 {

	// TASK 1
	// How can I print only even numbers from 50 to 1?
	
	public static void main(String[] args) {
		int x = 50;
		// solution 1
		while (x >= 1) {
			System.out.print(x + " ");
			x -= 2;
		}
		
		System.out.println();
		int y = 50;
		// solution 2
		while (y >= 1) {
			if (y % 2 == 0) { // even number check
				System.out.print(y + ",");
			}
			
			y--;
		}	
		
	}

}
