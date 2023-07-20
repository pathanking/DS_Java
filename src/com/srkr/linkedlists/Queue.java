package com.srkr.linkedlists;

public class Queue {
	int front; // represents first index element
	int rear; // represents last index element
	int maxSize; // max size of Queue
	String[] arr;
	int currentSize;

	Queue(int maxSize) {
		this.front = 0;
		this.rear = -1;
		this.maxSize = maxSize;
		this.arr = new String[maxSize];
	}

	boolean isFull() {
		if (rear == maxSize - 1) {
			rear = -1;
			if (rear == -1)
				return false;
			return true;
		}
		return false;
	}

	boolean isEmpty() {
		// if (front > rear)
		if (currentSize == 0)
			return true;
		return false;
	}

	boolean enqueue(String data) {
		if (isFull()) {
			return false;
		} else {
			arr[++rear] = data;
			currentSize++;
			return true;
		}
	}

	String dequeue() {
		if (isEmpty()) {
			return "Queue Empty";
		} else {
			String data = arr[front];
			arr[front++] = null;
			currentSize--;
			if (front == maxSize)
				front = 0;
			return data;
		}
	}

	void display() {
		if (isEmpty())
			System.out.println("Queue Empty");

		else {
			System.out.println("----- QUEUE ELEMENTS -----");
			System.out.print("[");
			for (int i = front; i <= rear; i++)
				System.out.print(arr[i] + " ");

			System.out.println("]");
		}
	}
}
