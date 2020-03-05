package org.perscholas.corejava.collections;

import java.util.Scanner;

public class UniqueChar {

	public static void main(String[] args) {
		/*
		 * Write a method that takes a string and returns the number of unique
		 * characters in the string. It is expected that a string with the same
		 * character sequence may be passed several times to the method. Since the
		 * counting operation can be time-consuming, the method should cache the
		 * results, so that when the method is given a string previously encountered, it
		 * will simply retrieve the stored result. Use collections and maps where
		 * appropriate.
		 */

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a String:");
		String s = scan.next();
		String[] sArray = s.split("");
	
//		for(String x:sArray)
//		System.out.println(x);
		int unique=0;

		for (int i = 0; i < sArray.length; i++,unique=0) {
			for (int j = i + 1; j < sArray.length; j++) {
				//System.out.println(sArray[i]+"  "+sArray[j]);
				if (sArray[i].equals(sArray[j])) {
					unique++;
					break;
					//System.out.println("unique="+unique);
				}
			}
			if(unique==0)
				System.out.println(s.charAt(i));
		}

	}
}