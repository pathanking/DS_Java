package com.srkr.oop.pack1;

public class A {
	private int a = 2;
	public int b = 3;
	protected int c = 4;
	int d = 5;

	public static void main(String[] args) {
		A aObj = new A();
		System.out.println(aObj.a);
		System.out.println(aObj.b);
		System.out.println(aObj.c);
		System.out.println(aObj.d);
	}
	
	private static void foo() {
		System.out.println("foo");
	}
	
	public static void bar() {
		System.out.println("bar");
	}
}