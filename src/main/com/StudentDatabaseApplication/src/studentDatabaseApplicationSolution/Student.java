package main.com.StudentDatabaseApplication.src.studentDatabaseApplicationSolution;

import java.util.Scanner;

public class Student {

	private String firstName;
	private String lastName;
	private static String gradeYear;
	private int studentID;
	private String courses;
	private int tuitionBalance;
	private int costOfCourse = 600;

	// Constructor: prompt user to enter student's name and year
	public Student() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter student first name: ");
		this.firstName = scanner.nextLine();
		System.out.println("Enter student last name: ");
		this.lastName = scanner.nextLine();

		System.out.println("1 - Freshmen\n2 - Sophomore\n3 - Junior\n4 - Senior\nEnter student class level:");
		Student.gradeYear = scanner.nextLine();

		System.out.println(firstName + " " + lastName + " " + studentGradeYear(Student.gradeYear));
		System.out.println("Your new studentID is:\n" + Student.gradeYear + generateID().toString());
	}

	public String studentGradeYear(String number) {
		String studentGrade = null;
		if (Student.gradeYear.equals("1")) {
			studentGrade = "Freshmen";
		} else if (Student.gradeYear.equals("2")) {
			studentGrade = "Sophomore";
		} else if (Student.gradeYear.equals("3")) {
			studentGrade = "Junior";
		} else if (Student.gradeYear.equals("4")) {
			studentGrade = "Senior";
		}
		return studentGrade;
	}

	// Generate an ID
	private static String generateID() {
		String IDCharacters = "1234567890";
		char[] IDChar = new char[4];
		for (int i = 0; i < 4; i++) {
			int rand = (int) (Math.random() * 4);
			IDChar[i] = IDCharacters.charAt(rand);
		}
		return new String(IDChar);
	}

	// Enroll in courses

	// View balance

	// Pay tuition

	// Show status
}
