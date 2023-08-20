package com.neotech.lesson12;

public class Task3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] countries= {"Germany","USA","UK","Turkey"};
		int size=countries.length;
		for(int i=0; i<size; i++) {
		if(countries[i].equals("Germany")) {
			System.out.println("capital of Germany is Berlin");
		}
		if(countries[i].equals("USA")) {
			System.out.println("capital of USA is Washington");
		}
		if(countries[i].equals("UK")) {
			System.out.println("capital of UK is London");
		}
		if(countries[i].equals("Turkey")) {
			System.out.println("capital of Turkey is Istanbul");
			}
		}
		
	}

}
