package com.oops;

//multi Inheritance 

class Dog extends Animal  {
	void bark() {
		System.out.println("Dog bark");
	}
}

public class BabyDog extends Dog {
	void weep() {
		System.out.println("Baby is weep");
	}
	public static void main(String[] args) {
		
		BabyDog bd = new BabyDog();
		bd.eat();
		bd.bark();
		bd.weep();
		
		Dog d = new Dog();
		d.eat();
		d.bark();
		
		Animal a = new Animal();
		a.eat();
		
	}

}
