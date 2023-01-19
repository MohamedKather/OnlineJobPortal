package com.cg.jobportal.exception;


import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class GlobalExceptionHandler {
	
	@ExceptionHandler(value=UserAlreadyExistException.class)
	public ResponseEntity<String> userAlreadyExistException(UserAlreadyExistException msg){
		return new ResponseEntity<String>("User Already Exist,Please Try Again.",HttpStatus.CONFLICT);
	}
	
	@ExceptionHandler(value=RecruiterAlreadyExistException.class)
	public ResponseEntity<String>RecruiterAlreadyExistsException(RecruiterAlreadyExistException user){
		return new ResponseEntity<String>("Recruiter already exist in database",HttpStatus.CONFLICT);
	}
}
