package com.oops;

public class Boxs {  
	int l;
	int b;
	 public Boxs(int l , int b) {
		 this.b = b;
		 this.l = l;
		 int k = this.l*this.b;
		 System.out.println(k);
	 }
	 public Boxs() {
		 System.out.println("This is custom Constructor");
	 }
	 public static void main(String[] args) {
		Boxs b = new Boxs(1,6);
		Boxs box = new Boxs();
	}

}
