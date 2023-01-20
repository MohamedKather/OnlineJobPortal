package com.cg.jobportal.exceptions;

public class InvalidJobException extends Exception {

	String msg;

	public InvalidJobException(String msg) {
		super();
		this.msg = msg;
	}

	public InvalidJobException() {
		super();
	}
	
}
