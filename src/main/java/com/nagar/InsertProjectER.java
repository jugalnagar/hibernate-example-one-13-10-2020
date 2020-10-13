package com.nagar;

import org.hibernate.Session;
import org.hibernate.Transaction;

public class InsertProjectER {

	public static void main(String[] args) {
		Session session = Utility.getSF().openSession();
		Transaction transit = session.beginTransaction();
		session.save(new Project(101,"Flower Detection","Machine Learning"));
		session.save(new Project(102,"School Management","Web Application"));
		session.save(new Project(103,"Social App","App Development"));
		session.save(new Project(104,"Mask Detection","Machine Learning"));
		session.save(new Project(105,"Restaurant Management","Web Application"));
		transit.commit();
		session.close();
		System.out.println("Project Stored ...........");

	}

}
