package com.test.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Xmap_Fac_Skill {
	
	@Id
	private String xmapid;
	private String facultyid, skillid;
	private boolean xmapavailable;
	
	public Xmap_Fac_Skill() {
		
	}
	public Xmap_Fac_Skill(String fid, String sid) {
		facultyid=fid;
		skillid=sid;
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

	public String getSkillid() {
		return skillid;
	}

	public void setSkillid(String skillid) {
		this.skillid = skillid;
	}

	public boolean isXmapavailable() {
		return xmapavailable;
	}

	public void setXmapavailable(boolean xmapavailable) {
		this.xmapavailable = xmapavailable;
	}
	
	@Override
	public String toString() {
		String msg;
		msg = xmapid + ", " + facultyid + ", " + skillid + ", " + xmapavailable;
		return msg;
	}
}
/*
create table Xmap_Fac_Skill
(
	xmapid char(10) primary key,
	facultyid char(10) references Faculty(facultyid),
	skillid char(10) references Skill(skillid),
	xmapavailable boolean
)
*/