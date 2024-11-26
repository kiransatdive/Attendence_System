package com.tka.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tka.dao.Course_Dao;
import com.tka.entity.Course;

@Service
public class Course_Service {

	@Autowired
	Course_Dao dao;

	public List<Course> getAllCourseDetails() {

		return dao.getAllCourseDetails();
	}

	public Course getByid(int id) {

		return dao.getByid(id);
	}

	public String insertCourseDetails(Course c) {

		return dao.insertCourseDetails(c);
	}

	public String updateCourseDetailsByid(Course c, int id) {

		return dao.updateCourseDetailsByid(c, id);
	}

	public String deleteCourseDetailsByid(int id) {
	
		return dao.deleteCourseDetailsByid(id);
	}

}
