package com.tejas.springdata;

import javax.persistence.Column;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;



@Entity
@Table(name="balance_tracker")
public class BalanceTracker 
{
	public BalanceTracker() {
	    System.out.println("Balance Tracker value");
	}
	
	
	public BalanceTracker(String playerid, String submissionDate, Float balance_amount,
			String playername, String comments) {
		super();
		this.playerid = playerid;
		this.submissionDate = submissionDate;
		this.balance_amount = balance_amount;
		this.playername = playername;
		this.comments = comments;
	}

	public String getBalanceid() {
		return balanceid;
	}

	public void setBalanceid(String balanceid) {
		this.balanceid = balanceid;
	}

	public String getPlayerid() {
		return playerid;
	}

	public void setPlayerid(String playerid) {
		this.playerid = playerid;
	}

	public String getSubmissionDate() {
		return submissionDate;
	}

	public void setSubmissionDate(String submissionDate) {
		this.submissionDate = submissionDate;
	}

	public Float getBalance_amount() {
		return balance_amount;
	}

	public void setBalance_amount(Float balance_amount) {
		this.balance_amount = balance_amount;
	}

	public String getPlayername() {
		return playername;
	}

	public void setPlayername(String playername) {
		this.playername = playername;
	}

	public String getComments() {
		return comments;
	}

	public void setComments(String comments) {
		this.comments = comments;
	}

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="Balanceid")
	private String balanceid;
	
	@Column(name="Playerid")
	private String playerid;
	
	@Column(name="SubmissionDate")
	private String submissionDate;
	
	@Column(name="Balance_amount")
	private Float balance_amount;
	
	@Column(name="Player_name")
	   private String playername;
	
	@Column(name="Comments")  
	private String comments;
}
