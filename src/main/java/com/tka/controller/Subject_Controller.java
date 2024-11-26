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

import com.tka.entity.Subject;
import com.tka.service.Subject_Service;

@RestController
public class Subject_Controller {

	@Autowired
	Subject_Service service;

	@GetMapping("/api/subjects")
	public List<Subject> getAllSubjectDetails() {
		return service.getAllSubjectDetails();
	}

	@GetMapping("/api/subjects/{id}")
	public Subject getByid(@PathVariable int id) {
		return service.getByid(id);
	}

	@PostMapping("/api/subjects")
	public String insertSubjectDetails(@RequestBody Subject c) {
		return service.insertSubjectDetails(c);
	}

	@PutMapping("api/subjects/{id}")
	public String updateSubjectDetailsByid(@RequestBody Subject c, @PathVariable int id) {
		return service.updateSubjectDetailsByid(c, id);
	}

	@DeleteMapping("/api/subjects/{id}")
	public String deleteSubjectDetailsByid(@PathVariable int id) {
		return service.deleteSubjectDetailsByid(id);
	}
}
