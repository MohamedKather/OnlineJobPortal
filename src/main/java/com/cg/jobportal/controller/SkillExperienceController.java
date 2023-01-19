package com.cg.jobportal.controller;

import com.cg.freelanceapp.entities.Freelancer;
import com.cg.freelanceapp.entities.Skill;

public class SkillExperienceController {
	private Long id;
	private Skill skill;
	private Integer years;
	private Freelancer freelancer;
	public void SkillExperience() {
}
	public void SkillExperience(Skill skill, Integer years, Freelancer freelancer) {
		this.skill = skill;
		this.years = years;
		this.freelancer = freelancer;
	}
	public Freelancer getFreelancer() {
		return freelancer;
	}

	public Long getId() {
		return id;
	}

	public Skill getSkill() {
		return skill;
	}

	public Integer getYears() {
		return years;
	}
	public void setFreelancer(Freelancer freelancer) {
		this.freelancer = freelancer;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public void setSkill(Skill skill) {
		this.skill = skill;
	}

	public void setYears(Integer years) {
		this.years = years;
	}
}
