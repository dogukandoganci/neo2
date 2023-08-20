package com.neotech.lesson11;

public class IntroToArray {

	public static void main(String[] args) {
		int num =5;
		int[] array1 = new int[5];
		int [] array2;
		array2= new int[8];
		
		array1[0]=10;
		array1[1]=15;
		array1[2]=20;
		array1[3]=25;
		array1[4]=30;
		
		String[] strArray= new String[4];
		
		strArray[0]="New York";
		strArray[1]="New Jersey";
		strArray[2]="Atlanta";
		strArray[3]="Colorado";
		//strArray[4]="Reno";
		
		System.out.println("I live in "+strArray[3]);
		
		char[] letters=  new char[6];
		letters[3]='C';
		letters[5]='A';
		letters[0]='B';
		letters[1]='X';
		
		System.out.println("The letter at index 5 is: "+ letters[5]);
		letters[5]='Y';
		System.out.println("The letter at index 5 is: "+ letters[5]);
		
		System.out.println(letters[0]);

	}

}
