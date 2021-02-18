package com.cognixia.jump.corejava.methods;

public class Engine {

	String engineClass;
	double size;
	int valves;
	
	public Engine(){
		this.engineClass = "V8";
		this.size = 5.0;
		valves = 8;
	}
	
	@Override
	public String toString() {
		return this.engineClass + " " + this.size + " " + this.valves;
	}
	
	
}
