package com.tka.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "faculty_attendance")
public class Faculty_Attendence {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int id;

	@ManyToOne
	@JoinColumn(name = "faculty_id", nullable = false)
	private Faculty faculties;

	@ManyToOne
	@JoinColumn(name = "class_schedules_id", nullable = false)
	private ClassSchedule class_schedules;

	String date;
	String status;

	public Faculty_Attendence() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Faculty_Attendence(int id, Faculty faculties, ClassSchedule class_schedules, String date, String status) {
		super();
		this.id = id;
		this.faculties = faculties;
		this.class_schedules = class_schedules;
		this.date = date;
		this.status = status;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Faculty getFaculties() {
		return faculties;
	}

	public void setFaculties(Faculty faculties) {
		this.faculties = faculties;
	}

	public ClassSchedule getClass_schedules() {
		return class_schedules;
	}

	public void setClass_schedules(ClassSchedule class_schedules) {
		this.class_schedules = class_schedules;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	@Override
	public String toString() {
		return "Faculty_Attendence [id=" + id + ", faculties=" + faculties + ", class_schedules=" + class_schedules
				+ ", date=" + date + ", status=" + status + "]";
	}

}
