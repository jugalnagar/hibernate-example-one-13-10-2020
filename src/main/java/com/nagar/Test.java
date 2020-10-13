package com.nagar;

import org.hibernate.Session;
import org.hibernate.Transaction;

public class Test {
	public static void main(String arg[]) {
		
		Session session = Utility.getSF().openSession();
		Transaction transit = session.beginTransaction();
		session.save(new Emp(112,"bbb",35000));
		session.save(new Emp(113,"ccc",45000));
		session.save(new Emp(114,"ddd",55000));
		session.save(new Emp(115,"eee",65000));

		transit.commit();
		session.close();
		
		System.out.println("Data stored >>>>>>>>>>>>>");
		
	}
}
