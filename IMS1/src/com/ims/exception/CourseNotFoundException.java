package com.ims.exception;

public class CourseNotFoundException extends RuntimeException {
	public CourseNotFoundException(String msg) {
		System.err.println("CourseNotFoundException : "+msg);
	}
}
