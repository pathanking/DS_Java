package com.srkr.student.linkedlist;

import java.util.Scanner;

public class StudentLinkedList {
	static Student head; // refers to first student
	static Student tail; // refers to last student

	static int idCounter = 1;

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int choice;

		do {
			System.out.println("\n*** Student CRUD Operations ***");
			System.out.println("1. Add Student");
			System.out.println("2. View All Students");
			System.out.println("3. Update Student");
			System.out.println("4. Delete Student");
			System.out.println("5. Insert Student");
			System.out.println("6. Exit Application");

			System.out.print("Enter your choice: ");
			choice = scanner.nextInt();

			switch (choice) {
			case 1:
				addStudent(scanner);
				break;
			case 2:
				viewAllStudents();
				break;
			case 3:
				updateStudent(scanner);
				break;
			case 4:
				deleteStudent(scanner);
				break;
			case 5:
				insert(scanner);
				break;
			case 6:
				System.out.println("Exiting the program...");
				break;
			default:
				System.out.println("Invalid choice. Please try again.");
			}
		} while (choice != 6);

		scanner.close();
	}

	static void addStudent(Scanner scanner) {
		scanner.nextLine();
		System.out.print("Enter student name: ");
		String name = scanner.nextLine();

		Student newStudent = new Student(name, idCounter++);

		if (head == null) { // when linkedlist is empty
			head = tail = newStudent;
		} else { // when already some nodes are present
			tail.setNext(newStudent);
			tail = newStudent;
		}
	}

	public void addInBeginning(Scanner scanner) {
		scanner.nextLine();
		System.out.print("Enter student name: ");
		String name = scanner.nextLine();

		Student newStudent = new Student(name, idCounter++);

		if (head == null) { // when linkedlist is empty
			head = tail = newStudent;
		} else {
			newStudent.setNext(head);
			head = newStudent;
		}
	}

	static void updateStudent(Scanner scanner) {
		System.out.print("Enter student ID to update: ");
		int id = scanner.nextInt();

		boolean found = false;
		Student current = head;
		while (current != null) {
			if (current.getId() == id) {
				scanner.nextLine();
				System.out.print("Enter new student name: ");
				String name = scanner.nextLine();
				current.setName(name);
				found = true;
				System.out.println("Student updated successfully!");
				break;
			}
			current = current.getNext();
		}

		if (!found) {
			System.out.println("Student not found with ID: " + id);
		}
	}

	static Student find(Scanner scanner) { // non-static method
		// scanner.nextLine();
		System.out.print("Enter student ID  ");
		int id = scanner.nextInt();
		Student temp = head;
		while (temp != null) {
			if (temp.getId() == id)
				return temp;

			temp = temp.getNext();
		}
		return null;
	}

	static void insert(Scanner scanner) {
		scanner.nextLine();
		System.out.print("Enter student name: ");
		String name = scanner.nextLine();

		Student newStudent = new Student(name, idCounter++);

		if (head == null) { // If linked list is empty
			head = tail = newStudent;
		} else {
			Student stdBefore = find(scanner);
			if (stdBefore != null) {
				newStudent.setNext(stdBefore.getNext()); // 1
				stdBefore.setNext(newStudent); // 2
				if (stdBefore == tail)
					tail = newStudent;
			} else {
				System.out.println(newStudent.getId() + " Student Not Found!!");
			}
		}
	}

	static void viewAllStudents() {
		Student temp = head;
		while (temp != null) {
			System.out.print(temp + "->");
			temp = temp.getNext();
		}
	}

	static void deleteStudent(Scanner scanner) {
		if (head == null)
			System.out.println("List is empty");
		else {
			System.out.println("Find Student to Delete It");
			Student student = find(scanner);
			if (student == null)
				System.out.println("Node not found");
			else if (student == head) {
				head = head.getNext();
				student.setNext(null);
				// If the node to be deleted is also the tail node
				if (student == tail)
					tail = null;
			} else { // Traverse to the STD present before the STD to be deleted
				Student stdBefore = null;
				Student temp = head;
				while (temp != null) {
					if (temp.getNext() == student) {
						stdBefore = temp;
						break;
					}
					temp = temp.getNext();
				} // Remove the node
				stdBefore.setNext(student.getNext());
				if (student == tail)
					tail = stdBefore;

				student.setNext(null);
			}
		}
	}

}