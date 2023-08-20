package com.neotech.lesson16;

public class StringMethodsMore {

	public static void main(String[] args) {
		
		//charAt()
		
		// Scanner scan= new Scanner(System.in);
		// char letter scan.next().charAt(0)
		// System.out.println(letter);
		
		
		String name="Dogukan";
		char letter=name.charAt(1);
		System.out.println("letter: "+letter);
		
		
		//indexOf()
		int index = name.indexOf('i');
		System.out.println("Index of u is: "+index);
		
		String name1="Yahya";
		System.out.println("Index of a is: "+name1.indexOf('a'));
		System.out.println("Index of hy is: "+name1.indexOf("hy"));
		
		//subString()
		
		String message="Today is a very good day!";
		//one parameter: where to begin (beginning index)
		String substr=message.substring(9);  //get a substring of the original string starting at index 9
		System.out.println(substr);
		
		String substr2=message.substring(6,8);
		//two parameters: beginning and ending index
		System.out.println(substr2);
		
	}

}
