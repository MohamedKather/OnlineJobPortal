package com.cg.jobportal.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import com.cg.freelanceapp.entities.Skill;
import com.cg.freelanceapp.entities.SkillExperience;
import com.cg.jobportal.repository.SkillRepository;

public abstract class SkillExperienceImpl implements SkillExperienceService{
	@Autowired
	private SkillRepository skillRepo;
	@Override
	public Skill saveSkill(Skill skill) {
		Skill savedSkill=skillRepo.save(skill);
		return savedSkill;
	}
	@Override
	public List<Skill> getAllSkills() {
        List<Skill> Skills = skillRepo.findAll();
		return Skills;
	}
	@Override
	public Optional<Skill> getSkillById(long id) {
		Optional<Skill> skill=skillRepo.findById(id);
		return skill;
	}
	@Override
	public void deleteSkill(long id) {
		skillRepo.deleteById((long) id);
		
	}
	
	public Skill updateEmployee(Skill skill) {
		Skill skills=skillRepo.save(skill);
		return skills;
	}

}