package com.bms.exception;

public class GenderException extends RuntimeException{
	public GenderException(String msg) {
		System.err.println("GenderException : "+msg);
	}
}
