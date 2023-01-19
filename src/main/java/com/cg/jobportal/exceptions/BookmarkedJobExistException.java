package com.cg.jobportal.exception;

public class BookmarkedJobExistException extends Exception {
	
	private String msg;

	public BookmarkedJobExistException(String msg) {
		super();
		this.msg = msg;
	}

	public BookmarkedJobExistException() {
		super();
	}
	

}
