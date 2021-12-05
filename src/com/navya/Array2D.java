package com.navya;

public class Array2D {
	public static void main(String[] args) {
		int a[][] = { { 1, 2, 3 }, { 4, 5 }, { 6, 7, 8 } };
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {      //if number of column is not fixed then it is called Jagged Array.
				System.out.println(" " + a[i][j]);
			}
			System.out.println();
		}
	}
}
  //i -->row
 //j -->column