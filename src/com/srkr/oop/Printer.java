package com.srkr.oop;

public interface Printer {
	public static final int x = 2;

	void print();
	
	default void foo() {
		System.out.println("foo");
	}
	
	static void bar() {
		System.out.println("bar");
	}
}
//Interfaces cannot have constructors