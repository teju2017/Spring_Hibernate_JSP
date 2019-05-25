package com.tejas.springdata;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Student")
public class Student {

	/* Auto generation of the ID */
	/*  We need to ensure that the Auto increment value is set for the column */
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="studid")
	private int id;
	
	@Column(name="studname")
	private String name;
	
	@Column(name="emailid")
	private String email;
	
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	// public Student(int id,String name, String email) {
		public Student(String name, String email) {
		super();
		//this.id=id;
		this.name = name;
		this.email = email;
	}

	public Student() {
		// TODO Auto-generated constructor stub
	}

}
