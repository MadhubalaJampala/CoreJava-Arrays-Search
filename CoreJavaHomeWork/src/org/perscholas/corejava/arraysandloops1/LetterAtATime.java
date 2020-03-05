package org.perscholas.corejava.arraysandloops1;

import java.util.Scanner;

public class LetterAtATime {

	public static void main(String[] args) {
		Scanner input= new Scanner(System.in);
		System.out.println("Enter a message:");
		String message = input.nextLine();
		input.close();
		System.out.println("Here are all the characters,one at a time:");
		for(int i=0;i<message.length();i++)
			System.out.println(i+": '"+message.charAt(i)+"'");
	}

}
