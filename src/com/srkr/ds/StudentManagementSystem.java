package com.srkr.ds;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class StudentManagementSystem {
	// in-memory data structure to hold student records
	static ArrayList<Student> students = new ArrayList<>();

	static Scanner scanner = new Scanner(System.in);

	private static class Student { // static inner class
		Integer stdId;
		String name;
		Integer marks;

		Student(Integer stdId, String name, Integer marks) {
			this.stdId = stdId;
			this.name = name;
			this.marks = marks;
		}

		public Integer getStdId() {
			return stdId;
		}

		public String getName() {
			return name;
		}

		public Integer getMarks() {
			return marks;
		}

		public void setName(String name) {
			this.name = name;
		}

		public void setMarks(Integer marks) {
			this.marks = marks;
		}

		@Override
		public String toString() {
			return "Student [stdId=" + stdId + ", name=" + name + ", marks=" + marks + "]";
		}
	}

	static void menu() {
		System.out.println("[1] Add a Student");
		System.out.println("[2] Show a Student");
		System.out.println("[3] Delete a Student");
		System.out.println("[4] Upate a Student");
		System.out.println("[5] Show All Students");
		System.out.println("[6] Show Student With Max Score");
	}

	static Student maxScoreStud() {
		return students
				.stream()
				.sorted(
						Comparator
						.comparing(Student::getMarks)
						.reversed())
				.findAny()
				.get();
	}

	static void addStudent(Student student) {
		students.add(student);
		showStudents();
	}

	static void showStudents() {
		if (students.size() != 0)
			students.stream().forEach(System.out::println);
		else
			System.out.println("No Students Available in Our System...");
	}

	static Student findStudent(Integer studId) {
		return students.stream().filter(st -> st.stdId.equals(studId)).findAny()
				.orElseThrow(() -> new RuntimeException("Student Not Found With ID " + studId));
	}

	static void deleteStudent(Integer studId) {
		Student stud = findStudent(studId);
		students.remove(stud);
		showStudents();
	}

	static void update(Integer studId) {
		Student oldStud = findStudent(studId);
		int index = students.indexOf(oldStud);
		System.out.println("Update Student Name >>>");
		oldStud.setName(scanner.next());
		System.out.println("Update Student Marks >>>");
		oldStud.setMarks(scanner.nextInt());
		students.set(index, oldStud);
		showStudents();
	}

	public static void main(String[] args) {
		boolean flag = false;
		do {
			menu();
			System.out.println("Enter Student Operation [1,2...5]");
			int op = scanner.nextInt();

			switch (op) {
			case 1:
				System.out.println("Enter Student Details for Add Operation >>>");
				System.out.println("Student ID");
				int sid = scanner.nextInt();
				System.out.println("Student Name");
				String sname = scanner.next();
				System.out.println("Student Marks");
				int marks = scanner.nextInt();

				addStudent(new Student(sid, sname, marks));
				break;
			case 2:
				System.out.println("Enter Student ID to Display Her Details");
				Student student = findStudent(scanner.nextInt());
				System.out.println(student);
				break;
			case 3:
				System.out.println("Enter Student ID to Delete Her Record");
				deleteStudent(scanner.nextInt());
				break;
			case 4:
				System.out.println("-------- Enter Student ID to Update Her Details ---------");
				update(scanner.nextInt());
				break;
			case 5:
				showStudents();
				break;

			case 6:
				System.out.println(maxScoreStud());
				break;

			default:
				System.out.println("Invalid Input!");
				System.out.println("Application Will Terminate Now!!");
				System.exit(0);
				break;
			}

			System.out.println("DO YOU WANT TO CONTINUE [YES | NO]");
			String input = scanner.next();
			if (input.equalsIgnoreCase("YES"))
				flag = true;
			else {
				flag = false;
				System.out.println("THANKS FOR USING OUR APPLICATION ^_^");
			}
		} while (flag);
	}
}