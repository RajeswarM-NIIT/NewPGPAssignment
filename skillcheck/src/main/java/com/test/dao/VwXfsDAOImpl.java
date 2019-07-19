package com.test.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.test.model.Vw_Xmap_Fac_Skill;

@Repository
public class VwXfsDAOImpl implements VwXfsDAOInt {

	@Autowired
	private SessionFactory sf;
	
	public List<Vw_Xmap_Fac_Skill> getAllVwXfs() {
		List<Vw_Xmap_Fac_Skill> data=null;
		Session s = sf.openSession();
		Query q = s.createQuery("from Vw_Xmap_Fac_Skill");
		data = q.list();
		s.close();		
		return data;
	}

	public List<Vw_Xmap_Fac_Skill> getMappingByFacultyId(String facid) {
		List<Vw_Xmap_Fac_Skill> data=null;
		Session s = sf.openSession();
		Query q = s.createQuery("from Vw_Xmap_Fac_Skill where facultyid=?");
		q.setString(0, facid);
		data = q.list();
		s.close();		
		return data;
	}

	public List<Vw_Xmap_Fac_Skill> getMappingByFacultyName(String facname) {
		List<Vw_Xmap_Fac_Skill> data=null;
		Session s = sf.openSession();
		Query q = s.createQuery("from Vw_Xmap_Fac_Skill where facultyname=?");
		q.setString(0, facname);
		data = q.list();
		s.close();		
		return data;
	}

	public List<Vw_Xmap_Fac_Skill> getMappingByFacultyLocation(String loc) {
		List<Vw_Xmap_Fac_Skill> data=null;
		Session s = sf.openSession();
		Query q = s.createQuery("from Vw_Xmap_Fac_Skill where location=?");
		q.setString(0, loc);
		data = q.list();
		s.close();		
		return data;
	}

	public List<Vw_Xmap_Fac_Skill> getMappingBySkillId(String skillid) {
		List<Vw_Xmap_Fac_Skill> data=null;
		Session s = sf.openSession();
		Query q = s.createQuery("from Vw_Xmap_Fac_Skill where skillid=?");
		q.setString(0, skillid);
		data = q.list();
		s.close();		
		return data;
	}

	public List<Vw_Xmap_Fac_Skill> getMappingBySkillName(String skillname) {
		List<Vw_Xmap_Fac_Skill> data=null;
		Session s = sf.openSession();
		Query q = s.createQuery("from Vw_Xmap_Fac_Skill where skillname=?");
		q.setString(0, skillname);
		data = q.list();
		s.close();		
		return data;
	}

}
