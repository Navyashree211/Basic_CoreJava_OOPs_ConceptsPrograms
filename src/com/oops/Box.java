package com.oops;

//Example of Default Constuctor

public class Box {  
	int length = 12;
	int breath = 13;
	void area() {
		int a = length*breath;
		System.out.println(a);
	}
	public static void main(String[] args) {
		Box b = new Box();
		b.area();
	}

}
