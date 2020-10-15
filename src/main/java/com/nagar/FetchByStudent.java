package com.nagar;

import org.hibernate.Criteria;
import org.hibernate.Session;

public class FetchByStudent {

	public static void main(String[] args) {
		Session session = Utility.getSF().openSession();

		Student student =session.get(Student.class, 8292);
		System.out.println(student.getRollNo());
		System.out.println(student.getName());
		System.out.println(student.getSection());
		System.out.println(student.getProject().getpCode());
		System.out.println(student.getProject().getpName());
		System.out.println(student.getProject().getType());
		
		session.close();

	}

}
