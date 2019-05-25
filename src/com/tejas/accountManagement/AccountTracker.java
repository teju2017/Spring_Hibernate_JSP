package com.tejas.accountManagement;

import java.util.List;



import com.tejas.springdata.ActivityTracker;
import com.tejas.springdata.Amountpmt;
import com.tejas.springdata.BalanceTracker;
import com.tejas.springdata.Players;


public interface AccountTracker 
{
    public void insertActivityTracker(ActivityTracker actobj);
    
    public List<ActivityTracker> getTracker();
    
    public void insertPlayer(Players pls);
    
    public List<Players> getPlayers();
    
    public void insertPaymentamt(Amountpmt amt);
    
    public List<Amountpmt> getPayments();
    
    public List<BalanceTracker> getBalance();
    
}
