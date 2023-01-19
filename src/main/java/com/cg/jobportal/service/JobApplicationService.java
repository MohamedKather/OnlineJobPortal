package com.cg.jobportal.service;

import java.util.List;

import com.cg.jobportal.entity.JobApplication;




public interface JobApplicationService  {

	JobApplication applyToJob(JobApplication jobApplication);

	List<JobApplication> findAll();

	void remove(long id);
	
	JobApplication updateJobApplication(long id,JobApplication jobApplication);
	
	//List<JobApplication> findAllByJobId(Long jobId);
	
	//List<JobApplication> findByFreeLancerid(Long freelancerId);


	
}
