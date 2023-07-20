package com.srkr.linkedlists;

class Book {
	int bId;
	String author;

	Book(int bId, String author) {
		this.bId = bId;
		this.author = author;
	}

	@Override
	public String toString() {
		return "Book [bId=" + bId + ", author=" + author + "]";
	}
}

public class Stack {
	Book[] books;
	int capacity;
	int top;

	Stack(int size) {
		books = new Book[size];
		capacity = size;
		top = -1;
	}

	boolean isFull() {
		return top == capacity - 1;
	}

	boolean isEmpty() {
		return top == -1;
	}

	int size() {
		return top + 1;
	}

	void push(Book book) {
		if (!isFull()) {
			System.out.println("Inserting Element " + book);
			books[++top] = book;
		} else
			System.err.println("Stack Overflow!!");
	}

	Book pop() {
		Book removeBook = null;
		if (!isEmpty())
			removeBook = books[top--];
		else
			System.err.println("Stack Empty!!");
		return removeBook;
	}

	Book peek() {
		Book topBook = null;
		if (!isEmpty())
			topBook = books[top];
		else
			System.out.println("Stack Empty!");

		return topBook;
	}

	void printStack() {
		if (isEmpty())
			System.err.println("Stack Empty");
		else
			for (int i = top; i >= 0; i--)
				System.out.println(books[i]);
	}

	public static void main(String[] args) {
		Stack stack = new Stack(5);
		stack.push(new Book(112, "Three Idiots"));
		stack.push(new Book(115, "Wings of Fire"));
		stack.push(new Book(225, "At Midnight"));

		System.out.println("--- AFTER INSERTING ---");
		stack.printStack();

		System.out.println("Top Element : " + stack.peek());
		System.out.println("Size of Stack : " + stack.size());

		/*
		 * System.out.println("--- AFTER DELETING ---"); stack.pop();
		 * 
		 * stack.printStack(); System.out.println("Top Element : " + stack.peek());
		 * System.out.println("Size of Stack : " + stack.size());
		 */
	}
}