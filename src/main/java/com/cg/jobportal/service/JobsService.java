package com.cg.jobportal.service;

import java.util.List;
import java.util.Optional;

import com.cg.jobportal.entity.Jobs;

public interface JobsService {

	
	Jobs postJob(Jobs jobs);
	
	List<Jobs> findAll();
	
	Optional<Jobs> findById(long id);
	
	void deletejob(long id);

	Jobs findByJobTitle(String jobTitle);
	
	
}
