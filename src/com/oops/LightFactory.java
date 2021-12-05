package com.oops;

import java.util.Scanner;

interface Iswitch {
	abstract void switchOn();

	void switchOff();
}

class LedLight implements Iswitch {
	@Override
	public void switchOn() {
		System.out.println("Led Light On");
	}

	@Override
	public void switchOff() {
		System.out.println("Led Light Off");
	}
}

class TubeLight implements Iswitch {
	@Override
	public void switchOn() {
		System.out.println("Tube Light On");
	}

	@Override
	public void switchOff() {
		System.out.println("Tube Light Off");
	}
}

public class LightFactory {
	public static Iswitch getLight(String type) {
		if (type.equalsIgnoreCase("TubeLight")) {

			return new TubeLight();
		} else if (type.equalsIgnoreCase("LedLight")) {
			return new LedLight();
		} else {
			return null;
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the light type");
		String LightType = sc.nextLine();
//		Iswitch sw = LightFactory.getLight + (LightType);
		Iswitch sw = LightFactory.getLight(LightType);

		if (sw != null) {
			sw.switchOn();
			sw.switchOff();
		}
	}
}
