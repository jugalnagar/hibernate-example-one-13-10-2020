package com.nagar;

import org.hibernate.Criteria;
import org.hibernate.Session;

public class FetchByProject {

	public static void main(String[] args) {
		Session session = Utility.getSF().openSession();

		Project project =session.get(Project.class, 104);
		System.out.println(project.getpCode());
		System.out.println(project.getpName());
		System.out.println(project.getType());
		System.out.println(project.getStudent().getRollNo());
		System.out.println(project.getStudent().getName());
		System.out.println(project.getStudent().getSection());
		
		session.close();

	}

}
