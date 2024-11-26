package com.tka.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "class_schedules")
public class ClassSchedule {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int id;
	@ManyToOne
	@JoinColumn(name = "classroom_id", nullable = false)
	private Classroom classroom;
	String day_of_week;
	String end_time;
	String start_time;
	int subject_id;

	public ClassSchedule() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ClassSchedule(int id, Classroom classroom, String day_of_week, String end_time, String start_time,
			int subject_id) {
		super();
		this.id = id;
		this.classroom = classroom;
		this.day_of_week = day_of_week;
		this.end_time = end_time;
		this.start_time = start_time;
		this.subject_id = subject_id;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Classroom getClassroom() {
		return classroom;
	}

	public void setClassroom(Classroom classroom) {
		this.classroom = classroom;
	}

	public String getDay_of_week() {
		return day_of_week;
	}

	public void setDay_of_week(String day_of_week) {
		this.day_of_week = day_of_week;
	}

	public String getEnd_time() {
		return end_time;
	}

	public void setEnd_time(String end_time) {
		this.end_time = end_time;
	}

	public String getStart_time() {
		return start_time;
	}

	public void setStart_time(String start_time) {
		this.start_time = start_time;
	}

	public int getSubject_id() {
		return subject_id;
	}

	public void setSubject_id(int subject_id) {
		this.subject_id = subject_id;
	}

	@Override
	public String toString() {
		return "ClassSchedule [id=" + id + ", classroom=" + classroom + ", day_of_week=" + day_of_week + ", end_time="
				+ end_time + ", start_time=" + start_time + ", subject_id=" + subject_id + "]";
	}

}
