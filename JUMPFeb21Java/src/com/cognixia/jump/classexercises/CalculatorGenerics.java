package com.cognixia.jump.classexercises;

public class CalculatorGenerics {

	public static void main(String[] args) {
		
		System.out.println(sum("Matthew", 2,4,50));
		
		System.out.println(difference(5, 3));
		
		System.out.println("---------");
		
		System.out.println(product(3,4,6, 8.0));

	}
	
	public static int sum(String name, int... inputs) {
		
		int sum = 0;
		
		for (int x : inputs) {
			sum+=x;
		}
		System.out.println(name);
		return sum;
	}
	
	public static <T extends Number> Double difference(T a, T b) {
		
		Double difference = a.doubleValue() - b.doubleValue();
		return difference;
		
	}
	
	public static <T extends Number> Double product(T... inputs) {
		
		Double product = 1.0;
		for ( T input : inputs) {
			product *= input.doubleValue();
		}
		
		return product;
	}

}
