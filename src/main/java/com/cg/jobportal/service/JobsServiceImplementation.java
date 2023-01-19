package com.cg.jobportal.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.jobportal.entity.Jobs;

import com.cg.jobportal.repository.JobsRepository;

@Service
public class JobsServiceImplementation implements JobsService {
	
	
	@Autowired
	JobsRepository jar;
	
	@Override
	public Jobs postJob(Jobs jobs) {
		return jar.save(jobs);
		
	}
	
	@Override
	public List<Jobs> findAll() {
		return jar.findAll();
	}
	
	@Override
	public Optional<Jobs> findById(long id) {
		
		return jar.findById(id);
	}


    @Override
	public void deletejob(long id) {
		if (jar.existsById(id)) {
             jar.deleteById(id);
		
	}
		
    }
    
    
	@Override
	public Jobs findByJobTitle(String jobTitle) {
	   return jar.findByJobTitle(jobTitle);
	}

}




