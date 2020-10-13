package com.nagar;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Projection;
import org.hibernate.criterion.ProjectionList;
import org.hibernate.criterion.Projections;

public class FetchEROneToOne {

	public static void main(String[] args) {
		Session session = Utility.getSF().openSession();
		Criteria cr = session.createCriteria(Student.class);
		Student student =session.get(Student.class, 8295);
		System.out.println(student.getRollNo());
		System.out.println(student.getName());
		System.out.println(student.getSection());
		System.out.println(student.getProject().getpCode());
		System.out.println(student.getProject().getpName());
		System.out.println(student.getProject().getType());
		
		session.close();

	}

}
