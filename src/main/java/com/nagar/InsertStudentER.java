package com.nagar;

import org.hibernate.Session;
import org.hibernate.Transaction;

public class InsertStudentER {

	public static void main(String[] args) {
		Session session = Utility.getSF().openSession();
		Transaction transit = session.beginTransaction();
		session.save(new Student(8291,"aaa","A1",new Project(101)));
		session.save(new Student(8292,"bbb","A2",new Project(104)));
		session.save(new Student(8293,"ccc","A1",new Project(102)));
		session.save(new Student(8294,"ddd","A2",new Project(105)));
		session.save(new Student(8295,"eee","A1",new Project(103)));
		transit.commit();
		session.close();
		
		System.out.println("Student Stored................");

	}

}
