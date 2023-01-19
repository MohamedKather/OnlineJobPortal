package com.cg.jobportal.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;



@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Jobs {

	@Id
	@Column(name = "job_id")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	@Column(nullable = false, length=10)
	private String jobTitle;
	@Column(nullable = false, length=100)
	private String jobDescription;
	@Column(nullable = false)
	private Boolean active;
}
