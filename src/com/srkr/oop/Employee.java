package com.srkr.oop;

public class Employee {
	int eId;
	String name;
	long salary;

	Employee(int eId, String name, long salary) {
		this.eId = eId;
		this.name = name;
		this.salary = salary;
	}

	void showEmpProfile() {
		System.out.println("--- Employee Details ---");
		System.out.println("Emp ID : " + eId);
		System.out.println("Emp Name : " + name);
	}
}

class Developer extends Employee {
	long bonus;
	String project;

	public Developer(int eId, String name, long salary, long bonus, String project) {
		super(eId, name, salary);
		this.bonus = bonus;
		this.project = project;
	}

	@Override
	void showEmpProfile() {
		super.showEmpProfile();
		System.out.println("Total Salary : " + (salary + bonus));
		System.out.println("Project : " + project);
	}

}

class InheritanceTest2 {
	public static void main(String[] args) {
		Developer developer = new Developer(122, "John", 2500, 200, "IT Project");

		developer.showEmpProfile();
	}
}
