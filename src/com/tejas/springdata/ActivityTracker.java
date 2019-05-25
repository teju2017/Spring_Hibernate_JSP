package com.tejas.springdata;

import javax.persistence.Column;




import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="activity_tracker")
public class ActivityTracker 
{
	
	public String getActivityid() {
		return Activityid;
	}

	public void setActivityid(String activityid) {
		Activityid = activityid;
	}

	public String getPlayerid() {
		return Playerid;
	}

	public void setPlayerid(String playerid) {
		Playerid = playerid;
	}

	public String getSubmissionDate() {
		return SubmissionDate;
	}

	public void setSubmissionDate(String submissionDate) {
		SubmissionDate = submissionDate;
	}

	public Float getAmount() {
		return Amount;
	}

	public void setAmount(Float amount) {
		Amount = amount;
	}

	public String getPlayername() {
		return Playername;
	}

	public void setPlayername(String playername) {
		Playername = playername;
	}

	public String getActivitylist() {
		return Activitylist;
	}

	public void setActivitylist(String activitylist) {
		Activitylist = activitylist;
	}

	public String getComments() {
		return Comments;
	}

	public void setComments(String comments) {
		Comments = comments;
	}

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="Activityid")
	private String Activityid;
	
	@Column(name="Playerid")
	private String Playerid;
	
	@Column(name="SubmissionDate")
	private String SubmissionDate;
	
	@Column(name="Amount")
	private Float Amount;
	
	@Column(name="Player_name")
	   private String Playername;
	
	@Column(name="Activity_list")
	   private String Activitylist;
	
	@Column(name="Comments")  
	private String Comments;
	
	
	   
	 
	// public ActivityTracker(String Activityid,String Playerid,String SubmissionDate,Float Amount, String Player_name,String Activity_list,String Comments) 
	public ActivityTracker(String Playerid,String SubmissionDate,Float Amount, String Playername,String Activitylist,String Comments) 
	{
		//this.Activityid=Activityid;
		this.Playerid=Playerid;
		this.SubmissionDate=SubmissionDate;
		this.Amount=Amount;
		this.Playername=Playername;
		this.Activitylist=Activitylist;
		this.Comments=Comments;
	}
	
	public ActivityTracker()
	{
		System.out.println("Default activity constructor");
	}
	
	   
   

   
   
   
}
