package com.navya;

public class TwoDArray {   
	public static void main(String[] args) {
		int a [][] = {{1,2,3},{3,5,6},{4,6,8}};
		 System.out.println("length of array :" +a.length);
		 
		 for (int i=0;i<a.length;i++)  {
			 for(int j = 0; j<a.length;j++)  {
				 System.out.println( " " + a[i][j]);
			 }
		 System.out.println();    // it is used for new line statement.
		 }
		 
	}

}
