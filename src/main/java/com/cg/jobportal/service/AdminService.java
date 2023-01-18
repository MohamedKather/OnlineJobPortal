package com.cg.jobportal.service;

import java.util.List;
import java.util.Optional;

import com.cg.jobportal.entity.Admin;

import jakarta.validation.Valid;

public interface AdminService {

	Admin saveAdmin(Admin ent);

	List<Admin> getAllAdmins();

	Optional<Admin> getAdminById(long adminId);

	Admin updateAdmin(Admin ent);

	String loginAdmin(String email, String password);

	Admin registerAdmin(@Valid Admin ad);


	

}
