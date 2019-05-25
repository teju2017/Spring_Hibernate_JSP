package com.tejas.springdata;

import java.util.List;



import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;


@Repository
public class StudentDaoImpl implements StudentDao {
	
	
	@Autowired
	private SessionFactory sessionFactory;

	@Override
	@Transactional
	public List<Student> getStudents() {
		// TODO Auto-generated method stub
		
		Session currentSession = sessionFactory.getCurrentSession();
	    List<Student> lst= currentSession.createQuery("from Student where emailid != 'thejas.hm@hotmail.com' order by studid desc").getResultList();
	    for(Student std:lst)
	    {
	    	System.out.println("Value is "+lst.toString());
	    }
		return lst;
	}

	@Override
	@Transactional
	public void insertData(Student theStudent) {
		// TODO Auto-generated method stub
		Session currentSession = sessionFactory.getCurrentSession();
		currentSession.save(theStudent);
         
	}
	
	@Override
	@Transactional
	public void deleteData(Student theStudent) {
		// TODO Auto-generated method stub
		try
		{
		  Session currentSession = sessionFactory.getCurrentSession();
		  currentSession.delete(theStudent);
		}
         catch(Exception ae)
		{
        	 System.out.println("Issue in the deletion of records, Check whether the ID exists");
		}
	}
	


}
