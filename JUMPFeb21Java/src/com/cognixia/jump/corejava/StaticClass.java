package com.cognixia.jump.corejava;

public class StaticClass {
	
	// class attributes
	
	public int number = 7;
	
	// static block
	static {
		System.out.println("This is the static block");
	}
	
	// constructor
	public StaticClass(int number) {
		this.number = number;
		System.out.println("This is the constructor with number:" + number);
	}
	
	// static method
	public static void staticMethod() {
		System.out.println("This is the static method");
	}
	
	// instance method (absence of 'static')
	public void instanceMethod() {
		System.out.println("This is the instnace method");
	}
	
	// anonymous block
	{
		System.out.println("This is the anonymous block number:" + number);
	}

}
