package com.test.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.test.model.Faculty;

@Repository
public class FacultyDAOImpl implements FacultyDAOInt {

	@Autowired
	private SessionFactory sf;
	
	public boolean addFaculty(Faculty fac) {
		try {
			fac.setFacultyid(generateFacultyId());
			fac.setFacultyavailable(true);
			Session s = sf.openSession();
			s.beginTransaction();
			s.save(fac);
			s.getTransaction().commit();
			s.close();
			return true;
		}
		catch(Exception ex) {
			ex.printStackTrace();
			return false;
		}
	}

	public List<Faculty> getAllFaculties() {		
		List<Faculty> facs = null;
		Session s = sf.openSession();
		Query q = s.createQuery("from Faculty");
		facs = q.list();
		s.close();
		return facs;
	}

	public Faculty getFacultyById(String facid) {
		Session s = sf.openSession();
		Faculty f = null;
		f = s.get(Faculty.class, facid);
		s.close();
		return f;
	}

	public List<Faculty> getFacultyByName(String facname) {
		Faculty f = null;
		Session s = sf.openSession();
		Query q = s.createQuery("from Faculty where facultyname =?");
		q.setString(0, facname);
		List<Faculty> facs = q.list();				
		s.close();
		return facs;
	}
	public boolean deleteFaculty(String facid) {
		Session s = sf.openSession();
		Faculty f = null;
		f = s.get(Faculty.class, facid);
		if(f==null) {
			s.close();
			return false;
		}
		try {			
			s.beginTransaction();
			s.delete(f);
			s.getTransaction().commit();
			s.close();
			return true;
		}
		catch(Exception ex) {
			ex.printStackTrace();
			return false;
		}
	}

	public boolean updateFaculty(Faculty fac) {
		try {		
			Session s = sf.openSession();
			s.beginTransaction();
			s.update(fac);
			s.getTransaction().commit();
			s.close();
			return true;
		}
		catch(Exception ex) {
			ex.printStackTrace();
			return false;
		}
	}
	
	private String generateFacultyId() {
		String newfacid = "";
		Session ses1 = sf.openSession();

		Query q = ses1.createQuery("from Faculty");
		List<Faculty> data = q.list();
		if (data.size() == 0) { // table is empty
			newfacid="FAC00001";
			ses1.close();
		} 
		else { // table is not empty
			Query qr = ses1.createQuery("select max(facultyid) from Faculty");
			List<String> val = qr.list();
			ses1.close();
			String existingid = val.get(0);
			System.out.println(existingid);
			int id = Integer.parseInt(existingid.substring(3));
			System.out.println(id);
			id++;
			if (id < 10) {
				newfacid = "FAC0000" + id;
			} else if (id < 100) {
				newfacid = "FAC000" + id;
			} else if (id < 1000) {
				newfacid = "FAC00" + id;
			}  else if (id < 10000) {
				newfacid = "FAC0" + id;
			} else {
				newfacid = "FAC" + id;
			}
		}		
		return newfacid;
	}
}
