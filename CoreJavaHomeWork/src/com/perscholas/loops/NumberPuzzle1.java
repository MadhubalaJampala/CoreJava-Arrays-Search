package com.perscholas.loops;

public class NumberPuzzle1 {

	public static void main(String[] args) {
		/*Use nested for loops to generate a list of all the pairs of 
		 * positive two digit numbers whose sum is 60, and whose difference
		 *  is 14.
		 */
		for(int i= 10;i<100;i++)
		{
			for(int j=i+1;j<100;j++)
			{
				if(i+j == 60 && j-i ==14)
					System.out.println("Pair: "+i+" "+j);
			}
		}
	}

}
