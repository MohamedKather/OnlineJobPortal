package com.cg.jobportal.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.jobportal.entity.JobApplication;
import com.cg.jobportal.repository.JobApplicationRepository;
@Service
public class JobApplicationServiceImplementation implements JobApplicationService {
	
	@Autowired
	JobApplicationRepository jar;


	@Override
	public JobApplication applyToJob(JobApplication jobApplication) {
			
			return jar.save(jobApplication);
	}

	@Override
	public List<JobApplication> findAll() {
		return jar.findAll();
	}

	@Override
	public void remove(long id)  {
		if (jar.existsById(id)) {

			jar.deleteById(id);
		}	
	}
	

	@Override
	public JobApplication updateJobApplication(long id, JobApplication jobApplication) {
			JobApplication jobApplication1 = jar.findById(id).get();
			jar.save(jobApplication);

			return jobApplication;
	}
	

	/*@Override
	public List<JobApplication> findAllByJobId(Long jobId) {
		return jar.findAllByJobId(jobId);
	}
	
	
	/*@Override
	public List<JobApplication> findByFreeLancerid(Long freelancerId) {
		return jar.findByFreeLancerid(freelancerId);
	}*/

}
