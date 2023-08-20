package com.neotech.lesson11;
import java.util.Scanner;
public class HomeWork {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
	    String word = scan.next();
	    String separator = scan.next();
	    int count = scan.nextInt();
	    for(int x=1; x<=count; x++){
	      System.out.print(word);
	      if(x<count){
	        System.out.print(separator);
	      }

		    
		  }
	}
}
		
	


