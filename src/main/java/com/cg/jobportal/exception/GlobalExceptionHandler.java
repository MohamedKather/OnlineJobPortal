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

	@ExceptionHandler(value=BookmarkedFreelancerAlreadyExistsException.class)
	public ResponseEntity<String> BookmarkedFreelancerAlreadyExistsException(BookmarkedFreelancerAlreadyExistsException msg){
		return new ResponseEntity<String> ("Bookmarked freelancer already exists, please try with another freelancer", HttpStatus.CONFLICT);
	}
	@ExceptionHandler(value=NoBookmarkedFreelancerExistsException.class)
	public ResponseEntity<String> NoBookmarkedFreelancerExistsException(NoBookmarkedFreelancerExistsException msg){
		return new ResponseEntity<String> (" No bookmarked freelancer exists in db", HttpStatus.CONFLICT);
	} 
	
	@ExceptionHandler(value=InvalidSkillException.class)
	public ResponseEntity<String> InvalidSkillException(InvalidSkillException msg){
		return new ResponseEntity<String>("Invalid skill entered",HttpStatus.CONFLICT);
	}
	
}
