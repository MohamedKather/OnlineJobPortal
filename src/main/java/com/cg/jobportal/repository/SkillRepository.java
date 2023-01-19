package com.cg.jobportal.repository;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;

import com.cg.jobportal.entity.Skill;




@Repository
public interface SkillRepository extends JpaRepository<Skill, Long> {
	List<Skill> findAll();
}
