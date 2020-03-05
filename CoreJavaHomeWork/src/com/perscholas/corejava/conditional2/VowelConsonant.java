package com.perscholas.corejava.conditional2;

import java.util.Scanner;

public class VowelConsonant {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a character:");
		String s = input.next();
		input.close();
		if(s.length()>1)
			System.out.println("Error.Please enter a character.");
		else
		{
			s=s.toLowerCase();
			char ch = s.charAt(0);
			if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
				System.out.println("VOWEL");
			else if(ch>='a'&&ch<='z')
				System.out.println("CONSONANT");
			else
				System.out.println("Not an Alphabet");
		}
	}

}
