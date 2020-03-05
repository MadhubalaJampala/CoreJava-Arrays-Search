package com.perscholas.corejava.conditions;

import java.util.Scanner;

public class DayOfTheWeek {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter an integer (1-7):");
		int i = input.nextInt();
		input.close();
		
		switch(i)
		{
		case 1:
			System.out.println("Weekday "+ i +" is Monday!");
			break;
		case 2:
			System.out.println("Weekday "+ i +" is Tuesday!");
			break;
		case 3:
			System.out.println("Weekday "+ i +" is Wednesday!");
			break;
		case 4:
			System.out.println("Weekday "+ i +" is Thursday!");
			break;
		case 5:
			System.out.println("Weekday "+ i +" is Friday!");
			break;
		case 6:
			System.out.println("Weekday "+ i +" is Saturday!");
			break;
		case 7:
			System.out.println("Weekday "+ i +" is Sunday!");
			break;
		default:
			System.out.println("Error");
		}
	}

}
