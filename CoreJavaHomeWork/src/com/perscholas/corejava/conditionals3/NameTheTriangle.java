package com.perscholas.corejava.conditionals3;

import java.util.Scanner;

public class NameTheTriangle {

	public static void main(String[] args) {
		/*Write a program that reads the lengths of 3 sides of a triangle 
		 * from the user.Display a message indicating the type of the 
		 * triangle.
		 * All sides are equal = Equilateral Triangle
		 * 2 Sides are equal = Isosceles Triangle
		 * No sides are equal = Scalene  */

		Scanner input = new Scanner(System.in);
		System.out.println("Enter the length of first side of a triangle:");
		int side1 = input.nextInt();
		System.out.println("Enter the length of second side of a triangle:");
		int side2 = input.nextInt();
		System.out.println("Enter the length of third side of a triangle:");
		int side3 = input.nextInt();
		input.close();
		if(side1==side2 && side2==side3)
			System.out.println("Equilateral Triangle");
		else if(side1==side2 || side1==side3 || side2==side3)
			System.out.println("Isosceles Triangle");
		else
			System.out.println("Scalene Triangle");
		
	}

}
