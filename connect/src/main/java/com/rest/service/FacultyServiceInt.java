package com.rest.service;

import java.util.List;

import com.test.model.Faculty;

public interface FacultyServiceInt {
	public boolean addFaculty(Faculty fac);
	public List<Faculty> getAllFaculties();
	public Faculty getFacultyById(String facid);
	public List<Faculty> getFacultyByName(String facname);
	public boolean deleteFaculty(String facid);
	public boolean updateFaculty(Faculty fac);
	
}
