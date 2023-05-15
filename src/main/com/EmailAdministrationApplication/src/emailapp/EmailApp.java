package main.com.EmailAdministrationApplication.src.emailapp;

import java.util.Scanner;

public class EmailApp {
	public static void main(String[] args) {
		System.out.println("Please enter your first name: ");

		Scanner firstNameScanner = new Scanner(System.in);
		String firstName = firstNameScanner.nextLine();

		System.out.println("Please enter your last name: ");

		Scanner lastNameScanner = new Scanner(System.in);
		String lastName = lastNameScanner.nextLine();

		Email em1 = new Email(firstName, lastName);

		System.out.println(em1.getInformation());
	}
}
