package com.nagar;

import javax.persistence.Entity;
import javax.persistence.Id;


@Entity
public class Emp {
	@Id
	private int eCode;
	private String eName;
	private int sal;
	
	public Emp(int eCode, String eName, int sal) {
		super();
		this.eCode = eCode;
		this.eName = eName;
		this.sal = sal;
	}
	public Emp() {
		super();
	}
	public int geteCode() {
		return eCode;
	}
	public void seteCode(int eCode) {
		this.eCode = eCode;
	}
	public String geteName() {
		return eName;
	}
	public void seteName(String eName) {
		this.eName = eName;
	}
	public int getSal() {
		return sal;
	}
	public void setSal(int sal) {
		this.sal = sal;
	}

}
