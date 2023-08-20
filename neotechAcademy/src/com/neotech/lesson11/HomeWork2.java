package com.neotech.lesson11;
import java.util.Scanner;
public class HomeWork2 {

	public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	System.out.println("Enter an integer: ");
	int num1;
	num1=scan.nextInt();
	
	for(int x=1; x<=num1; x++) {
		for(int y=1; y<=x; y++) {
			System.out.print(y);
		}System.out.println();	
	}
	for(int z=4; z>=1; z--) {
		for(int q=1; q<=z; q++) {
			System.out.print(q);
		}System.out.println();
	}
	
	}

}
