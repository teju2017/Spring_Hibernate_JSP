package com.tejas.springdata;

import javax.persistence.Column;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="amount_payement")
public class Amountpmt 
{
	public Amountpmt()
	{
		System.out.println("Amount payement value"+amountid);
	}
	
	public Amountpmt(String amountid, String playerid, String submissionDate, Float amount, String playername,
			String comments) {
		super();
		this.amountid = amountid;
		this.playerid = playerid;
		this.submissionDate = submissionDate;
		this.amount = amount;
		this.playername = playername;
		this.comments = comments;
	}

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="Amountid")
	private String amountid;
	
	@Column(name="Playerid")
	private String playerid;
	
	@Column(name="SubmissionDate")
	private String submissionDate;
	
	@Column(name="Amount")
	private Float amount;
	
	@Column(name="Player_name")
	   private String playername;
	
	@Column(name="Comments")  
	private String comments;

	public String getAmountid() {
		return amountid;
	}

	public void setAmountid(String amountid) {
		this.amountid = amountid;
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

	public Float getAmount() {
		return amount;
	}

	public void setAmount(Float amount) {
		this.amount = amount;
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
	
}
