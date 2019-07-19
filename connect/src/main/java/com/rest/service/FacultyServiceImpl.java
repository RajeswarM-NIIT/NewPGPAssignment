package com.rest.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.test.dao.FacultyDAOInt;
import com.test.model.Faculty;

@Service
public class FacultyServiceImpl implements FacultyServiceInt {

	@Autowired
	private FacultyDAOInt facdao;
	
	public boolean addFaculty(Faculty fac) {		
		return facdao.addFaculty(fac);
	}

	public List<Faculty> getAllFaculties() {		
		return facdao.getAllFaculties();
	}

	public Faculty getFacultyById(String facid) {		
		return facdao.getFacultyById(facid);
	}

	public List<Faculty> getFacultyByName(String facname) {		
		return facdao.getFacultyByName(facname);
	}
	
	public boolean deleteFaculty(String facid) {		
		return facdao.deleteFaculty(facid);
	}

	public boolean updateFaculty(Faculty fac) {		
		return facdao.updateFaculty(fac);
	}

}
