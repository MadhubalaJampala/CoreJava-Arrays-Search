package org.persholas.arrays;

import java.util.Scanner;

public class BinarySearch {

	public static void main(String[] args) {
		int arr[] = { 1, 3, 5, 8, 10, 13, 20, 21, 22, 23 };
		Scanner input = new Scanner(System.in);
		System.out.println("enter a number to search:");
		int key = input.nextInt();

		int first = 0, last = arr.length-1;
		 int mid = (first + last)/2;  
		   while( first <= last ){  
		      if ( arr[mid] < key ){  
		        first = mid + 1;     
		      }else if ( arr[mid] == key ){  
		        System.out.println("Element is found at index: " + mid);  
		        break;  
		      }else{  
		         last = mid - 1;  
		      }  
		      mid = (first + last)/2;  
		   }  
		   if ( first > last ){  
		      System.out.println("Element is not found!");  
		   }  
	}

}
