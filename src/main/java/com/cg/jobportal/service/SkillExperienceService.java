package com.cg.jobportal.service;

import java.util.List;
import java.util.Optional;

import com.cg.jobportal.entity.Skill;
import com.cg.jobportal.entity.SkillExperience;

public interface SkillExperienceService {
	public SkillExperience addSkill(SkillExperience skillExperience);
	
	public SkillExperience getSkillById(Long id);
	
	public List<SkillExperience> getByFreelancer(Long id);

	public void updateSkillYears(Long id, Long freelancerId, Integer years);

	void Skill (Skill skill) ;

	List<Skill> getAllSkills();


	Optional<Skill> getSkillById(long id);

	void deleteSkill(long id);

	com.cg.jobportal.entity.Skill saveSkill(com.cg.jobportal.entity.Skill skill);
}
	


