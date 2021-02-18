package com.cognixia.jump.corejava.methods;

public class Canine {
	protected double weight;
	protected String location;
	
	// constructor
	public Canine (double weight, String location) {
		this.weight = weight;
		this.location = location;
	}
	
	public void bark() {
		System.out.println("I am a canine with weight " + this.weight + " in location: "
				+ this.location);
	}
}
