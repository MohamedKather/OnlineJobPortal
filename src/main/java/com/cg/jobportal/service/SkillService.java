package com.cg.jobportal.service;

import java.util.List;
import org.springframework.stereotype.Service;

import com.cg.jobportal.entity.BookmarkedFreelancer;
import com.cg.jobportal.entity.Skill;
import com.cg.jobportal.exception.BookmarkedFreelancerAlreadyExistsException;
import com.cg.jobportal.exceptions.InvalidSkillException;

@Service
public interface SkillService {

	Skill saveSkill(Skill skl) throws InvalidSkillException;

	Skill getSkill(Skill ent);

	List<Skill> getAllSkills();

	String deleteById(long id);

}
