package com.cg.jobportal.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
<<<<<<< HEAD
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
=======
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
>>>>>>> 776633c4ccacd1fd31533e1914bbdfbaadda2e20
import org.springframework.web.bind.annotation.RestController;

import com.cg.jobportal.entity.BookmarkedJob;
import com.cg.jobportal.service.BookmarkedJobService;
<<<<<<< HEAD
=======

>>>>>>> 776633c4ccacd1fd31533e1914bbdfbaadda2e20
@RestController
public class BookmarkedJobController {
	
	@Autowired
	public BookmarkedJobService bookServ;

	@PostMapping("/saveJob")
	public ResponseEntity<BookmarkedJob> saveJob(@RequestBody BookmarkedJob book){
		BookmarkedJob savedJob = bookServ.saveJob(book);
		return new ResponseEntity<>(savedJob, HttpStatus.CREATED);
	}
<<<<<<< HEAD
	
	@GetMapping("/allBookmarks")
	public ResponseEntity<List<BookmarkedJob>> getAllBookmarks() {
		List<BookmarkedJob> Bookmarks = bookServ.getAllBookmarkedJobs();
		return new ResponseEntity<>(Bookmarks, HttpStatus.OK);
=======
	@GetMapping("/getAllBookmarkedJob")
	public ResponseEntity<List<BookmarkedJob>> getAllBookmarkedJob(){
		List<BookmarkedJob> bookmark=bookServ.getAllBookmarked();
		return new ResponseEntity<List<BookmarkedJob>>(bookmark, HttpStatus.OK);
>>>>>>> 776633c4ccacd1fd31533e1914bbdfbaadda2e20
	}
}
