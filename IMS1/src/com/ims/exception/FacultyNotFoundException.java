package com.ims.exception;

public class FacultyNotFoundException extends RuntimeException {
	public FacultyNotFoundException(String msg) {
		System.err.println("FacultyNotFoundException : "+msg);
	}
}
