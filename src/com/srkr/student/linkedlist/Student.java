package com.srkr.student.linkedlist;

public class Student {
	private String name;
	private int id;
	private Student next;

	public Student(String name, int id) {
		this.name = name;
		this.id = id;
		this.next = null;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Student getNext() {
		return next;
	}

	public void setNext(Student next) {
		this.next = next;
	}

	@Override
	public String toString() {
		return "["+ id + " : " + name + "]";
	}
}