package com.qa.HelloWorldExample;

public class Calculator {
	public static void main(String[] args) {
		int y = 6;
		int x = 5;
		System.out.println(add(5,5));
		System.out.println(add(x,y));
		System.out.println(subtract(x,y));
		System.out.println(subtract(5,5));
		System.out.println(multiply(x,y));
		System.out.println(multiply(5,5));
		System.out.println(divide(x,y));
		System.out.println(divide(5,5));
	}
	
	
	public static int add(int y,int x) {
		return x+y;
	}
	public static int subtract(int y,int x) {
		return x-y;
	}
	public static int multiply(int y,int x) {
		return x*y;
	}
	public static int divide(int y,int x) {
		return x/y;
	}
	
	

}
