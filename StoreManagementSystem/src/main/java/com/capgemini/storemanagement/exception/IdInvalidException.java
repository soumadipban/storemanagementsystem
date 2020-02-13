package com.capgemini.storemanagement.exception;

@SuppressWarnings("serial")
public class IdInvalidException extends RuntimeException {
	String msg = "Entered Id is Wrong";
	
	public IdInvalidException() {
		super();
	}
	
	@Override
	public String getMessage() {
		return this.msg;
	}
}
