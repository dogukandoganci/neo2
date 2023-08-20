package com.neotech.lesson10;

public class Patterns {

	public static void main(String[] args) {
		/*
		 
		 *
		 **
		 ***
		 ****
		 *****
		 
		 */
		for (int row=0; row<5; row++) {
			for(int col=0; col<=row; col++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		/*
		 
		 *****
		 ****
		 ***
		 **
		 *
		 
		 */
		
		
		for (int row =5; row>=1; row--) {  //we change from 5 to 4 to print a pyramid
			for(int col=0; col<row; col++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
