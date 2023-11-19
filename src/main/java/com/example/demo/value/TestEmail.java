package com.example.demo.value;

public class TestEmail {

	public static void main(String[] args) {
		Email email1 = Email.create("yuichi@gmail.com");
		Email email2 = Email.create("tanida@gmail.com");
		
		System.out.println(email1);
		System.out.println(email2);

	}

}
