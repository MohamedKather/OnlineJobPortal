package com.cg.jobportal.entity;

import java.util.List;
import com.cg.freelanceapp.entities.BookmarkedFreelancer;
import com.cg.freelanceapp.entities.Feedback;
import com.cg.freelanceapp.entities.Job;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity
public class Recruiter {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="recruiter_id")
	private  Long id;
	@Column(nullable = false)
	private String firstName;
	@Column(nullable = false)
	private String lastName;
	@Column(nullable = false)
	private String userName;
	@Column(nullable = false)
	private String password;
	
	@OneToMany(mappedBy = "postedBy", targetEntity = Job.class, cascade = CascadeType.ALL)
	@Column(name = "job_id")
	private List<Job> postedJobs;
	
	@OneToMany(mappedBy = "createdBy", targetEntity = Feedback.class, cascade = CascadeType.ALL)
	@Column(name = "feedback_id")
	private List<Feedback> feedbacks;
	
	@OneToMany(mappedBy = "bookmarkedBy", targetEntity = BookmarkedFreelancer.class, cascade = CascadeType.ALL)
	@Column(name = "bookmarkedFreelancer_id")
	private List<BookmarkedFreelancer> freelancers;
	
	public Recruiter(Long id, String firstName, String lastName, String userName, String password) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.userName = userName;
		this.password = password;
	}

	public Recruiter() {
		super();
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
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

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
}