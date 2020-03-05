package org.perscholas.corejava.arraysandloops1;

import java.util.Scanner;

public class HalvingMachine {

	public static void main(String[] args) {
		/*1. The Halving Machine

		Create a loop that will take an integer from user input.
		If the integer is odd, add 1 and then divide that by 2 and 
		print the new number.
		If the integer is even, just divide by 2 and print the new number.
		Continue doing this until you reach 1.
		 */
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a number:");
		int num = input.nextInt();
		input.close();
		while(num>1) {
			if(num%2 == 0) {
				num/=2;
				System.out.println(num);
			}
			else {
				num = (num+1)/2;
				System.out.println(num);
			}
			
			
			
			
			
			
		}
	}

}
