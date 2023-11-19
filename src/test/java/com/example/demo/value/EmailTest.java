package com.example.demo.value;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class EmailTest {

	@Test
	public void testCreateValidEmail() {
		String validEmail = "john@example.com";
		Email email = Email.create(validEmail);
		assertEquals(validEmail, email.getValue());
	}

	@Test
	public void testCreateInvalidEmail() throws Exception {
		Assertions.assertThrows(Exception.class, () -> {
			String invalidEmail = "invalid-email";
			Email.create(invalidEmail);
		});
	}

	@Test
	public void testEquality() {
		String email1 = "john@example.com";
		String email2 = "john@example.com";
		String email3 = "jane@example.com";

		Email emailObj1 = Email.create(email1);
		Email emailObj2 = Email.create(email2);
		Email emailObj3 = Email.create(email3);

		assertEquals(emailObj1, emailObj2);
		assertNotEquals(emailObj1, emailObj3);
	}
}
