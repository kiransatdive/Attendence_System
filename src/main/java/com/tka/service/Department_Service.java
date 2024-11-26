package com.tka.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tka.dao.Department_Dao;
import com.tka.entity.Department;

@Service
public class Department_Service {
 
	@Autowired
	Department_Dao dao;
	public List<Department> getAllDepartmentDetails() {
		
		return dao.getAllDepartmentDetails();
	}
	public Department getByid(int id) {
		
		return dao.getByid(id);
	}
	public String insertDepartmentDetails(Department c) {
		
		return dao.insertDepartmentDetails(c);
	}
	public String updateDepartmentByid(Department c, int id) {
		
		return dao.updateDepartmentByid(c,id);
	}
	public String deleteDepartmentByid(int id) {
		
		return dao.deleteDepartmentByid(id);
	}

}
