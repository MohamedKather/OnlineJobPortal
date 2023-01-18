package com.cg.jobportal.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.cg.jobportal.entity.Admin;
import com.cg.jobportal.entity.Recruiter;
import com.cg.jobportal.service.RecruiterService;

public class RecruiterController {
	
	@Autowired
	public RecruiterService recServ;

	@PostMapping("/saveJob")
	public ResponseEntity<Recruiter> saveJob(@RequestBody Recruiter rec){
		Recruiter savedJob = recServ.saveJob(rec);
		return new ResponseEntity<>(savedJob, HttpStatus.CREATED);
	}
	
	@GetMapping("/allJobs")
	public ResponseEntity<List<Recruiter>> getAllJobs() {
		List<Recruiter> Jobs = recServ.getAllJobs();
		return new ResponseEntity<>(Jobs, HttpStatus.OK);
	}
	
	@DeleteMapping("/deleteJobId/{id}")
	public ResponseEntity<String> deleteById(@PathVariable Long id) {
		String delete = recServ.deleteById(id);
		return new ResponseEntity<>(delete, HttpStatus.OK);
	}
	
	@PutMapping("/update")
	public ResponseEntity<Recruiter> updateJob(@RequestBody Recruiter  rec){
		Recruiter update =recServ.updateJob(rec);
		return new ResponseEntity<>(update, HttpStatus.ACCEPTED);
		
	}
	
}
