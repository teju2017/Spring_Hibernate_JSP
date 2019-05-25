package com.tejas.springdata;

import javax.persistence.Column;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="players")
public class Players 
{
	
    public Players()
    {
    	System.out.println("Default Player constructor");
    }
	
 //	public Players(String playerid,String playername, String joiningdate, String comments) {
       public Players(String playername, String joiningdate, String comments) {
		super();
		//this.playerid=playerid;
		this.playername = playername;
		this.joiningdate = joiningdate;
		this.comments = comments;
	}

	@Id
	// @GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="Playerid")
	private String playerid;
	
	@Column(name="Playername")
	private String playername;
	
	@Column(name="JoiningDate")
	private String joiningdate;
	
	@Column(name="Comments")  
	private String comments;

	public String getPlayerid() {
		return playerid;
	}

	public String getPlayername() {
		return playername;
	}

	public void setPlayername(String playername) {
		this.playername = playername;
	}

	public String getJoiningdate() {
		return joiningdate;
	}

	public void setJoiningdate(String joiningdate) {
		this.joiningdate = joiningdate;
	}

	public String getComments() {
		return comments;
	}

	public void setComments(String comments) {
		this.comments = comments;
	}

	public void setPlayerid(String playerid) {
		this.playerid = playerid;
	}

	
}
