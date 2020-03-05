package com.perscholas.corejava.conditional2;

import java.util.Scanner;

public class GreatestNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Enter 3 numbers:");
		int num1 = input.nextInt();
		int num2 = input.nextInt();
		int num3 = input.nextInt();
		
		if(num1>num2 && num1>num3)
			System.out.println(num1+" is greatest number.");
		else if(num2>num3)
			System.out.println(num2 + " is the greatest number.");
		else
			System.out.println(num3 + " is the greatest number");
		
	}

}
