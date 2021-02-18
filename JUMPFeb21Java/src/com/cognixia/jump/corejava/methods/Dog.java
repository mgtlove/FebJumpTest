package com.cognixia.jump.corejava.methods;

public class Dog extends Canine {
	
	String breed;

	public Dog(double weight, String location, String breed) {
		super(weight, location);
		this.breed = breed;
	}
	
	// Method Override (keep signature the same, must have inherritence, changing code inside
	// the {}) - runtime polymorphism.
	//@Override
	public void bark(String sound) {
		System.out.println("I am a dog with weight " + this.weight + " in location: "
				+ this.location + " and breed: " + this.breed);
	}
	
	// Method overloading - using the same method name, but changing other aspects of the 
	// the method signature - DOES NOT have to have inherritance.
	// Compile time polymorphism
	public String bark(String sound, int volume) {
		return sound + " at volume " + volume + this.weight + " " + this.location 
				+ " " + this.breed;
	}
	
	public void bark(String sound, int volume, int time) {
		System.out.println("overloaded method example " + time);
	}
	
}
