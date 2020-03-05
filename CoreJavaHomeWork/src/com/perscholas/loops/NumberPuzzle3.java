package com.perscholas.loops;

public class NumberPuzzle3 {

	public static void main(String[] args) {
		/*Use nested for loops to find all the three-digit Armstrong numbers. 
		Armstrong numbers are three digit numbers such that the sum of the 
		digits cubed is equal to the number itself.
		 */
		int num=0,numC=0;
		System.out.println("3 digit Armstrong Numbers are:");
		for(int i=1;i<10;i++)
		{
			for(int j=0;j<10;j++)
			{
				for(int k=0;k<10;k++)
				{
					num = 100*i+10*j+k;
					numC = (int)(Math.pow(i,3)+Math.pow(j, 3)+Math.pow(k,3));
					if(num == numC)
						System.out.println(num);
				}
			}
		}
	}

}
