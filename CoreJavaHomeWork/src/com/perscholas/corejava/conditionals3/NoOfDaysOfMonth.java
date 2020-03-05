package com.perscholas.corejava.conditionals3;

import java.util.Scanner;

public class NoOfDaysOfMonth {

	public static void main(String[] args) {
		/*create a program that reads the name of a month from the user 
		 * as a string. Then your program should display the number of days 
		 * in that month. Display "28 or 29 days" for February so that 
		 * leap years are addressed.*/
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the name of a month:");
		String month = input.next();
		input.close();
		switch(month.toLowerCase())
		{
		case "january":
		case "march":
		case "may":
		case "july":
		case "august":
		case "october":
		case "december":
			System.out.println(month+" has 31 days");
			break;
		case "april":
		case "june":
		case "september":
		case "november":
			System.out.println("30 days");
			break;
		case "february":
			System.out.println("28 or 29 days");
			break;
		default:
			System.out.println("Try Again.");
		}

	}

}
