package com.cg.jobportal.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.cg.jobportal.entity.JobApplication;

import io.swagger.annotations.ApiOperation;

public class JobApplicationController {
	@ApiOperation(value = "apply to job application")
	@PostMapping(value = "/apply")
	public ResponseEntity<String> applyToJob(@Valid @RequestBody JobApplication jobApplication,BindingResult bindingResult) {
		if (bindingResult.hasErrors()) {
			System.out.println("Some errors exist!");
			List<FieldError> fieldErrors = bindingResult.getFieldErrors();

			List<String> errMessages = new ArrayList<>();
			for (FieldError fe : fieldErrors) {
				errMessages.add(fe.getDefaultMessage());
			}
			throw new JobPortalValidationException(errMessages);
		}
		try {
			jobApplicationService.applyToJob(jobApplicationDto);
		} catch (InvalidJobException e) {
			throw new InvalidJobException("Job not found With given Id");
		} catch (InvalidJobApplicationException exception) {
			throw new InvalidJobApplicationException("One or more entered fields contain invalid objects.");
		}
		return new ResponseEntity<>("Job Applied Successfully", HttpStatus.CREATED);
	}
}
