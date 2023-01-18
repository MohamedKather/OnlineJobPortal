package com.cg.jobportal.service;

import java.util.List;

import com.cg.jobportal.entity.Admin;
import com.cg.jobportal.entity.Recruiter;

public interface RecruiterService {
	
	Recruiter saveJob(Recruiter rec);
	
	List<Recruiter> getAllJobs();
	
	String deleteById(Long id);
	
	Recruiter updateJob(Recruiter rec);

}
