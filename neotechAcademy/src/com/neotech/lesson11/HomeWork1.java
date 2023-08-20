package com.neotech.lesson11;
import java.util.Scanner;
public class HomeWork1 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Enter an integer: ");
		int num1;
		num1= scan.nextInt();
		
		for(int x=0; x<num1; x++) 
		{
			for(int y=0; y<x; y++) {
				System.out.print(" ");
			}
			for(int k=num1; k>x; k--) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}		

}
