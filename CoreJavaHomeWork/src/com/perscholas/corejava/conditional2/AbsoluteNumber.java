package com.perscholas.corejava.conditional2;

import java.util.Scanner;

public class AbsoluteNumber {

	public static void main(String[] args) {
		
		 /*Write a Java program that reads a double (number with decimal 
		  * places) and prints "zero" if the number is zero. Otherwise, 
		  * print "positive" or "negative". Add "small" if the absolute 
		  * value of the number is less than 1, or "large" if it exceeds
		  *  1,000,000 */
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a number:");
		double num = input.nextDouble();
		input.close();
		if(num==0)
			System.out.println("Zero");
		else if(num > 0)
			System.out.println("Positive Number");
		else if(num < 0)
			System.out.println("Negative Number");
		
		if(Math.abs(num)<1)
			System.out.println("Small");
		else if(Math.abs(num)>1000000)
			System.out.println("Large");
	}
}
