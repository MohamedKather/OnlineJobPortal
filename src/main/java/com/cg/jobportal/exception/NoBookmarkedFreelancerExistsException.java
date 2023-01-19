package com.cg.jobportal.exception;

public class NoBookmarkedFreelancerExistsException extends Exception{
	String msg;

	
	public NoBookmarkedFreelancerExistsException(String msg) {
		super();
		this.msg = msg;
	}
}
