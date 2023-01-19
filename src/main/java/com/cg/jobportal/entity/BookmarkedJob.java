package com.cg.jobportal.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class BookmarkedJob {
	@Id
	private Long id;
	private String job;
	private String skill;
	private String freelancer;
	
	public BookmarkedJob(Long id, String job, String skill, String freelancer) {
		super();
		this.id = id;
		this.job = job;
		this.skill = skill;
		this.freelancer = freelancer;
	}

	public BookmarkedJob() {
		super();
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
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