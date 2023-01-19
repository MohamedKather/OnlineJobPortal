package com.cg.jobportal.service;

import java.util.List;

import com.cg.jobportal.entity.BookmarkedJob;
import com.cg.jobportal.entity.Recruiter;

public interface BookmarkedJobService {
	
	BookmarkedJob saveJob(BookmarkedJob book);

	List<BookmarkedJob> getAllBookmarkedJobs();

}
