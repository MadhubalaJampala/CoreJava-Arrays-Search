/*Season | First day
Spring | March 20
Summer | June 21
Fall   | September 22
Winter | December 21

Create a program that reads a month and day from the user. The user will 
enter the name of the month as a string, followed by the day within the 
month as an integer. Then your program should display the season associated with the date that
was entered. */



package com.perscholas.corejava.conditionals3;

import java.util.Scanner;

public class SeasonFromMonthDay {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the month:");
		String month = input.next().toLowerCase();
		System.out.println("Enter day of the month:");
		int day = input.nextInt();
		
		switch(month)
		{
		case "january":
			if(day>=1 && day<=31) 
				System.out.println("Season is Winter");
			else
				System.out.println("Try again!");
			break;
		case "february":
			if(day>=1 && day <= 29) 
				System.out.println("Season is Winter");
			else
				System.out.println("Try again!");
			break;	
		case "march":
			if(day>=1 && day<20)
				System.out.println("Season is Winter");
			else if(day>=20 && day<=31)
				System.out.println("Season is Spring");
			else
				System.out.println("Try again!");
			break;
		case "april":
			if(day>=1 && day<=30) 
				System.out.println("Season is Spring");
			else
				System.out.println("Try again!");
			break;
		case "may":
			if(day>=1 && day<=31) 
				System.out.println("Season is Spring");
			else
				System.out.println("Try again!");
			break;
		case "june":
			if(day>=1 && day<21)
				System.out.println("Season is Spring");
			else if(day>=21 && day<=30)
				System.out.println("Season is Summer");
			else
				System.out.println("Try again!");
			break;
		case "july":
			if(day>=1 && day<=31) 
				System.out.println("Season is Summer");
			else
				System.out.println("Try again!");
			break;
		case "august":
			if(day>=1 && day<=31) 
				System.out.println("Season is Summer");
			else
				System.out.println("Try again!");
			break;
		case "september":
			if(day>=1 && day<22)
				System.out.println("Season is Summer");
			else if(day>=22 && day<=30)
				System.out.println("Season is Fall");
			else
				System.out.println("Try again!");
			break;
		case "october":
			if(day>=1 && day<=31) 
				System.out.println("Season is Fall");
			else
				System.out.println("Try again!");
			break;
		case "november":
			if(day>=1 && day<=30) 
				System.out.println("Season is Fall");
			else
				System.out.println("Try again!");
			break;
		case "december":
			if(day>=1 && day<21)
				System.out.println("Season is Fall");
			else if(day>=21 && day<=31)
				System.out.println("Winter");
			else
				System.out.println("Try again!");
			break;
		default:
			System.out.println("Try Again.");
		}
		

	}

}
