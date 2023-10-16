package com.bms.exception;

public class AccNoException extends RuntimeException  {
public AccNoException(String msg) {
	System.err.println("AccNoException : "+msg);
}
}
