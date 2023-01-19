package com.cg.jobportal.entity;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;


@Entity

public class Feedback  {

	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	Long id;
	
	Integer ranges;
	String comments;

}
