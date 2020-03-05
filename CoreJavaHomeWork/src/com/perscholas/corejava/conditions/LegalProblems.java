package com.perscholas.corejava.conditions;

import java.util.Scanner;

public class LegalProblems {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Hey, What\'s your name?");
		String name = input.nextLine();
		System.out.printf("ok, %s, How old are you?",name);
		int age = input.nextInt();
		input.close();
		
		if (age<16)
			System.out.println("You can\'t drive, "+name+".");
		if (age <18)
			System.out.println("You can\'t vote, "+name+".");
		if (age < 25)
			System.out.println("You can\'t rent a car, "+name+".");
		if(age>=25)
			System.out.println("You can do anything that\'s legal, "+name+".");
		
	}

}
