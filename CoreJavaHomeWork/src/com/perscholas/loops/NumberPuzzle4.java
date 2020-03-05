package com.perscholas.loops;

public class NumberPuzzle4 {

	public static void main(String[] args) {
		/*USse nested for loops to find four positive integers whose sum is
		45, and such that the first plus 2, the second minus 2, the third
	 	multiplied by 2, and the fourth divided by 2 are all equal.
		For those of you having trouble with the English on this one 
		(I've noticed that students really don't like word problems), 
		here's what that means.
		-The output of your program should be four numbers. They won't be 
		negative numbers.
		-When you add the four numbers, they add up to 45.
		-If you add 2 to the first number, you get the same answer as if 
		you had subtracted 2 from the second number.
		-If you multiply the third number by two, you also get the same answer.
		-If you divide the fourth number by two, you also get the same answer.
		-The following mathematical statements are also true about these numbers:
		A+2 = B-2 = C*2 = D/2
		and
		A + B + C + D = 45 
		 */
		
		for(int i=0;i<50;i++)
		{
			for(int j=0;j<50;j++)
			{
				for(int k=0;k<50;k++)
				{
					for(int l=0;l<50;l++)
					{
						if(i+j+k+l == 45)
						{
							if((i+2 == j-2) && (j-2 == k*2)&&(j-2 == l/2))
								System.out.printf("%d %d %d %d\n",i,j,k,l);
						}
					}
				}
			}
		}
	}

}
