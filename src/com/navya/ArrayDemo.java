package com.navya;

//1.>make array
//2.>initialize value of array
//3.>Display of array

public class ArrayDemo {   
	public static void main(String[] args) {
		int a[] = new int [5];  
		a[0] = 1;
		a[1] = 2;
		a[2] = 3;
		a[3] = 4;
		a[4] = 5;
		for (int i = 0; i<a.length;i++)  {
			System.out.println(a[i]);
		}
		
	}

}

