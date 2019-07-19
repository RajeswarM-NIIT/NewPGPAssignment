package com.test.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Faculty {
	@Id
	private String facultyid;
	private String facultyname;
	private String location;
	private boolean facultyavailable;
	
	public Faculty() {
		// TODO Auto-generated constructor stub
	}
	public Faculty(String fn,String loc) {		
		facultyname=fn;
		location=loc;
		facultyavailable=true;
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

	public boolean isFacultyavailable() {
		return facultyavailable;
	}

	public void setFacultyavailable(boolean facultyavailable) {
		this.facultyavailable = facultyavailable;
	}

	
	
	
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	@Override
	public String toString() {
		String msg = facultyid +", " + facultyname +", " + location + ", " + facultyavailable;
		return msg;
	}
	
	
	
}


/*	facultyid char(10)primary key,
	facultyname char(40),
	facultyavailable boolean
*/
