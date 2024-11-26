package com.tka.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

@Entity
@Table(name = "faculties", uniqueConstraints = {
		@UniqueConstraint(name = "UK_faculties_email", columnNames = "email") })
public class Faculty {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int id;
	@ManyToOne
	@JoinColumn(name = "department_id", nullable = false)
	private Department deparments;
	String email;
	String name;

	public Faculty() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Faculty(int id, Department deparments, String email, String name) {
		super();
		this.id = id;
		this.deparments = deparments;
		this.email = email;
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Department getDeparments() {
		return deparments;
	}

	public void setDeparments(Department deparments) {
		this.deparments = deparments;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Faculty [id=" + id + ", deparments=" + deparments + ", email=" + email + ", name=" + name + "]";
	}

}
