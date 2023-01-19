package com.cg.jobportal.service;

import java.util.List;

import com.cg.jobportal.entity.Admin;
import com.cg.jobportal.entity.Recruiter;

public interface RecruiterService {
	
	Recruiter saveRecruiter(Recruiter rec);
	
	List<Recruiter> getAllRecruiters();
	
	String deleteById(Long id);
	
	Recruiter updateRecruiter(Recruiter rec);

}
