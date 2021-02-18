package com.cognixia.jump.classexercises;

public class StringExercise {

	public static void main(String[] args) {
		
		String test1 = "This is an example to run.";
		
		System.out.println(reverseMethod(test1));
		System.out.println(reverseWords(test1));	

	}
	
	public static String reverseMethod(String str) {
		StringBuilder sb = new StringBuilder(str);
		return sb.reverse().toString();
	}
	
	public static String reverseWords(String str) {
		String[] strArr = str.split(" ");
		String retStr = "";
		for(String s : strArr) {
			retStr += reverseMethod(s) + " ";
		}
		return retStr.strip();
	}

}
