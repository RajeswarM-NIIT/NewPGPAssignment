package com.test.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Skill {
	@Id
	private String skillid;
	private String skillname;
	private boolean skillavailable;
	
	public Skill() {
		// TODO Auto-generated constructor stub
	}

	public Skill(String sn) {
		skillname=sn;
	}

	public String getSkillid() {
		return skillid;
	}

	public void setSkillid(String skillid) {
		this.skillid = skillid;
	}

	public String getSkillname() {
		return skillname;
	}

	public void setSkillname(String skillname) {
		this.skillname = skillname;
	}

	public boolean isSkillavailable() {
		return skillavailable;
	}

	public void setSkillavailable(boolean skillavailable) {
		this.skillavailable = skillavailable;
	}
	
	@Override
	public String toString() {
		String  msg;
		msg = skillid + ", " + skillname + ", " + skillavailable;
		return msg;
	}
	
}
/*
skillid char(10) primary key,
skillname char(30),
sillavailable boolean
*/