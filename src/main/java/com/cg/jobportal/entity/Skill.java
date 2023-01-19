package com.cg.jobportal.entity;

public class Skill {
		
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

