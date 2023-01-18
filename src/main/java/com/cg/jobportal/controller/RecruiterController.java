package com.cg.jobportal.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

public class RecruiterController {

	@PostMapping("/saveJob")
	public ResponseEntity<Recruiter> saveJob(@RequestBody Recruiter rec){
		Recruiter savedJob = recServ.saveJob(rec);
		return new ResponseEntity<Recruiter>(savedJob, HttpStatus.CREATED);
	}
}
