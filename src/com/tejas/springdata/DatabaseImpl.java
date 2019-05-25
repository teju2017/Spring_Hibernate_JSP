package com.tejas.springdata;

import java.util.List;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.tejas.accountManagement.AccountTracker;

@Repository
public class DatabaseImpl implements AccountTracker
{
	@Autowired
	private SessionFactory sessionFactory;
	
	
	@Override
	@Transactional
	public void insertActivityTracker(ActivityTracker actobj) 
	{
		Session currentSession = sessionFactory.getCurrentSession();
		currentSession.save(actobj);
		
	}


	@Override
	@Transactional
	public List<ActivityTracker> getTracker() {
		Session currentSession = sessionFactory.getCurrentSession();
		List<ActivityTracker> lst= currentSession.createQuery("from ActivityTracker order by Activityid desc").getResultList();
	    for(ActivityTracker act:lst)
	    {
	    	// System.out.println("Value is "+act.Playername);
	    }
		return lst;
		
	}


	@Override
	@Transactional
	public void insertPlayer(Players pls) {
		// TODO Auto-generated method stub
		Session currentSession = sessionFactory.getCurrentSession();
		currentSession.save(pls);
		
	}


	@Override
	@Transactional
	public List<Players> getPlayers() {
		// TODO Auto-generated method stub
		Session currentSession = sessionFactory.getCurrentSession();
		List<Players> lst= currentSession.createQuery("from Players order by Playerid desc").getResultList();
	    for(Players act:lst)
	    {
	    	// System.out.println("Value is "+act.Playername);
	    }
		return lst;
	}


	@Override
	@Transactional
	public void insertPaymentamt(Amountpmt amt) {
		Session currentSession = sessionFactory.getCurrentSession();
		currentSession.save(amt);
		
	}


	@Override
	@Transactional
	public List<Amountpmt> getPayments() {
		Session currentSession = sessionFactory.getCurrentSession();
		List<Amountpmt> lst= currentSession.createQuery("from Amountpmt order by amountid desc").getResultList();
	    for(Amountpmt act:lst)
	    {
	    	// System.out.println("Value is "+act.Playername);
	    }
		return lst;
	}


	@Override
	@Transactional
	public List<BalanceTracker> getBalance() {
		Session currentSession = sessionFactory.getCurrentSession();
		List<BalanceTracker> lst= currentSession.createQuery("from BalanceTracker order by Balanceid desc").getResultList();
	    for(BalanceTracker act:lst)
	    {
	    	// System.out.println("Value is "+act.Playername);
	    }
		return lst;
		
	}
}
