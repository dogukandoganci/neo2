package com.neotech.lesson07;

public class IntroToSwitch {

	public static void main(String[] args) {
		//given a number from 1 - 7, print the name of the day
				int day = 5;
				String dayName;
				
				
				if (day == 1)
				{
					//System.out.println("Monday");
					dayName = "Monday";
				}
				else if (day == 2)
				{
					//System.out.println("Tuesday");
					dayName = "Tuesday";
				}
				else if (day == 3)
				{
					//System.out.println("Wednesday");
					dayName = "Wednesday";
				}
				else if (day == 4)
				{
					//System.out.println("Thursday");
					dayName = "Thursday";
				}
				else if (day == 5)
				{
					//System.out.println("Friday");
					dayName = "Friday";
				}
				else if (day == 6)
				{
				//	System.out.println("Saturday");
					dayName = "Saturday";
				}
				else if (day == 7)
				{
					//System.out.println("Sunday");
					dayName = "Sunday";
				}
				else 
				{
					//System.out.println("Invalid");
					dayName = "Invalid";
				}
					
				
				System.out.println("The name of the day with number " + day + " is " + dayName);
				
				
				//Using switch case:
				
				switch(day) //we write switch and use the variable that hold our value
				{//opens the switch block
				case 1:
					//System.out.println("Monday");
					dayName = "Monday";
					break; //ends the execution - takes you out of the switch
				case 2:
					//System.out.println("Tuesday");
					dayName = "Tuesday";
					break;
				case 3: 
					//System.out.println("Wednesday");
					dayName = "Wednesday";
					break;
				case 4:
					//System.out.println("Thursday");
					dayName = "Thursday";
					break;
				case 5:
					//System.out.println("Friday");
					dayName = "Friday";
					break;
				case 6:
					//System.out.println("Saturday");
					dayName = "Saturday";
					break;
				case 7: 
					//System.out.println("Sunday");
					dayName = "Sunday";
					break;
				default:	// same as else block on the if - else if - else
					//System.out.println("Invalid");
					dayName = "Invalid";
					break;
					
				}//closes the switch block
				
				System.out.println("The name of the day with number " + day + " is " + dayName);

	}

}
