package org.perscholas.corejava.arraysandloops1;

import java.util.Scanner;

public class CommaSeparatedValues {

	public static void main(String[] args) {
		/*2. Comma separated values
			Ask the user to input multiple words seperated by commas (,)
			Put those words into a String array, and print out that String 
			array for the user to see.
		 */
		Scanner input = new Scanner(System.in);
		System.out.println("Enter words separated by commas.");
		String s= input.nextLine();
		input.close();
		String words[]= s.split(",");		
		for(String s1:words)
			System.out.println(s1);

	}

}
