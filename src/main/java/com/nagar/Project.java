package com.nagar;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Project {
	@Id
	private int pCode;
	private String pName;
	private String type;
	
	public Project(int pCode) {
		super();
		this.pCode = pCode;
	}
	public Project() {
		super();
	}
	public Project(int pCode, String pName, String type) {
		super();
		this.pCode = pCode;
		this.pName = pName;
		this.type = type;
	}
	public int getpCode() {
		return pCode;
	}
	public void setpCode(int pCode) {
		this.pCode = pCode;
	}
	public String getpName() {
		return pName;
	}
	public void setpName(String pName) {
		this.pName = pName;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	
}
