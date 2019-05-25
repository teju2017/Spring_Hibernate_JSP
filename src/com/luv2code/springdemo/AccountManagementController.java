package com.luv2code.springdemo;


import org.springframework.stereotype.Controller;



import org.springframework.stereotype.Repository;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.hibernate.HibernateException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.view.freemarker.FreeMarkerViewResolver;

import com.tejas.accountManagement.AccountTracker;
import com.tejas.springdata.ActivityTracker;
import com.tejas.springdata.Amountpmt;
import com.tejas.springdata.BalanceTracker;
import com.tejas.springdata.DatabaseImpl;
import com.tejas.springdata.Players;
import com.tejas.springdata.Student;



@Controller
public class AccountManagementController 

{
	

	@Autowired
	private AccountTracker dataimpl;
	
	
	
	/* #############################################################################################
	 *  All the intial page requests will come to the below section of the controller  
	 * ############################################################################################# */
	
	
	 
	
	   @GetMapping("/Activitytracker")
			public String activity_tracker(Model theModel)
			{
		        ActivityTracker act = new ActivityTracker();
		        theModel.addAttribute("activity", act);
				return "Activity_tracker";
			}
	   
	   
	   @GetMapping("/Playeradd")
		public String player_addition(Model theModel)
		{
	        Players play = new Players();
	        theModel.addAttribute("playersdata",play);
			return "Player";
		}
	   
	   
	   @GetMapping("/Amountadd")
	 		public String amount_addition(Model theModel)
	 		{
	 	        Amountpmt amt = new Amountpmt();
	 	        theModel.addAttribute("amountdata",amt);
	 			return "Amountadd";
	 		}
	   
	  
	   
	   
	   /* ####################################################################################
	    *  Below section contains the Database operation, basically the insertion of the data
	    * ################################################################################### */

	   
	   @RequestMapping("/ActivitySubmission")
		public String trackerSubmission(@ModelAttribute("activity") ActivityTracker act,Model mdt)
		{
		   System.out.println("Player name is "+act.getPlayername()+" Amount is "+act.getAmount()+"  funding details "+act.getActivitylist());
		   String abc[] = act.getPlayername().toString().split("-");
		   act.setPlayerid(abc[0]);
		   DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd");
			Date date = new Date();
			System.out.println(dateFormat.format(date));
			act.setSubmissionDate(dateFormat.format(date));
		    System.out.println("Player id is "+act.getPlayerid());
		   // ActivityTracker actobj1 = new ActivityTracker(abc[0],dateFormat.format(date),act.getAmount(),act.getPlayername(),act.getActivitylist(),act.getComments());
		   try
		   {
		      dataimpl.insertActivityTracker(act);
		      mdt.addAttribute("table", "ACTIVITY_TRACKER");
		      return "Insertion_success";

		   }
		   catch(HibernateException ae)
		   {
			   System.out.println("Insertion of the datafailing"+ae.getMessage());
			   mdt.addAttribute("ERROR", ae.getMessage());
			   return "insertion_failed";
		   }
		}
	   
	   @RequestMapping("/AmountSubmission")
	   public String amountSubmission(@ModelAttribute("amountdata") Amountpmt act,Model mdt)
	   {
		   System.out.println("Player name is "+act.getPlayername()+" Amount is "+act.getAmount()+"  Comments are "+act.getComments());
		   String abc[] = act.getPlayername().toString().split("-");
		   act.setPlayerid(abc[0]);
		   DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd");
			Date date = new Date();
			System.out.println(dateFormat.format(date));
			act.setSubmissionDate(dateFormat.format(date));
		    System.out.println("Player id is "+act.getPlayerid());
		   // ActivityTracker actobj1 = new ActivityTracker(abc[0],dateFormat.format(date),act.getAmount(),act.getPlayername(),act.getActivitylist(),act.getComments());
		   try
		   {
		      dataimpl.insertPaymentamt(act);
		      mdt.addAttribute("table", "AMOUNT_PAYEMENT");
		      return "Insertion_success";

		   }
		   catch(HibernateException ae)
		   {
			   System.out.println("Insertion of the datafailing"+ae.getMessage());
			   mdt.addAttribute("ERROR", ae.getMessage());
			   return "insertion_failed";
		   } 
	   }
		   
		   
		   @RequestMapping("/Playeraddition")
			public String playerSubmission(@ModelAttribute("playeradd") Players pla,Model mdt)
			{
			   System.out.println("Player name is "+pla.getPlayername()+" Comments is "+pla.getComments()+"Player id is "+pla.getPlayerid());
			   DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd");
				Date date = new Date();
				System.out.println(dateFormat.format(date));
				pla.setJoiningdate(dateFormat.format(date));
			   try
			   {
			      dataimpl.insertPlayer(pla);
			      mdt.addAttribute("table", "PLAYERS");
			      return "Insertion_success";

			   }
			   catch(HibernateException ae)
			   {
				   System.out.println("Insertion of the datafailing"+ae.getMessage());
				   mdt.addAttribute("ERROR", ae.getMessage());
				   return "insertion_failed";
			   }
		   
	          
		   
		}
	   
	   
	   /* #######################################################################################################
	    *  Below section displays the data from each of the table based on certain condition
	    * #######################################################################################################
	    */
	   
	   @RequestMapping("/gettracker")
	   public String trackRetrieve(Model mdt)
	   {
		    
		  List<ActivityTracker> list = dataimpl.getTracker();
		  mdt.addAttribute("Activitydata", list);
		  for(ActivityTracker act : list)
		  {
			  System.out.println("Value is "+act.getPlayerid()+" Player name "+act.getPlayername() + "   amount "+act.getAmount());
		  }
	      return "trackdata";
	   }
	   
	   // String Activityid,String Playerid,String SubmissionDate,Float Amount, String Player_name,String Activity_list,String Comments
	   
	   @RequestMapping("/getPlayer")
	   public String trackPlayer(Model mdt)
	   {
		    
		  List<Players> list = dataimpl.getPlayers();
		  mdt.addAttribute("Playerdata", list);
		  for(Players act : list)
		  {
			  System.out.println("Value is "+act.getPlayerid()+" Player name "+act.getPlayername() + "   Joining data "+act.getJoiningdate()+" Comments "+act.getComments());
		  }
	      return "Playerdata";
	   }
	   
	   @RequestMapping("/getBalance")
		public String balanaceTracker(Model theModel)
		{
	        List<BalanceTracker> list = dataimpl.getBalance();
	        theModel.addAttribute("balancedata",list);
	        for(BalanceTracker bat : list)
	        {
	        	System.out.println("Balance amount is "+bat.getBalance_amount()+"Balance id is "+bat.getBalanceid());
	        }
			return "Balancedata";
		}
	   
	   @RequestMapping("/getPayment")
	 		public String payementTracker(Model theModel)
	 		{
	 	        List<Amountpmt> list = dataimpl.getPayments();
	 	        theModel.addAttribute("paymentdata",list);
	 	        for(Amountpmt bat : list)
	 	        {
	 	        	System.out.println("Balance amount is "+bat.getAmount()+"Balance id is "+bat.getAmountid());
	 	        }
	 			return "Payment";
	 		}
	   
	   
	   @RequestMapping("/getIndex")
		public String getIndex(Model theModel)
		{
            return "Index_page";
		}

}

