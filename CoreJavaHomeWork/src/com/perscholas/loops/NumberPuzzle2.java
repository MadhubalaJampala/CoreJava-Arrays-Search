package com.perscholas.loops;

public class NumberPuzzle2 {

	public static void main(String[] args) {
		/*Use nested for loops to generate a list of all the two digit numbers
		 *  which are less than or equal to fifty-six, and the sum of whose
		 *   digits is greater than ten.
		 */
		int num=0;
		for(int i= 1;i<=5;i++)
		{
			for(int j=0;j<=9;j++)
			{	num=i*10+j;
				if(i+j >10 && num <=56)
					System.out.println(i*10+j);
			}
		}
	}

}
