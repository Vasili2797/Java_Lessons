package emailapp;

import java.util.Scanner;

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
	public Email(String firstName, String lastName) {
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
	private String setDepartment() {
		System.out.print("New worker: " + firstName + " " + lastName
				+ ".\n\n DEPARTMENT CODES:\n1 Sales\n2 Development\n3 Accounting \n0 None\nEnter department code:");
		Scanner deptScanner = new Scanner(System.in);
		int department = deptScanner.nextInt();
		if (department == 1) {
			return "Sales";
		} else if (department == 2) {
			return "dev";
		} else if (department == 3) {
			return "Accounting";
		} else {
			return "noDepartment";
		}

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
