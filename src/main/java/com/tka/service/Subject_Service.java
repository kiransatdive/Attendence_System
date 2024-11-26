package com.tka.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tka.dao.Subject_Dao;
import com.tka.entity.Subject;

@Service
public class Subject_Service {

	@Autowired
	Subject_Dao dao;

	public List<Subject> getAllSubjectDetails() {

		return dao.getAllSubjectDetails();
	}

	public Subject getByid(int id) {

		return dao.getByid(id);
	}

	public String insertSubjectDetails(Subject c) {
		return dao.insertSubjectDetails(c);
	}

	public String updateSubjectDetailsByid(Subject c, int id) {

		return dao.updateSubjectDetailsByid(c, id);
	}

	public String deleteSubjectDetailsByid(int id) {
		return dao.deleteSubjectDetailsByid(id);
	}
}
