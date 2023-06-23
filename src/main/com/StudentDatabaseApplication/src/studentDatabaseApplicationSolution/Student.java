package main.com.StudentDatabaseApplication.src.studentDatabaseApplicationSolution;

import java.awt.*;
import java.io.*;
import java.net.URI;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.Scanner;

public class Student {
	private String firstName;
	private String lastName;
	private static String gradeYear;
	private String studentID;
	Scanner scanner = new Scanner(System.in);
	Student student;

	// Constructor: prompt user to enter student's name and year
	public Student() throws IOException {
		BufferedReader consoleReader = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter student first name: ");
		this.firstName = consoleReader.readLine();
		System.out.println("Enter student last name: ");
		this.lastName = consoleReader.readLine();

		System.out.println("1 - Freshmen\n2 - Sophomore\n3 - Junior\n4 - Senior\nEnter student class level:");
		Student.gradeYear = consoleReader.readLine();
		registerStudent(consoleReader);
	}

	private void registerStudent(BufferedReader consoleReader) throws IOException{
		System.out.println(firstName + " " + lastName + " " + studentGradeYear(Student.gradeYear));
		studentID=Student.gradeYear + generateID().toString();
		System.out.println("Your new studentID is:\n" + studentID);
		String allTheInformation="First Name:"+firstName+"\nLast Name: "+lastName+"\nGrade Level: "
				+gradeYear+"\nStudent ID: "+studentID+"\n";

		File fileOfNewRegistrar = new File("..\\Programming\\Java_Lessons\\src\\main\\com\\" +
				"StudentDatabaseApplication\\src\\studentDatabaseApplicationSolution\\resourcesFolder\\data.txt");

		FileWriter fileWriter = new FileWriter(fileOfNewRegistrar, true);
		fileWriter.write(allTheInformation);
		StudentClassEnrollment enrollment = new StudentClassEnrollment();
		enrollment.enrollInCourses(this.student);

		String[] classEnrollmentInformation=new String[enrollment.coursesRegistered.size()];
		for(int i=0; i<enrollment.coursesRegistered.size();i++){
			classEnrollmentInformation[i]=enrollment.coursesRegistered.get(i);
		}

		System.out.println(Arrays.toString(classEnrollmentInformation));
		fileWriter.write("Registered Courses: "+Arrays.toString(classEnrollmentInformation));
		fileWriter.close();
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

