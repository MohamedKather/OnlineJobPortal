package com.cg.jobportal.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Admin {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long adminId;
	@Size(min = 5, message = "It's Required Field")
	private String firstName;
	@NotNull
	private String lastName;
	@Column(nullable = false, length = 10)
	private String userName;
	@Column(nullable = false, length = 10)
	private String password;
}
