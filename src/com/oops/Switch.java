package com.oops;

//abstraction 

public  class Switch extends Light 
{

	@Override
  void turnOn() {
		System.out.println("Light is On");
		
	}

	@Override
	 void turnOFF() {
		System.out.println("Light is OFf");
		
	}
	public static void main(String [] args)  {
		Switch s = new Switch();
		s.turnOn();
		s.turnOFF();
	}

}
