package com.tka.dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.tka.entity.ClassSchedule;
import com.tka.entity.Classroom;

@Repository
public class ClassSchedule_Dao {

	@Autowired
	SessionFactory factory;

	public List<ClassSchedule> getAllClassScheduleDetails() {
		Session session = factory.openSession();

		Criteria c = session.createCriteria(ClassSchedule.class);
		List blist = c.list();

		return blist;

	}

	public ClassSchedule getByid(int id) {
		Session session = factory.openSession();
		ClassSchedule c = session.get(ClassSchedule.class, id);
		System.out.println(c);
		return c;

	}

	public String insertClassScheduleDetails(ClassSchedule c) {
		Session session = factory.openSession();
		Transaction tx = session.beginTransaction();
		System.out.println(c);
		session.save(c);
		tx.commit();

		return "Data Inseerted Succesfully ";
	}

	public String updateClassScheduleDetailsByid(ClassSchedule c, int id) {
		Session session = factory.openSession();
		Transaction tx = session.beginTransaction();
		session.update(c);
		tx.commit();

		return "Updated Successfully";
	}

	public String deleteClassScheduleDetailsByid(int id) {
		Session session = factory.openSession();
		Transaction tx = session.beginTransaction();
		ClassSchedule c=session.get(ClassSchedule.class, id);
		session.delete(c);
		tx.commit();
		return "Delete Succsessfully";
	}

}
