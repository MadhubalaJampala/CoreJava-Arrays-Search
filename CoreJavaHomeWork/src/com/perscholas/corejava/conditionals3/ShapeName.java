package com.perscholas.corejava.conditionals3;

import java.util.Scanner;

public class ShapeName {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		System.out.println("Enter number of sides(3-10):");
		int s = input.nextInt();
		if(s<3 || s>10)
			System.out.println("Please enter number between 3 and 10");
		else
		{
			switch(s)
			{
			case 3:
				System.out.println("Triangle");
				break;
			case 4:
				System.out.println("Quadrilateral");
				break;			
			case 5:
				System.out.println("Pentagon");
				break;
			case 6:
				System.out.println("Hexagon");
				break;				
			case 7:
				System.out.println("Heptagon");
				break;
			case 8:
				System.out.println("Octagon");
				break;
			case 9:
				System.out.println("Nanogon");
				break;
			case 10:
				System.out.println("Decagon");
				break;
			}
		}
	}

}
