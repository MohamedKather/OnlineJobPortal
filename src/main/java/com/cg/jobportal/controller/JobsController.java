package com.cg.jobportal.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.cg.jobportal.entity.Jobs;
import com.cg.jobportal.service.JobsService;

@RestController
public class JobsController {
	
	
	@Autowired
	JobsService js; 
	
	@PostMapping("/postJob")
	public ResponseEntity<Object> job(@RequestBody Jobs jobs) {
		js.postJob(jobs);
		return new ResponseEntity<>("Job Posted Successfully", HttpStatus.OK);
	}
	
	
	@GetMapping("/findAllJobPost")
	public ResponseEntity<Object> findAll() {
		return new ResponseEntity<>(js.findAll(), HttpStatus.OK);
	}
	
	
	@GetMapping(value = "/findById/{id}")
	public ResponseEntity<Object> findById(@PathVariable long id) {
		//try {
			return new ResponseEntity<>(js.findById(id), HttpStatus.OK);
		/*} catch (InvalidJobException exception) {
			throw new InvalidJobException("Job with given id doesn't exist");
		}*/

	}

	
	@GetMapping("/deletejob/{id}")
	public ResponseEntity<Object> deletejob(@PathVariable long id) {
		//try {
			js.deletejob(id);
		/*} catch (InvalidJobException exception) {
			throw new InvalidJobException("Job with given id not found");
		}*/
		return new ResponseEntity<>("deleted successfully", HttpStatus.OK);

	}
	
	
	
	
	@GetMapping(value = "/findJobsBySkill/{jobTitle}")
	@ResponseBody
	public ResponseEntity<Jobs> findByJobTitle(@PathVariable String jobTitle) {
		//try {
			return new ResponseEntity<>(js.findByJobTitle(jobTitle), HttpStatus.OK);
		/*} catch (InvalidJobException exception) {
			throw new InvalidJobException("no job with this skill found");
		}*/

	}
	


}
