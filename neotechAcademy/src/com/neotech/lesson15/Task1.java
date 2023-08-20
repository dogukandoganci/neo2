package com.neotech.lesson15;

public class Task1 {
	void larger(int a, int b) {
		if(a>b) {
			System.out.println(a+" is larger");
		}else {
			System.out.println(b+" is larger");
		}
	}
	
	void evenodd(int a) {
		if(a%2==0) {
			System.out.println("Even");
		}else {
			System.out.println("Odd");
		}
	}
	
	void hello(String country) {
		if(country.equals("USA")) {
			System.out.println("Hello");
		}else if(country.equals("Turkey")) {
			System.out.println("Merhaba");
		}else if(country.equals("France")) {
			System.out.println("Bonjour");
		}else {
			System.out.println("I don't know how to say hello in "+country);
		}
	}
	public static void main(String[] args) {
		Task1 t=new Task1();
		
		t.larger(6,25);
		t.evenodd(22);
		t.hello("German");
	}
}
