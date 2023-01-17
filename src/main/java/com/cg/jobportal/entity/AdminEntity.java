package com.cg.jobportal.entity;

import jakarta.annotation.Generated;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class AdminEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int adminId;
	private String firstName;
	private String lastName;
	private String userName;
	private String password;

}
