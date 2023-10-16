package com.bms.exception;

public class MobNoException extends RuntimeException  {
	public MobNoException(String msg) {
		System.err.println("MobNoException : "+msg);
	}
}
