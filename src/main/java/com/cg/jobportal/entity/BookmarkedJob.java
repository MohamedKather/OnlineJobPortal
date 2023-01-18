package com.cg.jobportal.entity;

import org.springframework.boot.autoconfigure.batch.BatchProperties.Job;

import jakarta.persistence.Entity;

@Entity
public class BookmarkedJob {
	
	private Long Id;
	private String job;
	private String skill;
	private String freelancer;
	
	public BookmarkedJob(Long id, String job, String skill, String freelancer) {
		super();
		Id = id;
		this.job = job;
		this.skill = skill;
		this.freelancer = freelancer;
	}

	public BookmarkedJob() {
		super();
	}

	public Long getId() {
		return Id;
	}

	public void setId(Long id) {
		Id = id;
	}

	public String getJob() {
		return job;
	}

	public void setJob(String job) {
		this.job = job;
	}

	public String getSkill() {
		return skill;
	}

	public void setSkill(String skill) {
		this.skill = skill;
	}

	public String getFreelancer() {
		return freelancer;
	}

	public void setFreelancer(String freelancer) {
		this.freelancer = freelancer;
	}
	
	
}
