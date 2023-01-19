package com.cg.jobportal.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import com.cg.jobportal.entity.Skill;
import com.cg.jobportal.repository.SkillRepository;

public abstract class SkillExperienceImpl implements SkillExperienceService{
	@Autowired
	private SkillRepository skillRepo;
	@Override
	public Skill saveSkill(Skill skill) {
		Skill savedSkill=skillRepo.saveAll(skill);
		return savedSkill;
	}
	@Override
	public List<com.cg.jobportal.service.Skill> getAllSkills() {
        List<com.cg.freelanceapp.entities.Skill> Skills = skillRepo.findAll();
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
		Skill skills=skillRepo.saveAll(skill);
		return skills;
	}

}