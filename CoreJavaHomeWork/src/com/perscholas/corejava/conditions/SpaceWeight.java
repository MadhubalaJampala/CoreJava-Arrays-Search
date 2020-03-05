package com.perscholas.corejava.conditions;

import java.util.Scanner;

public class SpaceWeight {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter your current earth weight:");
		double weight = input.nextDouble();
		System.out.println("I have information about following planets.");
		System.out.println("1.Venus \n2.Mars\n3.Jupiter\n4.Saturn\n5.Uranus"
				+ "\n6.Neptune");
		System.out.println("Which planet are you visiting?");
		int p = input.nextInt();
		double gravity;
		switch(p)
		{
		case 1:
			gravity = 0.78;
			break;
		case 2:
			gravity = 0.39;
			break;
		case 3:
			gravity = 2.65;
			break;
		case 4:
			gravity = 1.17;
			break;
		case 5:
			gravity = 1.05;
			break;
		case 6:
			gravity = 1.23;
			break;
		default:
			gravity = 0;	
		}
	System.out.println("Your weight would be "+ weight * gravity +" pounds on that planet.");
	}

}
