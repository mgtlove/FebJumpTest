package com.cognixia.jump.corejava;


// A quick example in the order of execution of constructors, static blocks
// and methods, and a anonymous block
public class StaticExampleDriver {

	public static void main(String[] args) {
		
		// make a object
		StaticClass sc1 = new StaticClass(5);
//		
//		// make another object
//		StaticClass sc2 = new StaticClass(3);
//		
//		// make object
//		StaticClass sc3 = new StaticClass(1);
		
		// Call the static Method
		//StaticClass.staticMethod();
		
		// for at home: comment out all the object creation and just run
		// static method
		
		// call instance method - uncomment one of the objects
		
		sc1.instanceMethod();

	}

}
