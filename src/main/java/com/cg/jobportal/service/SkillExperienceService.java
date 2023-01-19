package com.cg.jobportal.service;

import java.util.List;
import java.util.Optional;

import com.cg.freelanceapp.entities.Skill;
import com.cg.freelanceapp.entities.SkillExperience;

public interface SkillExperienceService {
	public SkillExperience addSkill(SkillExperience skillExperience);
	
	public SkillExperience getSkillById(Long id);
	
	public List<SkillExperience> getByFreelancer(Long id);

	public void updateSkillYears(Long id, Long freelancerId, Integer years);

	Skill saveSkill(Skill skill) ;

	List<Skill> getAllSkills();


	Optional<Skill> getSkillById(long id);
}
	


