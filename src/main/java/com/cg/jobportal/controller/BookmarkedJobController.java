package com.cg.jobportal.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.cg.jobportal.entity.BookmarkedJob;
import com.cg.jobportal.service.BookmarkedJobService;

public class BookmarkedJobController {
	
	@Autowired
	public BookmarkedJobService bookServ;

	@PostMapping("/saveJob")
	public ResponseEntity<BookmarkedJob> saveJob(@RequestBody BookmarkedJob book){
		BookmarkedJob savedJob = bookServ.saveJob(book);
		return new ResponseEntity<>(savedJob, HttpStatus.CREATED);
	}
}
