package com.oops;

// Example of runTime Polymorphism
//overriding

class Shape  {
	void area()  {
		System.out.println("Print Area of Shape");
	}
	
}

class Square extends Shape{ 
	@Override 
	void area()  {
		System.out.println("It is area of Square");
	}
}
class Circle extends Square {
	@Override
	void area() {
		System.out.println("It is area of Circle");
	}
}
public class PolymorphismTest extends Circle {  
	public static void main(String[] args) {
		
		PolymorphismTest p = new PolymorphismTest();
		p.area();
		Shape s;     //casting
		s=new Square();
		s.area();
		
		s=new Shape();
		s.area();
		
		
	
		
	
	}

}
