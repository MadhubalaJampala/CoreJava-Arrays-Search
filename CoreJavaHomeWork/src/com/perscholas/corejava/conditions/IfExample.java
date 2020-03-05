package com.perscholas.corejava.conditions;

public class IfExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int people = 2 ,cats = 20,dogs = 20;
		
		//checks if people are less or more than cats and prints appropriate message
		if(people < cats)
			System.out.println("Too many cats! The world is doomed!");
		else if (people > cats)
			System.out.println("Too few cats! The world is saved for another day!");
		
		//checks if people are less or more than dogs and prints appropriate message
		if(people < dogs)
			System.out.println("The world is drooled on!");
		else if (people > dogs)
			System.out.println("The world is dry");
		
	}

}
