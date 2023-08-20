package com.neotech.lesson24;

public class FinalKeyword {

	public static String str="Hello";
	
	//Final variable = Constant! it can not be re-assigned
	
	public static final String str2="Bye";

	public final double PI=3.1415926; // PI will always have this value
	
	public static void main(String[] args) {
		 str="Hi";
		 //str2="Try me"; //Compile error
		 
		 //local variables
		 final String finalStr="Java is easy";
		 //finalStr="Java is difficult";
		 
		 final int age=28;
		 //age++; can not change
		 //age=29;
		 
	}
	
	//final method can not be overridden
	
	public final void hello() {
		System.out.println("I am a final method");
	}
	
	//Yes we can overload a final method
	public final void hello(String name) {
		System.out.println("Hello "+name);
	}
}
	
	class Subclass extends FinalKeyword{
		// let's try to override the hello() method
		// @Override
		// public void hello() { //Compile error: final method can not be overridden
		//	
		// }
		
		//not overriding: Method signature is different, just another method
		public void hello(int num) {
			
		}
		
		
	}
	