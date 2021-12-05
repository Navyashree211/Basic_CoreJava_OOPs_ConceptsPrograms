package com.navya;

import java.util.Scanner;

public class Arrays {   
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int m = sc.nextInt();
		int n = sc.nextInt();
		int a[] [] = new int [m][n];
		for (int i =0;i<m;i++)  {
			System.out.println("Enter element of the array ");
			for(int j = 0; j<n;j++)  {
				System.out.println("enter element of the array");
			
			a[i][j] = sc.nextInt(); 
			}
		}
		sc.close();
		System.out.println("printing the element of array ");
		for (int i =0;i<a.length;i++) {
			for (int j = 0 ; j<a.length;j++) {
				System.out.println(a[i][j]);
			}
			System.out.println();
		}
	}

}
