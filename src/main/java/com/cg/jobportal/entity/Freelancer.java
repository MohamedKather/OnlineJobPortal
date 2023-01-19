package com.cg.jobportal.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Freelancer {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="freelancer_id", updatable=false)
	private long id;
    
	private String userName;
	private String firstName;
	private String lastName;
	private String passowrd;
	public Freelancer(long id, String userName, String firstName, String lastName, String passowrd) {
		super();
		this.id = id;
		this.userName = userName;
		this.firstName = firstName;
		this.lastName = lastName;
		this.passowrd = passowrd;
	}
	public Freelancer() {
		super();
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getPassowrd() {
		return passowrd;
	}
	public void setPassowrd(String passowrd) {
		this.passowrd = passowrd;
	}
	@Override
	public String toString() {
		return "FreelancerEntity [id=" + id + ", userName=" + userName + ", firstName=" + firstName + ", lastName="
				+ lastName + ", passowrd=" + passowrd + "]";
	}
	
}
