package com.cg.jobportal.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

import com.cg.jobportal.entity.Freelancer;
import com.cg.jobportal.service.FreelancerService;

public class FreelancerController {

	@Autowired
	FreelancerService fService;
	
	@PostMapping("/saveFreelancer")
	 public String saveFreelancer(@RequestBody Freelancer f)  {
		Freelancer savef = fService.saveFreelancer(f);
		return "saved successfully";
		 
	 }
	 @GetMapping("/allFreelancer")
	 public ResponseEntity<List<Freelancer>> getAllFreelancer() {
		List<Freelancer> Freelancer=fService.getAllFreelancer();
		return new ResponseEntity<List<Freelancer>>(Freelancer, HttpStatus.OK);
		 
	 }
	 
	 @GetMapping("/getFreelancer/{id}")
	 public ResponseEntity<List<Freelancer>> getFreelancerId(@PathVariable long id){
		Optional<Freelancer> f=fService.getFreelancerById(id);
		 return new ResponseEntity(f, HttpStatus.OK);
		 
	 }

	 
	 @DeleteMapping("/deleteFreelancer")
	 public String deleteFreelancer(@RequestParam long id) {
		 fService.deleteFreelancer(id);
		 return "Freelancer deleted successfully";

	 }
	 
	 
	 @PutMapping("/updateFreelancer")
	 public Freelancer updateStudent(@RequestBody Freelancer f) {
		 return fService.updateFreelancer(f);
	 }
	 
	 @GetMapping("/Freelancer/{firstName}")
	 public List<Freelancer> getFreelancerByFirstName(@PathVariable String firstName){
		 List<Freelancer> list = fService.FreelancerByFirstName(firstName);
		 return list;
	 }
}
