package com.tka.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.tka.entity.Faculty;
import com.tka.service.Faculty_Service;

@RestController
public class Faculty_Controller {

	@Autowired
	Faculty_Service service;
	
	@GetMapping("/api/faculties")
	public List<Faculty> getAllFacultyDetails(){
		return service. getAllFacultyDetails();
	}
	
	@GetMapping("/api/faculties/{id}")
	public Faculty getByid(@PathVariable int id) {
		return service.getByid(id);
		
	}
	
	@PostMapping("/api/faculties")
	public String insertFacultyDetails(@RequestBody Faculty f) {
		return service.insertFacultyDetails(f);
		
	}
	
	@PutMapping("api/faculties/{id}")
	public String updateFacultyDetails(@RequestBody Faculty f,@PathVariable int id) {
		return service.updateFacultyDetails(f,id);
	}
	
	@DeleteMapping("api/faculties/{id}")
	public String deleteFacultyDetailsByid(@PathVariable int id) {
		return service.deleteFacultyDetailsByid(id);
	}
	
	
}
