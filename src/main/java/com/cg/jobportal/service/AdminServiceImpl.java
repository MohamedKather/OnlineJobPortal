package com.cg.jobportal.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.jobportal.entity.Admin;
import com.cg.jobportal.repository.AdminRepository;

import jakarta.validation.Valid;

@Service
public class AdminServiceImpl implements AdminService{

	@Autowired
	AdminRepository repo;
	
	@Override
	public Admin saveAdmin(Admin ent) {
		Admin ad=repo.save(ent);
		return ad;
	}

	@Override
	public List<Admin> getAllAdmins() {
		List<Admin> list=repo.findAll();
		return list;
	}

	@Override
	public Optional<Admin> getAdminById(long adminId) {
		Optional<Admin> get=repo.findById(adminId);
		return get;
	}

	@Override
	public Admin updateAdmin(Admin ent) {
		Admin up=repo.save(ent);
		return up;
	}

	@Override
	public Admin registerAdmin(@Valid Admin ad) {
		Admin register=repo.save(ad);
		return register;
	}

	@Override
	public String loginAdmin(String email, String password) {
		
		return null;
	}

}
