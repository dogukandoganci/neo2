package com.neotech.lesson11;

public class ArrayLength {

	public static void main(String[] args) {
		String[] students=new String[5];
		System.out.println(students[0]);
		students[0]="Jahon";
		students[1]="Cihan";
		students[2]="Emine";
		students[3]="Yasemin";
		students[4]="Helen";
		
		int arrayLength = students.length;
		System.out.println("The length of the students array is: "+ arrayLength);
		

		//Another way of declaring an array
		
		int[] scores= {90,86,94,88,80,99};
		System.out.println("The length of the scores array is: "+scores.length);
		System.out.println("Second score is: "+ scores[1]);
		
		int lastIndex= scores.length-1;
		System.out.println("Final score is: "+scores[lastIndex]);
		
		
		
		
	}

}
