package main.com.StudentDatabaseApplication.src.studentDatabaseApplicationSolution;

import java.util.Scanner;

public class Student {
	private String firstName;
	private String lastName;
	private static String gradeYear;
	private String studentID;
	Scanner scanner = new Scanner(System.in);

	// Constructor: prompt user to enter student's name and year
	public Student() {
		System.out.println("Enter student first name: ");
		this.firstName = scanner.nextLine();
		System.out.println("Enter student last name: ");
		this.lastName = scanner.nextLine();

		System.out.println("1 - Freshmen\n2 - Sophomore\n3 - Junior\n4 - Senior\nEnter student class level:");
		Student.gradeYear = scanner.nextLine();

		System.out.println(firstName + " " + lastName + " " + studentGradeYear(Student.gradeYear));
		studentID=Student.gradeYear + generateID().toString();
		System.out.println("Your new studentID is:\n" + studentID);
		StudentClassEnrollment enrollment = new StudentClassEnrollment();
		enrollment.enrollInCourses();
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
}

