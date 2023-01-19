package com.cg.jobportal.repository;
import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;

import com.cg.freelanceapp.entities.Skill;

@Repository
public interface SkillRepository extends JpaRepository<Skill, Long> {
}
