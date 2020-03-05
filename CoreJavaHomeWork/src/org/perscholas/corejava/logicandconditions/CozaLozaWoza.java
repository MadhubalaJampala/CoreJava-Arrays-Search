package org.perscholas.corejava.logicandconditions;

public class CozaLozaWoza {

	public static void main(String[] args) {
		boolean b=false;
		for(int i=1;i<101;i++) {
			if(i%10 ==0)
				System.out.println();
			if(i%3==0) {
				System.out.print("coza");
				b=true;
			}
			if(i%5==0) {
				System.out.print("loza");
				b=true;
			}
			if(i%7==0) {
				System.out.print("woza");
				b=true;
			}
			if(!b) 
				System.out.print(" "+i+"  ");
			b=false;
			System.out.print("  ");
//			}
		}
	}

}
