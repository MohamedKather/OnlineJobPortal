package com.cg.jobportal.service;
import java.util.List;
import java.util.Optional;

import com.cg.freelanceapp.dto.FreelancerListDTO;
import com.cg.freelanceapp.entities.Freelancer;

import jakarta.validation.Valid;

public interface FreelancerService {

	Freelancer saveFreelancer(Freelancer f);

	List<Freelancer> getAllFreelancer();

	Optional<Freelancer> getFreelancerById(long id);

	String deleteFreelancer(long id);

	Freelancer updateFreelancer(Freelancer f);

	List<Freelancer> FreelancerByFirstName(String firstName);

	
}
