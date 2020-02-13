package com.capgemini.storemanagement.exception;

public class InvalidChoiceException extends RuntimeException {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	String msg = "Invalid Choice";
	
	public InvalidChoiceException(String info) {
		super(info);
	}
	@Override
	public String getMessage() {
		
		return this.msg;
	}
}
