package com.srkr.oop;

public class Demo {
	int x; // instance or non-static field
	boolean flag;

	Demo(int x, boolean flag) {
		this.x = x;
		this.flag = flag;
	}

	void print() { // instance or non-static method
		int x = 5;
		System.out.println(this.x);
		System.out.println(this.flag);
	}

	public static void main(String[] args) {
		Demo demo = new Demo(5, true);
		demo.print();
	}
}