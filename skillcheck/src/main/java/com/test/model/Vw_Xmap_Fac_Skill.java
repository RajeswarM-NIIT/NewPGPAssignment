package com.test.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Vw_Xmap_Fac_Skill {
	@Id
	private String xmapid;
	private String facultyid, facultyname, location, skillid, skillname;
	private boolean facultyavailable, xmapavailable, skillavailable;
	
	public Vw_Xmap_Fac_Skill() {
		// TODO Auto-generated constructor stub
	}

	public String getXmapid() {
		return xmapid;
	}

	public void setXmapid(String xmapid) {
		this.xmapid = xmapid;
	}

	public String getFacultyid() {
		return facultyid;
	}

	public void setFacultyid(String facultyid) {
		this.facultyid = facultyid;
	}

	public String getFacultyname() {
		return facultyname;
	}

	public void setFacultyname(String facultyname) {
		this.facultyname = facultyname;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
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

	public boolean isFacultyavailable() {
		return facultyavailable;
	}

	public void setFacultyavailable(boolean facultyavailable) {
		this.facultyavailable = facultyavailable;
	}

	public boolean isXmapavailable() {
		return xmapavailable;
	}

	public void setXmapavailable(boolean xmapavailable) {
		this.xmapavailable = xmapavailable;
	}

	public boolean isSkillavailable() {
		return skillavailable;
	}

	public void setSkillavailable(boolean skillavailable) {
		this.skillavailable = skillavailable;
	}
	
	@Override
	public String toString() {
		String msg;
		msg = xmapid + ", " + xmapavailable + ", " + facultyid + ", " + facultyname + ", " + location + ", " + facultyavailable + ", " 
				+ skillid + ", " + skillname + ", " + skillavailable;
		return msg;
	}
	
}
