package com.srkr.linkedlists;

public class LinkedList {
	private Node head;
	private Node tail;

	public void addAtEnd(String data) {
		Node node = new Node(data);

		if (head == null) {
			this.head = this.tail = node;
		} else {
			this.tail.setNext(node);
			this.tail = node;
		}
	}

	public void display() {
		Node temp;
		temp = head;
		while (temp != null) {
			System.out.print(temp.getData() + "  ==>  ");
			temp = temp.getNext();
		}
		System.out.println();
	}

	public void addInBeginning(String data) {
		Node node = new Node(data);
		if (head == null) {
			this.head = this.tail = node;
		} else {
			node.setNext(this.head);
			this.head = node;
		}
	}

	public Node find(String data) {
		Node temp;
		temp = head;

		while (temp != null) {
			if (temp.getData().equals(data))
				return temp;

			temp = temp.getNext();
		}
		return null;
	}

	public void insert(String data, String dataBefore) {
		Node node = new Node(data); // data = "MM"
		if (head == null) {
			this.head = this.tail = node;
		} else {
			Node nodeBefore = find(dataBefore);

			if (nodeBefore != null) {
				node.setNext(nodeBefore.getNext());
				nodeBefore.setNext(node);

				if (nodeBefore == this.tail) {
					this.tail = node;
				}
			} else {
				System.out.println("Node Was Not Found!!");
			}
		}
	}

	
	
	public static void main(String[] args) {
		LinkedList list = new LinkedList();
		list.addAtEnd("A");
		list.addAtEnd("B");
		list.addAtEnd("C");
		list.addAtEnd("D");
		list.addInBeginning("X");
		list.addInBeginning("Y");
		list.insert("MM", "D"); // insert "MM" after "C"

		list.display();
		Node result = list.find("D");
		if (result != null)
			System.out.println("Element Found " + result.getData());

		else
			System.out.println("Element was not found!!");
	}
}
