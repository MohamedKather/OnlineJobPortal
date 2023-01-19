package com.cg.jobportal.service;

import java.util.List;
import java.util.Optional;

import com.cg.jobportal.entity.Skill;

public interface SkillService {
	
	

	Skill getSkill(long ent);

	List<Skill> getAllSkills();

	String deleteById(int id);

	Skill saveSkill(Skill ent);

	Optional<Skill> getSkillById(int skillId);

	com.cg.freelanceapp.entities.Skill saveSkill(com.cg.freelanceapp.entities.Skill skill);
		

	}
		

