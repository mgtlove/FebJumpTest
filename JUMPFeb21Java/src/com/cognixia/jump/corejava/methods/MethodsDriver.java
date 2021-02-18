package com.cognixia.jump.corejava.methods;

public class MethodsDriver {

	public static void main(String[] args) {
		
		// make a canine and see the effect of .bark()
		Canine canine = new Canine(20.0, "US");
		
		// use the default canine bark
		canine.bark();
		
		// make a dog object that uses bark as well
		Dog dog = new Dog(15.0, "Europe", "Lab");
		dog.bark();
		
		dog.bark();
		System.out.println(dog.bark("woof", 5));
		dog.bark("bark", 5, 10);
		
		//Composition and Inherritence with Car and Engine
		Car car = new Car(4, 2);
		
		System.out.println(car);

	}

}
