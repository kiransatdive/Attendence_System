package com.tka.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tka.dao.Classroom_Dao;
import com.tka.entity.Classroom;
@Service
public class Classroom_Service {
	@Autowired
	Classroom_Dao dao;

	public List<Classroom> getAllClassroomDetails() {

		return dao.getAllClassroomDetails();
	}

	public Classroom getByid(int id) {
		
		return dao.getByid(id);
	}

	public String insertClassroomDetails(Classroom c) {
		
		return dao.insertClassroomDetails(c);
	}

	public String updateClassroomDetailsByid(Classroom c, int id) {
		
		return dao.updateClassroomDetailsByid(c,id);
	}

	public String deleteClassroomDetailsByid(int id) {
		
		return dao.deleteClassroomDetailsByid(id);
	}
	

}
