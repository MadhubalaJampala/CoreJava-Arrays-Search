package org.persholas.arrays;

import java.util.Scanner;

public class LinearSearch {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("How many numbers would you like to enter?");
		int size= input.nextInt();
		int[] arr = new int[size];
		for(int i=0;i<size;i++) {
			System.out.println("Enter number"+(i+1)+":");
			arr[i]=input.nextInt();
		}
		System.out.println("The numbers you entered are:");
		for(int x:arr) {
			System.out.print(x);
			System.out.print(", ");
		}
		System.out.println("\nEnter a number to search:");
		int num = input.nextInt();
		input.close();
		int i;
		for(i=0;i<arr.length;i++) {
			if(num==arr[i]) {
				System.out.println("Number found at location "+(i+1));
				break;
			}		
		}
		if(i==arr.length)
			System.out.println("Number not found.");
	}

}
