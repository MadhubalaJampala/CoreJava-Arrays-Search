package org.perscholas.corejava.arraysandloops2;

public class ReverseWordOrder {

	public static void main(String[] args) {
		 char[] message = { 'c', 'a', 'k', 'e', ' ', 'p', 'o', 'u', 'n', 'd', ' ','s', 't', 'e', 'a', 'l' };
		String[] words = reverseWords(message);
		System.out.println("\n\nThe reverse message is:");
		for (String w : words)
			System.out.print(w + " ");
	}

	public static String[] reverseWords(char[] message) {
		String s = new String(message);
		String[] words = s.split(" ");
		System.out.println("The message is:");
		for(String w:words)
			System.out.print(w+" ");
		if (s.length() > 1) {
			String temp;
			for (int i = 0, j = words.length - 1; i < words.length / 2; i++, j--) {
				temp = words[i];
				words[i] = words[j];
				words[j] = temp;
			}
			return words;
		} else {
			return words;
		}
	}
}
