package com.example.demo.exception;

public class InquiryNotFoundException extends RuntimeException {
	
	public InquiryNotFoundException(String message) {
		super(message);
	}
}
