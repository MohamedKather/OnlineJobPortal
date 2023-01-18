package com.cg.jobportal.service;

import java.util.List;
import java.util.Optional;

import com.cg.jobportal.entity.Admin;

public interface AdminService {

	Admin saveAdmin(Admin ent);

	List<Admin> getAllAdmins();

	Optional<Admin> getAdminById(int adminId);

	Admin updateAdmin(Admin ent);

}
