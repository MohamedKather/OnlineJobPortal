package com.cg.jobportal.service;

import java.util.List;
import java.util.Optional;

import com.cg.jobportal.entity.Job;

public interface JobsService {

	
	Job postJob(Job job);
	
	List<Job> findAll();
	
	Optional<Job> findById(long id);
	
	void deletejob(long id);

	Job findByJobTitle(String jobTitle);
	
	
}
