package main.com.EmailAdministrationApplication.src.emailapp;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

public class NewTest {
	
	@Test(priority=1)
	public void functionalTest() {
		System.out.println("This test makes sure we can run a test");
		int number = 5;
		Assert.assertEquals(number, 5, "Not a valid number!");
	}
	
	@Test
	public void basicUserRegistration() throws IOException {
		String firstName = "Jordan";
		String lastName = "Dodson";
		Email emalRegistrationTest = new Email(firstName, lastName);
		
	}
}
