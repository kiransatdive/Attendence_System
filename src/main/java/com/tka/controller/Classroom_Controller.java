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

import com.tka.entity.Classroom;
import com.tka.service.Classroom_Service;


@RestController
public class Classroom_Controller {
	
	@Autowired
	Classroom_Service service;
    
	@GetMapping("/api/classrooms")
	public List<Classroom> getAllClassroomDetails(){
		return service.getAllClassroomDetails();	
	}
	
	@GetMapping("/api/classrooms/{id}")
	public Classroom getByid(@PathVariable int id) {
		return service.getByid(id); 
	}
	
	@PostMapping("/api/classrooms")
	public String insertClassroomDetails(@RequestBody Classroom c) {
		return service.insertClassroomDetails(c);
	}
	

	@PutMapping("api/classrooms/{id}")
	public String updateClassroomDetailsByid(@RequestBody Classroom c,@PathVariable int id) {
		return service.updateClassroomDetailsByid(c,id);
	}
	
	@DeleteMapping("/api/classrooms/{id}")
	public String deleteClassroomDetailsByid(@PathVariable int id) {
		return service.deleteClassroomDetailsByid(id);
	}
	
	
	
} 
