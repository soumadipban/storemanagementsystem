package com.capgemini.storemanagement.exception;

@SuppressWarnings("serial")
public class UserNotFoundException extends RuntimeException {
	String msg = "Invalid UserName Or Password";
//
//	public UserNotFoundException() {
//		super();
//	}
//
//	@Override
//	public String getMessage() {
//		return this.msg;
//	}
	public UserNotFoundException(String msg) {
		super();
		this.msg=msg;
	}
	
	@Override
	public String getMessage() {
		// TODO Auto-generated method stub
		return this.msg;
	}
}
