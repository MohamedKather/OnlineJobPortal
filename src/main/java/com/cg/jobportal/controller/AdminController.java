package com.cg.jobportal.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.cg.jobportal.entity.Admin;
import com.cg.jobportal.service.AdminService;

import jakarta.validation.Valid;

@RestController
public class AdminController {

	@Autowired
	private AdminService serv;
	/*
	@PostMapping("/registerAdmin")
	public ResponseEntity<Admin> registerAdmin(@Valid @RequestBody Admin ad, BindingResult result){
		if(result.hasErrors())
			return new ResponseEntity<Admin> (HttpStatus.CONFLICT);
		Admin regAdmin=serv.registerAdmin(ad);
		return new ResponseEntity<Admin>(HttpStatus.CREATED);
	}
	@PostMapping("/loginAdmin")
	public ResponseEntity<String> loginAdmin(@RequestBody String email, @RequestBody String password ){
		String logAdmin=serv.loginAdmin(email,password);
		return new ResponseEntity<String>(logAdmin,HttpStatus.ACCEPTED);
	}
*/
	@PostMapping("/saveAdmin")
	public ResponseEntity<Admin> saveAdmin(@Valid @RequestBody Admin ent, BindingResult result){
		if (result.hasErrors()) {
			System.out.println("Errors Contains");
			List<FieldError> error = result.getFieldErrors();
			System.out.println(error);
		}
		Admin savedad=serv.saveAdmin(ent);
		return new ResponseEntity<Admin>(savedad,HttpStatus.CREATED);
		
	}
	@GetMapping("/getAll")
	public ResponseEntity<List<Admin>> getAllAdmins(){
		List<Admin> Admins=serv.getAllAdmins();
		return new ResponseEntity<List<Admin>>(Admins, HttpStatus.OK);
	}
	
	@GetMapping("/getAdmin/{adminId}")
	public ResponseEntity<Optional<Admin>> getAdminById(@PathVariable int adminId){
		Optional<Admin> std=serv.getAdminById(adminId);
		return new ResponseEntity<>(std, HttpStatus.OK);
		
	}
	
	@PutMapping("/update")
	public ResponseEntity<Admin> updateAdmin(@RequestBody Admin ent){
		Admin update=serv.updateAdmin(ent);
		return new ResponseEntity<Admin>(update, HttpStatus.ACCEPTED);
		
	}
}
