package com.srkr.oop;

import java.util.Scanner;

public class StudentTest {

	public static void main(String[] args) {
		Student student;

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter Type of Student [CSE | ECE | LAW | SCIENCE]");
		String input = scanner.next();

		student = switch (input) {
		case "CSE", "cse", "Cse" -> new CseStudent(112, "John", "Computers", 45000L);

		case "ECE", "ece", "Ece" -> new EceStudent(223, "Bob", "Electronics", 35000L);

		case "LAW", "law", "Law" -> new LawStudent(334, "Lisa", "Laws", 65000L);

		case "Science", "science", "SCIENCE" -> new ScienceStudent(445, "Sai", "Science", 25000L);

		default -> throw new IllegalArgumentException("Unexpected value: " + input);
		};

		student.study();
	}
}
