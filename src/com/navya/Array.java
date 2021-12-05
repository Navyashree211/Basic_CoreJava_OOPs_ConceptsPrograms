package com.navya;

import java.util.Scanner;

//How to create an array in java by taking input from console.

public class Array {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of the array");
		int size = sc.nextInt();
		int a[] = new int [size];
		for (int i=0;i<size;i++)  {
			System.out.println("Enter the elements");
			a[i] = sc.nextInt();
		}
		sc.close();
		System.out.println("Printing the elements in an array");
		for(int i=0;i<a.length;i++)  {
			System.out.println(a[i]);
		}

	}
}
