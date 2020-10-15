package com.nagar;

import javax.persistence.*;

@Entity
public class Student {
	@Id
	private int rollNo;
	private String name;
	private String section;
	@OneToOne
	private Project project;
	
	public Student(int rollNo, String name, String section, Project project) {
		super();
		this.rollNo = rollNo;
		this.name = name;
		this.section = section;
		this.project = project;
	}
	
	public Student(int rollNo) {
		super();
		this.rollNo = rollNo;
	}
	
	public Student() {
		super();
	}

	public int getRollNo() {
		return rollNo;
	}
	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSection() {
		return section;
	}
	public void setSection(String section) {
		this.section = section;
	}
	public Project getProject() {
		return project;
	}
	public void setProject(Project project) {
		this.project = project;
	} 
	
}
