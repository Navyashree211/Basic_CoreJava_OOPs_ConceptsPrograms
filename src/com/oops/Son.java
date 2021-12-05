package com.oops;

//inheritance

public class Son extends Father { 
	void student() {
		System.out.println("son goes to school");
	}
	public static void main(String[] args) {
		Son s = new Son();
		s.student();
		s.property();
		
		Father f = new Father();
		f.property();
	}
	

}
