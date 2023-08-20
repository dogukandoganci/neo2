package com.neotech.review05;

public class MethodWithReturn {
	public static void main(String[] args) {
		String name = "Emilija";
		int numOfChars = name.length();

		System.out.println("The length of \"" + name + "\" is " + numOfChars);

		System.out.println(name.length());

		MethodWithReturn m = new MethodWithReturn();
		boolean res = m.isOdd(8);
		System.out.println("The number 8 is odd? " + res);

		boolean res2 = m.isOddAnotherWay(11);
		System.out.println("The number 11 is odd? " + res2);
		
		System.out.println(m.isOddEnhanced(5));

	}

	// If this one is confusing, it's OK, don't worry
	// Divide the number by 2, and if the result is true -> return true, if it is false -> return false
	boolean isOddEnhanced(int num) {
		return num % 2 == 1;
	}

	boolean isOddAnotherWay(int num) {
		if (num % 2 == 1) {
			return true;
		} else {
			return false;
		}
	}

	boolean isOdd(int num) {
		boolean result;

		if (num % 2 == 1) {
			result = true;
		} else {
			result = false;
		}

		return result;
	}
}
