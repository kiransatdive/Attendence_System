package com.tka.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tka.dao.Faculty_Dao;
import com.tka.entity.Faculty;
@Service
public class Faculty_Service {

	@Autowired
	Faculty_Dao dao;
	public List<Faculty> getAllFacultyDetails() {
	
		return dao.getAllFacultyDetails();
	}
	public Faculty getByid(int id) {
		
		return dao.getByid(id);
	}
	public String insertFacultyDetails(Faculty f) {
		
		return dao.insertFacultyDetails(f);
	}
	public String updateFacultyDetails(Faculty f, int id) {
		
		return dao.updateFacultyDetails(f,id);
	}
	public String deleteFacultyDetailsByid(int id) {
		
		return dao.deleteFacultyDetailsByid(id);
	}

}
