package com.srkr.arrays;

public class ArrayTest {

	public static void insert(char[] ch, int pos, char c) {
		for (int i = ch.length - 1; i >= pos; i--)
			ch[i] = ch[i - 1];

		ch[pos - 1] = c;
	}

	public static void delete(char[] ch, int pos) {
		for (int i = pos - 1; i < ch.length - 1; i++)
			ch[i] = ch[i + 1];

		ch[ch.length - 1] = '0';
	}

	public static void main(String[] args) {
		char[] chars = new char[6];

		chars[0] = 'A';
		chars[1] = 'B';
		chars[2] = 'C';
		chars[3] = 'D';
		chars[4] = 'E';

		insert(chars, 4, 'J');
		System.err.println("--- AFTER INSERTING AN ELEMENT ---");
		for (char c : chars) {
			System.out.println(c);
		}

		delete(chars, 2);
		System.err.println("--- AFTER DELETING AN ELEMENT ---");
		for (char c : chars) {
			System.out.println(c);
		}
	}
}