package com.cg.jobportal.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.jobportal.entity.Recruiter;
import com.cg.jobportal.repository.RecruiterRepository;

@Service
public class RecruiterServiceImpl implements RecruiterService{
	
	@Autowired
	private RecruiterRepository recRepo;

	@Override
	public Recruiter saveJob(Recruiter rec) {
	Recruiter savedJob=recRepo.save(rec);
	return savedJob;
	}

	@Override
	public List<Recruiter> getAllJobs() {
		List<Recruiter> savedJobs=recRepo.findAll();
		return savedJobs;
	}
	
	@Override
	public String deleteById(Long id) {
		recRepo.deleteById(id);
		return "Job deleted successfully";
	}
	
	@Override
	public Recruiter updateJob(Recruiter rec) {
		 Recruiter updateJob=recRepo.save(rec);
		return updateJob;
	}
}
