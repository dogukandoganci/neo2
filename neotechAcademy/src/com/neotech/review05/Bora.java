package com.neotech.review05;

public class Bora {
	// A method NO parameters and NO return type
		void addTwoNumbers() {
			System.out.println("I am inside addTwoNumbers");
			int result = 3 + 2;
		}

		// A method TWO parameters and NO return type
		void addTwoNumbersThatIGive(int a, int b) {
			System.out.println("I am inside addTwoNumbersThatIGive");
			int result = a + b;
		}

		// A method NO parameters and WITH return type
		int addTwoNumbersAndGiveMeTheResult() {
			System.out.println("I am inside addTwoNumbersAndGiveMeTheResult");
			int result = 3 + 2;
			return result;
		}
		
		// A method TWO parameters and WITH return type
		int addTwoNumbersThatIGiveAndGiveMeTheResult(int num1, int num2) {
			System.out.println("I am inside addTwoNumbersThatIGiveAndGiveMeTheResult");
			int result = num1 + num2;
			return result;
		}

}
