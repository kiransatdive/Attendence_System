package com.tka.dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.tka.entity.Course;

@Repository
public class Course_Dao {

	@Autowired
	SessionFactory factory;

	public List<Course> getAllCourseDetails() {
		Session session = factory.openSession();
		Criteria c = session.createCriteria(Course.class);
		List blist = c.list();

		return blist;
	}

	public Course getByid(int id) {
		Session session = factory.openSession();
		Course c = session.get(Course.class, id);
		System.out.println(c);
		return c;
	}

	public String insertCourseDetails(Course c) {
		Session session = factory.openSession();
		Transaction tx = session.beginTransaction();
		System.out.println(c);
		session.save(c);
		tx.commit();

		return "Data Inseerted Succesfully ";
	}

	public String updateCourseDetailsByid(Course c, int id) {
		Session session = factory.openSession();
		Transaction tx = session.beginTransaction();
		session.update(c);
		tx.commit();

		return "Updated Successfully";
	}

	public String deleteCourseDetailsByid(int id) {
		Session session = factory.openSession();
		Transaction tx = session.beginTransaction();
        Course c=session.get(Course.class, id);
        session.delete(c);
        tx.commit();
		return "delete successfully";
	}

}
