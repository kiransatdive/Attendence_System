package com.tka.dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.tka.entity.Classroom;

@Repository
public class Classroom_Dao {

	@Autowired
	SessionFactory factory;

	public List<Classroom> getAllClassroomDetails() {
		Session session = factory.openSession();
		Criteria c = session.createCriteria(Classroom.class);
		List blist = c.list();

		return blist;

	}

	public Classroom getByid(int id) {
		Session session = factory.openSession();
		Classroom c = session.get(Classroom.class, id);
		System.out.println(c);
		return c;
	}

	public String insertClassroomDetails(Classroom c) {
		Session session = factory.openSession();
		Transaction tx = session.beginTransaction();
		System.out.println(c);
		session.save(c);
		tx.commit();

		return "Data Inseerted Succesfully ";
	}

	public String updateClassroomDetailsByid(Classroom c, int id) {
		Session session = factory.openSession();
		Transaction tx = session.beginTransaction();
		session.update(c);
		tx.commit();

		return "Updated Successfully";
	}

	public String deleteClassroomDetailsByid(int id) {
		Session session = factory.openSession();
		Transaction tx = session.beginTransaction();

		Classroom c1 = session.get(Classroom.class, id);
		session.delete(c1);
		tx.commit();
		return "Delete Successfully";
	}

}
