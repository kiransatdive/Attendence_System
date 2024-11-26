package com.tka.dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.tka.entity.Classroom;
import com.tka.entity.Faculty;

@Repository
public class Faculty_Dao {

	@Autowired
	SessionFactory factory;

	public List<Faculty> getAllFacultyDetails() {
		Session session = factory.openSession();
		Criteria c = session.createCriteria(Faculty.class);
		List blist = c.list();

		return blist;
	}

	public Faculty getByid(int id) {
		Session session = factory.openSession();
		Faculty c = session.get(Faculty.class, id);
		System.out.println(c);
		return c;
	}

	public String insertFacultyDetails(Faculty f) {
		Session session = factory.openSession();
		Transaction tx = session.beginTransaction();
		System.out.println(f);
		session.save(f);
		tx.commit();

		return "Data Inseerted Succesfully ";
	}

	public String updateFacultyDetails(Faculty f, int id) {
		Session session = factory.openSession();
		Transaction tx = session.beginTransaction();
		session.update(f);
		tx.commit();

		return "Updated Successfully";
	}

	public String deleteFacultyDetailsByid(int id) {
		Session session = factory.openSession();
		Transaction tx = session.beginTransaction();

		Faculty f = session.get(Faculty.class, id);
		session.delete(f);
		tx.commit();
		return "Delete Successfully";
	}
	
	

}
