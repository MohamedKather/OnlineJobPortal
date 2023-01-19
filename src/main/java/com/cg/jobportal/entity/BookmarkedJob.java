package com.cg.jobportal.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class BookmarkedJob {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	//private Job job;
	//private Skill skill;
	//private Freelancer freelancer;
	
	
}