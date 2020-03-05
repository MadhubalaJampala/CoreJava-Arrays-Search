package com.perscholas.corejava.conditions;

public class CarsOrBuses {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int people =10,cars = 20,buses = 30;
		
		if(cars > people)
			System.out.println("We should take the cars.");
		else if (cars < people)
			System.out.println("We should not take the cars.");
		else
			System.out.println("We still can\'t decide.");
		
		if(buses > cars)
			System.out.println("That\'s too many buses.");
		else if (buses < cars)
			System.out.println("Maybe we should take buses.");
		else
			System.out.println("We still can\'t decide.");
		
		if(people > buses)
			System.out.println("Alright, let\'s just take the buses.");
		else
			System.out.println("Let\'s just take the cars.");
	}

}
