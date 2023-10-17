package com.ims.exception;

public class StudentNotFoundException extends RuntimeException {
public StudentNotFoundException(String msg) {
	System.err.println("StudentNotFoundException : "+msg);
}
}
