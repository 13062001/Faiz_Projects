package com.bms.exception;

public class AadharNoException extends RuntimeException {
public AadharNoException(String msg) {
	System.err.println("AadharNoException : "+msg);
}
}
