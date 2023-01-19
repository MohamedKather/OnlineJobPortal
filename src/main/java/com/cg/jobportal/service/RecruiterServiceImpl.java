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
	public Recruiter saveRecruiter(Recruiter rec) {
	Recruiter savedRecruiter=recRepo.save(rec);
	return savedRecruiter;
	}

	@Override
	public List<Recruiter> getAllRecruiters() {
		List<Recruiter> savedRecruiters=recRepo.findAll();
		return savedRecruiters;
	}
	
	@Override
	public String deleteById(Long id) {
		recRepo.deleteById(id);
		return "Recruiter deleted successfully";
	}
	
	@Override
	public Recruiter updateRecruiter(Recruiter rec) {
		 Recruiter updateRecruiter=recRepo.save(rec);
		return updateRecruiter;
	}
}
