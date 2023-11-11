package com.example.demo.value;

/**
 * @author yuich
 *
 */
public class Name {
	private final String firstName;
	private final String lastName;

	public Name(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
	}

	public String fullName() {
		return this.firstName + " " + this.lastName;
	}
}
