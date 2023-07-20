package com.srkr.oop;

public abstract class Student {
	int stdId;
	String name;

	Student(int stdId, String name) {
		this.stdId = stdId;
		this.name = name;
	}

	abstract void study();
}

class CseStudent extends Student {
	String subject;
	long fee;

	CseStudent(int stdId, String name, String subject, long fee) {
		super(stdId, name);
		this.subject = subject;
		this.fee = fee;
	}

	@Override
	void study() {
		System.out.println(name + " studies " + subject + " Fee : " + fee);
	}
}

class EceStudent extends Student {
	String subject;
	long fee;

	EceStudent(int stdId, String name, String subject, long fee) {
		super(stdId, name);
		this.subject = subject;
		this.fee = fee;
	}

	@Override
	void study() {
		System.out.println(name + " studies " + subject + " Fee : " + fee);
	}
}

class LawStudent extends Student {
	String subject;
	long fee;

	LawStudent(int stdId, String name, String subject, long fee) {
		super(stdId, name);
		this.subject = subject;
		this.fee = fee;
	}

	@Override
	void study() {
		System.out.println(name + " studies " + subject + " Fee : " + fee);
	}
}

class ScienceStudent extends Student {
	String subject;
	long fee;

	ScienceStudent(int stdId, String name, String subject, long fee) {
		super(stdId, name);
		this.subject = subject;
		this.fee = fee;
	}

	@Override
	void study() {
		System.out.println(name + " studies " + subject + " Fee : " + fee);
	}

}