package com.cg.jobportal.entity;

import java.time.LocalDateTime;

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
public class JobApplication {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(nullable=false,length=50)
	private long id;
	private LocalDateTime appliedDate = LocalDateTime.now();
	@Column(nullable=false,length=50)
	private String coverLetter;
	
	
	
	
	/*@Column(name="fr_id",nullable = false, length=6)
	private long freelancerId;
	@Column(nullable = false, length=100)
	private String freelancerName;
	@Column(nullable = false, length=100)
	private String freelancerUName;*/
	//many to one
		//private Jobs job;
	
	
	
	
}
