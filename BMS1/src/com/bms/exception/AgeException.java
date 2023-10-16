package com.bms.exception;

public class AgeException extends RuntimeException  {
	public AgeException(String msg) {
		System.err.println("AgeException : "+msg);
	}
}
