package com.neotech.review06;

import java.lang.reflect.Array;

public class ToCharArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String longStr="I am very happy because its a weekend";
		
		System.out.println("String length--> "+ longStr.length());
		
		char[] charArray=longStr.toCharArray();
		
		System.out.println("char[] length --> " + charArray.length );
		
		//print the array
		for(char el: charArray)
		{
			System.out.print(el + "|");
		}
		System.out.println();
		
		for(int i=0; i<charArray.length; i++) {
			System.out.print(charArray[i]+"|");
		}
		System.out.println();
		
		for(int i=0; i<charArray.length; i++) {
			if(i==2 || i==11 || i==19 || i==28) {
				System.out.print('e');
			}
			else {
				System.out.print(charArray[i]);
			}	
		}
		System.out.println();
		
		char[] array=longStr.toCharArray();
		for(int i=0; i<array.length; i++) {
			if(array[i]=='a') {
				array[i]='e';
			}
		}
		System.out.println(array);
		
	}

}
