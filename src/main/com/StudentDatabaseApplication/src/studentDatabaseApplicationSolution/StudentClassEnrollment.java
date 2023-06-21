package studentDatabaseApplicationSolution;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentClassEnrollment {

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

		// Show status
		// It will show current registration status, which will always be registered
		if (coursesRegistered.size() >= 1) {
			System.out.println("YOu are currently registered in these classrooms:");
			System.out.println(coursesRegistered);
		}
	}
}
