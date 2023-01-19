package com.cg.jobportal.entity;

import java.util.List;
import java.util.Optional;
import java.util.function.Function;

import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.repository.query.FluentQuery.FetchableFluentQuery;

import com.cg.jobportal.repository.SkillRepository;

import jakarta.persistence.Column;
	import jakarta.persistence.GeneratedValue;
	import jakarta.persistence.GenerationType;
	import jakarta.persistence.Id;
	import jakarta.persistence.SequenceGenerator;

	public class Skill{
		
				
		private Long id;
		private String name;
		private String description;
		public Skill() {
			super();
		}
			public Skill(String name,String description) {
				super();
				this.name = name;
				this.description = description;
			}
			public String getDescription() {
				return description;
			}
			public Long getId() {
				return id;
			}
			public String getName() {
				return name;
			}
			public void setDescription(String description) {
				this.description = description;
			}
			public void setId(Long id) {
				this.id = id;
		    }
			public void setName(String name) {
				this.name = name;
			}
	}
