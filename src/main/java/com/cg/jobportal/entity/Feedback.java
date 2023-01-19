package com.cg.jobportal.entity;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Entity
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor

public class Feedback  {

	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	Long id;
	
	Integer ranges;
	String comments;

}
