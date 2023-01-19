package com.cg.jobportal.service;

import java.util.List;
import java.util.Optional;

import com.cg.jobportal.entity.Skill;

public interface SkillService {
	
	

	Skill getSkill(Skill ent);

	List<Skill> getAllSkills();

	String deleteById(long id);

	Skill saveSkill(Skill ent);

	Optional<com.cg.freelanceapp.entities.Skill> getSkillById(long skillId);

	com.cg.freelanceapp.entities.Skill saveSkill(com.cg.freelanceapp.entities.Skill skill);
	
		

	}
		

