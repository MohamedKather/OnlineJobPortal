package com.cg.jobportal.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.freelanceapp.entities.Freelancer;
import com.cg.jobportal.repository.FreelancerRepository;
@Service
public class FreelancerServiceImpl implements FreelancerService {
    
	@Autowired
	FreelancerRepository freelancerRepository;

	@Override
	public Freelancer saveFreelancer(Freelancer ent) {
		Freelancer ad=freelancerRepository.save(ent);
		return ad;
	}

	@Override
	public List<Freelancer> getAllFreelancer() {
		List<Freelancer> list=freelancerRepository.findAll();
		return list;
	}

	@Override
	public Optional<Freelancer> getFreelancerById(long id) {
		Optional<Freelancer> get=freelancerRepository.findById(id);
		return get;
	}

	@Override
	public Freelancer updateFreelancer(Freelancer ent) {
		Freelancer up=freelancerRepository.save(ent);
		return up;
	}

	@Override
	public String deleteFreelancer(long id) {
		freelancerRepository.deleteById(id);
		return "deleted succuessfully";
	}

	@Override
	public List<Freelancer>FreelancerByFirstName(String firstName){
		List<Freelancer>emp=freelancerRepository.findByFirstName(firstName);
		return emp;
	}

}
