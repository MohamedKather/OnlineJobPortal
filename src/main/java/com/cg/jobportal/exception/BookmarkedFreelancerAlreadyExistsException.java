package com.cg.jobportal.exception;

public class BookmarkedFreelancerAlreadyExistsException extends Exception{
	private String msg;

	public BookmarkedFreelancerAlreadyExistsException(String msg) {
		super();
		this.msg = msg;
	}
}
