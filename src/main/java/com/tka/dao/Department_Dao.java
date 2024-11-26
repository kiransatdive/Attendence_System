package com.tka.dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.tka.entity.Classroom;
import com.tka.entity.Department;

@Repository
public class Department_Dao {

	@Autowired
	SessionFactory factory;

	public List<Department> getAllDepartmentDetails() {
		Session session = factory.openSession();
		Criteria c = session.createCriteria(Department.class);
		List blist = c.list();

		return blist;
	}

	public Department getByid(int id) {
		Session session = factory.openSession();
		Department c = session.get(Department.class, id);
		System.out.println(c);
		return c;
	}

	public String insertDepartmentDetails(Department c) {
		Session session = factory.openSession();
		Transaction tx = session.beginTransaction();
		System.out.println(c);
		session.save(c);
		tx.commit();

		return "Data Inseerted Succesfully ";
	}

	public String updateDepartmentByid(Department c, int id) {
		Session session = factory.openSession();
		Transaction tx = session.beginTransaction();
		session.update(c);
		tx.commit();

		return "Updated Successfully";
	}

	public String deleteDepartmentByid(int id) {
		Session session = factory.openSession();
		Transaction tx = session.beginTransaction();
		Department c=session.get(Department.class, id);
		session.delete(c);
		tx.commit();
		return "Delete Successfully";
	}

}
