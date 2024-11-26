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

import com.tka.entity.Department;
import com.tka.service.Department_Service;

@RestController
public class Department_Controller {

	@Autowired
	Department_Service service;

	@GetMapping("/api/departments")
	public List<Department> getAllDepartmentDetails() {
		return service.getAllDepartmentDetails();
	}

	@GetMapping("/api/departments/{id}")
	public Department getByid(@PathVariable int id) {
		return service.getByid(id);
	}

	@PostMapping("/api/departments")
	public String insertDepartmentDetails(@RequestBody Department c) {
		return service.insertDepartmentDetails(c);
	}
	
	@PutMapping("api/departments/{id}")
	public String updateDepartmentByid(@RequestBody Department c,@PathVariable int id) {
		return service.updateDepartmentByid(c,id);
	}
	
	@DeleteMapping("/api/departments/{id}")
	public String deleteDepartmentByid(@PathVariable int id) {
		return service.deleteDepartmentByid(id);
	}
}
