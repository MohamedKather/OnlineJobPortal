package com.cg.jobportal.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.jobportal.entity.Admin;
import com.cg.jobportal.exception.UserAlreadyExistException;
import com.cg.jobportal.repository.AdminRepository;

import jakarta.validation.Valid;

@Service
public class AdminServiceImpl implements AdminService{

	@Autowired
	AdminRepository repo;
	
	@Override
	public Admin saveAdmin(Admin ent)throws UserAlreadyExistException {
		if(repo.existsById(ent.getAdminId())) {
			throw new UserAlreadyExistException();
		}
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
	public Admin updateAdmin(long adminId,Admin ent) {
		if(!(repo.existsById(ent.getAdminId()))) {
			System.out.println("Admin Doesn't Exist");
		}
		Admin ad=repo.save(ent);
		return ad;
	}

	@Override
	public String loginadmin(Admin ad) {
		List<Admin> a=repo.getByEmail(ad.getEmail());
		List<Admin> b=repo.getByPassword(ad.getPassword());
		if(a.equals(ad.getEmail()) && b.equals(ad.getPassword())){
				return "Login Successfull";
	}
		return "Invalid email or password";
	}

}
