package com.cg.jobportal.repository;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;

import com.cg.jobportal.entity.Skill;


<<<<<<< HEAD

=======
>>>>>>> acc90fdbde20d16d7025d4de81a7c089b9c11b95

@Repository
public interface SkillRepository extends JpaRepository<Skill, Long> {
	List<Skill> findAll();
}
