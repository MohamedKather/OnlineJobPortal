package com.cg.jobportal.service;

import java.util.List;
import java.util.Optional;

import com.cg.jobportal.entity.Admin;
import com.cg.jobportal.exception.UserAlreadyExistException;

import jakarta.validation.Valid;

public interface AdminService {

	Admin saveAdmin(Admin ent) throws UserAlreadyExistException;

	List<Admin> getAllAdmins();

	Optional<Admin> getAdminById(long adminId);

	Admin updateAdmin(long admind, Admin ent);

	String loginadmin(Admin ad);;
}
