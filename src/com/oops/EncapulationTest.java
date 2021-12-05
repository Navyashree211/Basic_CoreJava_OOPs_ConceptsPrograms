package com.oops;

public class EncapulationTest {  
	private int i;
	private int j;
	public int getI() {
		return i;
	}
	public void setI(int i) {
		this.i = i;
	}
	public int getJ() {
		return j;
	}
	public void setJ(int j) {
		this.j = j;
	}
	
	public static void main(String[] args) {
		EncapulationTest e = new EncapulationTest();
		e.setI(8);
		e.setJ(6);
		System.out.println(" Print the value of i :" + e.getI());
		System.out.println(" Print the value of j :" + e.getJ());
	}

}
