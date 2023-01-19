package com.cg.jobportal.exception;

<<<<<<< HEAD
import org.springframework.web.bind.annotation.ControllerAdvice;

@ControllerAdvice
public class GlobalExceptionHandler {

//@ExceptionHandler(value=)
	
=======
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;





@ControllerAdvice
public class GlobalExceptionHandler {
	
	@ExceptionHandler(value=UserAlreadyExistException.class)
	public ResponseEntity<String> userAlreadyExistException(UserAlreadyExistException msg){
		return new ResponseEntity<String>("User Already Exist,Please Try Again.",HttpStatus.CONFLICT);
	}
<<<<<<< HEAD
	@ExceptionHandler(value=BookmarkedFreelancerAlreadyExistsException.class)
	public ResponseEntity<String> BookmarkedFreelancerAlreadyExistsException(BookmarkedFreelancerAlreadyExistsException msg){
		return new ResponseEntity<String> ("Bookmarked freelancer already exists, please try with another freelancer", HttpStatus.CONFLICT);
	}
	@ExceptionHandler(value=NoBookmarkedFreelancerExistsException.class)
	public ResponseEntity<String> NoBookmarkedFreelancerExistsException(NoBookmarkedFreelancerExistsException msg){
		return new ResponseEntity<String> (" No bookmarked freelancer exists in db", HttpStatus.CONFLICT);
	} 
=======
>>>>>>> 7200272d3f95133ea883b9cf2acea315e7843220
>>>>>>> a9e2082721f433e98e1ba8ece83e1d5b3df5b552
}
