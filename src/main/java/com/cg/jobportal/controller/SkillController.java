package com.cg.jobportal.controller;

import java.util.List;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.cg.jobportal.entity.Skill;
import com.cg.jobportal.service.SkillService;

public class SkillController {
	@Autowired
	private SkillService serv;

	@PostMapping("/saveSkill")
	public ResponseEntity<Skill> saveSkill(@RequestBody long ent) {
		Skill savedskill = ((SkillService) serv).getSkill(ent);
		return new ResponseEntity<Skill>(savedskill, HttpStatus.CREATED);
	}

	@PutMapping("/update")
	public ResponseEntity<Skill> updateSkill(@RequestBody int ent) {
		Skill update = serv.getSkill(ent);
		return new ResponseEntity<Skill>(update, HttpStatus.ACCEPTED);
	}

	@GetMapping("/allSkills")
	 public ResponseEntity<List<Skill>> getAllSkills(SkillService skillService) {	
		List<Skill> Skills=skillService.getAllSkills();
		return new ResponseEntity<List<Skill>>(HttpStatus.OK); 
	 }

	@GetMapping("/getSkill/{id}")
	 public <Skills> ResponseEntity<List<Skills>> getSkillId(@PathVariable int id){
		Skill skill = new Skill();
		 return new ResponseEntity(skill, HttpStatus.OK);
	}

	@DeleteMapping("/deleteSkill/{id}")
	public ResponseEntity<String> deleteSkillById(@PathVariable int id) {
		String msg = serv.deleteById(id);
		return new ResponseEntity<String>(msg, HttpStatus.GONE);
	}
}