package com.srkr.oop.pack1;

public class B {

	public static void main(String[] args) {
		A aObj = new A();
		// System.out.println(aObj.a);
		System.out.println(aObj.b);
		System.out.println(aObj.c);
		System.out.println(aObj.d);

		A.bar();
		// A.foo();
	}
}
//The field A.a is not visible
//The method foo() from the type A is not visible