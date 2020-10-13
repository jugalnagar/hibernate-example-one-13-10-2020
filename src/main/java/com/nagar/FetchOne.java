package com.nagar;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Projection;
import org.hibernate.criterion.ProjectionList;
import org.hibernate.criterion.Projections;


public class FetchOne {

	public static void main(String[] args) {
		Session session = Utility.getSF().openSession();
		Criteria cr = session.createCriteria(Emp.class);
		
		/*Projection proj1 = Projections.property("eName");
		Projection proj2 = Projections.property("sal");
		ProjectionList pList = Projections.projectionList();
		pList.add(proj1);
		pList.add(proj2);*/
		
		/*Order order1=Order.asc("sal");
		Order order2=Order.desc("ename");
		cr.addOrder(order1);
		cr.addOrder(order2);*/
		
		//cr.setProjection(pList);
		
		List<Emp> list = cr.list();
		
		for(Emp object:list) {
			System.out.println(object.geteName());
		}

	}

}
