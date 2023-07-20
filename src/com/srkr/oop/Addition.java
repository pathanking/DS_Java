package com.srkr.oop;

public class Addition {

	static void sum(int x, int y) {
		System.out.println("sum(int x, int y) : " + (x + y));
	}

	static void sum(byte x, byte y) {
		System.out.println("sum(byte x, byte y) : " + (x + y));
	}

	static void sum(short x, short y) {
		System.out.println("sum(short x, short y) : " + (x + y));
	}

	static void sum(long x, long y) {
		System.out.println("sum(long x, long y) : " + (x + y));
	}

	static void sum(double d, double e) {
		System.out.println("sum(double x, double y) : " + (d + e));
	}

	public static void main(String[] args) {
		sum(2.8, 5.5);
	}
}