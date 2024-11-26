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

import com.tka.entity.ClassSchedule;

import com.tka.service.ClassSchedule_Service;

@RestController
public class ClassSchedule_Controller {

	@Autowired
	ClassSchedule_Service service;
	
	@GetMapping("/api/classSchedules")
	public List<ClassSchedule> getAllClassScheduleDetails(){
		return  service.getAllClassScheduleDetails();
	}
	
	@GetMapping("/api/classSchedules/{id}")
	public ClassSchedule getByid(@PathVariable int id) {
		return service.getByid(id);
	}
     
	@PostMapping("/api/classSchedules")
	public String insertClassScheduleDetails(@RequestBody ClassSchedule c) {
		return service.insertClassScheduleDetails(c);
	}
	
	@PutMapping("/api/classSchedules/{id}")
	public String updateClassScheduleDetailsByid(@RequestBody ClassSchedule c,@PathVariable int id) {
		return service.updateClassScheduleDetailsByid(c,id);
	}
	
	@DeleteMapping("/api/classSchedules/{id}")
	public String deleteClassScheduleDetailsByid(@PathVariable int id) {
		return service.deleteClassScheduleDetailsByid(id);
	}
	
	
}
