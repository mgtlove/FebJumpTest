package com.cognixia.jump.corejava.methods;

public class Car {

	int numberOfDoors;
	int numberOfAxels;
	// Composition
	Engine engine;
	
	public Car(int numberOfDoors, int numberOfAxels) {
		this.engine = new Engine();
		this.numberOfDoors = numberOfDoors;
		this.numberOfAxels = numberOfAxels;
	}

	@Override
	public String toString() {
		return "Car [numberOfDoors=" + numberOfDoors + ", numberOfAxels=" + numberOfAxels + ", engine=" + engine + "]";
	}
	
	
	
}
