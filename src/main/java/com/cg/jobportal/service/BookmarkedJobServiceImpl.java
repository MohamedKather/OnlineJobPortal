package com.cg.jobportal.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.jobportal.entity.BookmarkedJob;
import com.cg.jobportal.entity.Recruiter;
import com.cg.jobportal.repository.BookmarkedJobRepository;

@Service
public class BookmarkedJobServiceImpl implements BookmarkedJobService{
	
	@Autowired
	private BookmarkedJobRepository bookRepo;
	
	@Override
	public BookmarkedJob saveJob(BookmarkedJob book) {
	BookmarkedJob BookmarkedJob=bookRepo.save(book);
	return BookmarkedJob;
	}

	@Override
	public List<BookmarkedJob> getAllBookmarkedJobs() {
		List<BookmarkedJob> BookmarkedJobs=bookRepo.findAll();
		return BookmarkedJobs;
	}

}
