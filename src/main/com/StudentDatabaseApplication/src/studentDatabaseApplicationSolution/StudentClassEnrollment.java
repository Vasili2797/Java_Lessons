package main.com.StudentDatabaseApplication.src.studentDatabaseApplicationSolution;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentClassEnrollment {
	private String courses;
	private int tuitionBalance;
	private int costOfCourse = 600;

	// Enroll in courses
	Scanner scanner = new Scanner(System.in);
	ArrayList<String> coursesRegistered = new ArrayList<>();

	public void enrollInCourses() {

		System.out.println("Thank you for deciding to register to our curriculum. "
				+ "Please write down the list of courses you wish to take: ");
		System.out.println("Please Write 0 when finished:");
		boolean isOn = true;

		while (isOn) {
			String courseEnrollment = scanner.nextLine();
			coursesRegistered.add(courseEnrollment);

			if (courseEnrollment.equals("0")) {
				isOn = false;
				break;
			}
		}
		int index = coursesRegistered.size() - 1;
		coursesRegistered.remove(index);
		RegistrationStatus();
		showBalance();
	}

	// Show status
	// It will show current registration status, which will always be registered
	public void RegistrationStatus() {
		if (coursesRegistered.size() >= 1) {
			System.out.println("You are currently registered in these classrooms:");
			System.out.println(coursesRegistered);
		}
	}
	// View balance
	/*
	 * For Each registered course, I will add a certain amount to the total, which
	 * is originally 0, and show the amount
	 */
	public void showBalance(){
		System.out.println("Each newly registered course costs "+costOfCourse+".");
		tuitionBalance=costOfCourse*coursesRegistered.size();
		System.out.println("The current outstanding balance is: "+tuitionBalance);
	}
}
