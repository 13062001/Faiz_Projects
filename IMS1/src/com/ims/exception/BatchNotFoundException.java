package com.ims.exception;

public class BatchNotFoundException extends RuntimeException {
	public BatchNotFoundException(String msg) {
		System.err.println("BatchNotFoundException : "+msg);
	}
}
