package com.cg.jobportal.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.freelanceapp.entities.Skill;
import com.cg.jobportal.repository.SkillRepository;


@Service
public abstract class SkillServiceImpl implements SkillService {

	@Autowired
	private SkillRepository skillRepo;
	@Override
	public Skill saveSkill(Skill skill) {
	
		Skill savedskill=skillRepo.save(skill);
		return savedskill;
	}
	@Override
	public List<Skill> getAllSkills() {
        List<Skill> skills = skillRepo.findAll();
		return skills;
	}
	
	@Override
	public Optional<Skill> getSkillById(long id) {
		Optional<Skill> skill=skillRepo.findById(id);
		return skill;
	}
	
	@Override
	public void deleteSkill(long id) {
		skillRepo.deleteById(id);
		
	}
	
	public Skill updateSkill(Skill skill) {
		Skill skills=skillRepo.save(skill);
		return skills;
	}

}

	
	