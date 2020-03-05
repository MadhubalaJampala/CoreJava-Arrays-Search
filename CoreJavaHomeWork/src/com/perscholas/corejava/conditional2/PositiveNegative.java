package com.perscholas.corejava.conditional2;

import java.util.Scanner;

public class PositiveNegative {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Enter an integer:");
		double n = input.nextDouble();
		input.close();
		if(n>0)
			System.out.println("Number is positive.");
		else if(n<0)
			System.out.println("Number is negative");
		else
			System.out.println("Number is Zero");			
	}
}
