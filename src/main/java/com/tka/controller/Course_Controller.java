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


import com.tka.entity.Course;
import com.tka.service.Course_Service;

@RestController
public class Course_Controller {
	
	@Autowired
	Course_Service service;

	@GetMapping("/api/courses")
	public List<Course> getAllCourseDetails(){
		return service.getAllCourseDetails();
	}
	
	@GetMapping("/api/courses/{id}")
	public Course getByid(@PathVariable int id) {
		return service.getByid(id);
	}
	
	@PostMapping("/api/courses")
	public String insertCourseDetails(@RequestBody Course c) {
		return service.insertCourseDetails(c);
	}
	
	@PutMapping("/api/courses/{id}")
	public String updateCourseDetailsByid(@RequestBody Course c,@PathVariable int id) {
		return service.updateCourseDetailsByid(c,id);
	}
	
	@DeleteMapping("/api/courses/{id}")
	public String deleteCourseDetailsByid(@PathVariable int id) {
		return service.deleteCourseDetailsByid(id);
	}
	
	
}
