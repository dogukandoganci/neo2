package com.neotech.lesson08;

import java.util.Scanner;
public class HomeWork01 {

	public static void main(String[] args) {
		System.out.println("Enter your grade:");

		Scanner input = new Scanner(System.in);
		char grade = input.next().charAt(0);

		switch (grade) {
		case 'A':
		case 'a':
		System.out.println("A-Excellent");
		break;

		case 'B':
		System.out.println("B-Good");
		break;

		case 'C':
		System.out.println("C-Average");
		break;

		case 'D':
		System.out.println("D-Bad");
		break;

		default:
		System.out.println("Not Acceptable");
		break;
		}

		input.close();
		}	

	}

