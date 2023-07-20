package com.srkr.oop;

public class A {
	int a = 10;

	A(int a) {
		this.a = a;
	}
}

class B extends A {
	int b;

	B(int a, int b) {
		super(a);
		this.b = b;
	}

	void print() {
		System.out.println(a);
		System.out.println(b);
	}
}

class Test {
	public static void main(String[] args) {
		B obj = new B(10, 100);
		obj.print();
	}
}