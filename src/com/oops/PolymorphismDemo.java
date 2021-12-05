package com.oops;

//Example of Compile time Polymorphism
//Overloading 

public class PolymorphismDemo { 
	void sum()  {
		int a= 10 ; int b = 20;
		int c = a + b;
		System.out.println(c);
	}
	void sum(int a, int b) {
		int c= a * b;
		System.out.println(c);
	}
  	void sum(int a,int b,int c)  {
  		int d = a + b + c;
  		System.out.println(d);
  	}
  	void sum(String b ,int a) {
  		String c = b+a;
  		System.out.println(c);
  	}
  	
  	public static void main(String[] args) {
  		PolymorphismDemo obj = new PolymorphismDemo();
  		obj.sum();
  		obj.sum(6,1);
  		obj.sum(3, 6, 4);
  		obj.sum("Navya", 15);

  		
	}

}

	


