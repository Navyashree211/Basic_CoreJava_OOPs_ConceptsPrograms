package com.navya;

//2D array using Enhance for loop  

public class ArrayTwoD {  
	public static void main(String[] args) {
		int a [] [] = { {2,4,6}, {1,3,7}, {5,7,9} };
		
		System.out.println("length of array :" + a.length);
		
		for (int k[] : a)
		{
			for (int l :k) {
				System.out.println(" " + l);
			}
			System.out.println();   //this line are use to new line statement .
		}
	}

}
