package com.bms.exception;

public class BalanceException extends RuntimeException  {
	public BalanceException(String msg) {
		System.err.println("BalanceException : "+msg);
	}
}
