package com.neotech.lesson13;

public class HomeWork02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Create a 2D array that first row will contain 4 names and second row will contain grades, all Strings.
		 *Then you program should print name of the students that has A and B grade
		 * 
		 */
		
		String[][] students= {
				{"Omer", "Ahmet", "Ismail", "Olga"},	
				{"A","B","A","D"}
		};
		//students.length---> number of rows
		//for the number of columns in a row i
		//students[i].length
		for(int i=0; i< students[1].length; i++)
		{
			if(students[1][i].equals("A") || students[1][i].equals("B")) {
				System.out.println(students[0][i]+" : "+students[1][i]);
			}
			
		}
		
		
		
		
		
		
		
		
		
		
		
	}

}
