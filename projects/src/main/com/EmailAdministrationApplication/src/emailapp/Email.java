package main.com.EmailAdministrationApplication.src.emailapp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Email {
	private String firstName;
	private String lastName;
	private String password;
	int passwordLength = 10;
	private String email;
	private String department;
	private int mailboxCapacity = 500;
	private String alternateEmail;
	private String companySuffix = "aeycompany.com";

	// Constructor to receive the first and the last name
	public Email(String firstName, String lastName) throws IOException {
		this.firstName = firstName;
		this.lastName = lastName;

		// Call a method asking for the department - return the department
		this.department = setDepartment();

		// Call a method that returns a random password
		this.password = randomPassword(passwordLength);
		System.out.println("\nYour password is: " + this.password);

		// Combine elements to generate email in version of firstName.lastName@email.net
		email = firstName.toLowerCase() + "." + lastName.toLowerCase() + "@" + this.department + "." + companySuffix;
	}

	// Ask for the department
	private String setDepartment() throws IOException {

		System.out.print("New worker: " + firstName + " " + lastName
				+ ".\n\n DEPARTMENT CODES:\n1 Sales\n2 Development\n3 Accounting \n0 None\n\nEnter department code:");

		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		String department = reader.readLine();
		String[] deptArray = { "Sales", "Development", "Accounting", "noDepartment" };
		for (int i = 0; i <= deptArray.length; i++) {
			if (department.equals("1")) {
				department = "Sales";
				break;
			} else if (department.equals("2")) {
				department = "Development";
				break;
			} else if (department.equals("3")) {
				department = "Accounting";
				break;
			} else if (department.equals("0")) {
				System.out.println();
				System.out.println("Please contact HR for help with department using current work email");
				department = "noDepartment";
				break;
			}
		}
		return department;
	}

	// Generate a random password
	private String randomPassword(int length) {
		String passwordSet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!@#$%";
		char[] password = new char[length];
		for (int i = 0; i < length; i++) {
			int rand = (int) (Math.random() * passwordSet.length());
			password[i] = passwordSet.charAt(rand);
		}
		return new String(password);
	}

	// Set the mailbox capacity
	public void setMailboxCapacity(int capacity) {
		this.mailboxCapacity = capacity;
	}

	// Set the alternate email
	public void setAlternateEmail(String AltEmail) {
		this.alternateEmail = AltEmail;
	}

	// Change the password
	public void changePassword(String password) {
		this.password = password;
	}

	public int getMailBoxCapacity() {
		return mailboxCapacity;
	}

	public String getAlternateEmail() {
		return alternateEmail;
	}

	public String getPassword() {
		return password;
	}

	public String getInformation() {
		return "Name: " + this.firstName + " " + this.lastName + "\nEmail: " + this.email + "\nMailbox Capacity "
				+ this.mailboxCapacity;
	}

}
