package com.cg.jobportal.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.cg.jobportal.entity.Feedback;
import com.cg.jobportal.service.FeedbackService;


@RestController
public class FeedbackController {
	
	@Autowired
	FeedbackService feedserv;

	
	@PostMapping("/add")
	public ResponseEntity<Feedback> addFeedback(@RequestBody Feedback feedback) {
		Feedback feed=feedserv.addFeedback(feedback);
		return new ResponseEntity<Feedback>(feed, HttpStatus.OK);
	}
	
	@GetMapping("/get/avgRatingsFor/{id}")
	public ResponseEntity<Feedback> getAverageRatings(@PathVariable String id) {
		Feedback avg=feedserv.averageRating(id)
			return new ResponseEntity<Feedback>(avg, HttpStatus.OK);
	}
}
