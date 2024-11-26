package com.tka.dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.tka.entity.Classroom;
import com.tka.entity.Subject;

@Repository
public class Subject_Dao {

	@Autowired
	SessionFactory factory;

	public List<Subject> getAllSubjectDetails() {
		Session session = factory.openSession();
		Criteria c = session.createCriteria(Subject.class);
		List blist = c.list();

		return blist;

	}

	public Subject getByid(int id) {
		Session session = factory.openSession();
		Subject c = session.get(Subject.class, id);
		System.out.println(c);
		return c;
	}

	public String insertSubjectDetails(Subject c) {
		Session session = factory.openSession();
		Transaction tx = session.beginTransaction();
		System.out.println(c);
		session.save(c);
		tx.commit();

		return "Data Inseerted Succesfully ";
	}

	public String updateSubjectDetailsByid(Subject c, int id) {
		Session session = factory.openSession();
		Transaction tx = session.beginTransaction();
		session.update(c);
		tx.commit();

		return "Updated Successfully";
	}

	public String deleteSubjectDetailsByid(int id) {
		Session session = factory.openSession();
		Transaction tx = session.beginTransaction();

		Subject c1 = session.get(Subject.class, id);
		session.delete(c1);
		tx.commit();
		return "Delete Successfully";
	}

}
