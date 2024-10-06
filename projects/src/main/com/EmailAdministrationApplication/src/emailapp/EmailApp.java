package main.com.EmailAdministrationApplication.src.emailapp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class EmailApp {
	public static void main(String[] args) throws IOException {
		returnEmployee();
	}

	public static void returnEmployee() throws IOException {

		System.out.println("Please enter your first name: ");
		BufferedReader firstNameScanner = new BufferedReader(new InputStreamReader(System.in));

		String firstName = null;
		BufferedReader lastNameScanner = new BufferedReader(new InputStreamReader(System.in));
		String lastName = null;

		boolean userEnteredFirstName = false;

		while (!userEnteredFirstName) {

			firstName = firstNameScanner.readLine().trim();
			if (firstName.length() >= 2) {
				System.out.println("First name: " + firstName);
				userEnteredFirstName = true;
				System.out.println("Please enter your last Name: ");
				boolean userEnteredLastName = false;
				while (!userEnteredLastName) {
					lastName = lastNameScanner.readLine().trim();
					if (lastName.length() <= 2 && lastName.isBlank()) {
						System.out.println("Please enter valid last name!");
					} else if (lastName.length() >= 2) {
						System.out.println("Last Name: " + lastName);
						userEnteredLastName = true;
					}
				}
			} else if (firstName.isBlank()) {
				System.out.println("Please enter valid first name!");
			}
		}

		Email em1 = new Email(firstName, lastName);
		System.out.println(em1.getInformation());
	}
}