package com.neotech.lesson06;

public class logicalAND {

	public static void main(String[] args) {
		int num = 35;
		
		if (num >= 1 && num <= 10) {
			System.out.println(num + " is small!");
		}
		else if (num >=11 && num <= 100 ) {
			System.out.println(num + " is medium!");
		}
		else if (num >= 101 && num <= 1000){
			System.out.println(num +" is large!");
		}
		else
		{
			System.out.println(num + " is out of range!");
		}

	}

}
