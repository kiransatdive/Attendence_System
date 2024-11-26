package com.tka.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tka.dao.ClassSchedule_Dao;
import com.tka.entity.ClassSchedule;
@Service
public class ClassSchedule_Service {
	
	@Autowired
	ClassSchedule_Dao dao;

	public List<ClassSchedule> getAllClassScheduleDetails() {
		
		return dao.getAllClassScheduleDetails();
	}

	public ClassSchedule getByid(int id) {
		
		return dao.getByid(id);
	}

	public String insertClassScheduleDetails(ClassSchedule c) {
		
		return dao.insertClassScheduleDetails(c);
	}

	public String updateClassScheduleDetailsByid(ClassSchedule c, int id) {
		
		return dao.updateClassScheduleDetailsByid(c,id);
	}

	public String deleteClassScheduleDetailsByid(int id) {
		
		return dao.deleteClassScheduleDetailsByid(id);
	}

}
