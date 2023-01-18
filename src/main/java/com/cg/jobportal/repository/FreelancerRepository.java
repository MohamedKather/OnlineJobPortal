package com.cg.jobportal.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.cg.freelanceapp.entities.Freelancer;

@Repository
public interface FreelancerRepository extends JpaRepository<Freelancer, Long> {
    
	public List<Freelancer> findByFirstName(@Param("name")String firstName);

	
	public void deleteById(int id);


	
}
