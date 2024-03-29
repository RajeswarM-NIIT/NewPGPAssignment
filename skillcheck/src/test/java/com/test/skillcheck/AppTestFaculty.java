package com.test.skillcheck;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;

import com.test.configuration.DBConfig;
import com.test.dao.FacultyDAOInt;
import com.test.model.Faculty;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@SpringJUnitConfig(DBConfig.class)
@RunWith(SpringJUnit4ClassRunner.class)
public class AppTestFaculty {

	@Autowired
	private FacultyDAOInt facultyDAOInt;

	private Faculty facutly;

	@Before
	public void setup() {
		facutly = new Faculty("Ramu","Begumpet");		
	}

	@Test
	public void addFaculty() {
		assertTrue(facultyDAOInt.addFaculty(facutly));
		facultyDAOInt.deleteFaculty(facutly.getFacultyid());
	}	

	@Test
	public void addFacultyFalse() {
		Faculty temp = new Faculty("Ramufksjflsdjkflsdjfkldsjfkldsfjklsdfjklsdfjksldfjklsfjklsdfjslkfjsklfjslkfjksldfjklsdfjskldfdsjf","Begumpet");	
		assertFalse(facultyDAOInt.addFaculty(temp));
		facultyDAOInt.deleteFaculty(temp.getFacultyid());
	}
	
	@Test
	public void getFacultyById() {
		facultyDAOInt.addFaculty(facutly);
		assertNotNull(facultyDAOInt.getFacultyById("FAC00001"));
		facultyDAOInt.deleteFaculty(facutly.getFacultyid());
	}	
	
	@Test
	public void getAllFaculties() {
		assertNotNull(facultyDAOInt.getAllFaculties());		
	}
	
}
