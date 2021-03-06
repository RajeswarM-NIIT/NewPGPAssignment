package com.test.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.test.model.Faculty;
import com.test.model.Skill;

@Repository
public class SkillDAOImpl implements SkillDAOInt {

	@Autowired
	private SessionFactory sf;
	
	public boolean addSkill(Skill skill) {
		try {
			skill.setSkillid(generateSkillId());
			skill.setSkillavailable(true);
			Session s = sf.openSession();
			s.beginTransaction();
			s.save(skill);
			s.getTransaction().commit();
			s.close();
			return true;
		}
		catch(Exception ex) {
			ex.printStackTrace();
			return false;
		}
	}

	public List<Skill> getAllSkills() {
		List<Skill> skills = null;
		Session s = sf.openSession();
		Query q = s.createQuery("from Skill");
		skills = q.list();
		s.close();
		return skills;
	}

	public Skill getSkillById(String skillid) {
		Session s = sf.openSession();
		Skill skill = null;
		skill = s.get(Skill.class, skillid);
		s.close();
		return skill;
	}

	public List<Skill> getSkillByName(String skillname) {
		Skill sk = null;
		Session s = sf.openSession();
		Query q = s.createQuery("from Skill where skillname =?");
		q.setString(0, skillname);
		List<Skill> skills = q.list();				
		s.close();
		return skills;
	}
	public boolean deleteSkill(String skillid) {
		Session s = sf.openSession();
		Skill sk = null;
		sk = s.get(Skill.class, skillid);
		if(sk==null) {
			s.close();
			return false;
		}
		try {			
			s.beginTransaction();
			s.delete(sk);
			s.getTransaction().commit();
			s.close();
			return true;
		}
		catch(Exception ex) {
			ex.printStackTrace();
			return false;
		}
	}

	public boolean updateSkill(Skill skill) {
		try {		
			Session s = sf.openSession();
			s.beginTransaction();
			s.update(skill);
			s.getTransaction().commit();
			s.close();
			return true;
		}
		catch(Exception ex) {
			ex.printStackTrace();
			return false;
		}
	}
	
	private String generateSkillId() {
		String newskillid = "";
		Session ses1 = sf.openSession();

		Query q = ses1.createQuery("from Skill");
		List<Skill> data = q.list();
		if (data.size() == 0) { // table is empty
			newskillid="SKL00001";
			ses1.close();
		} 
		else { // table is not empty
			Query qr = ses1.createQuery("select max(skillid) from Skill");
			List<String> val = qr.list();
			ses1.close();
			String existingid = val.get(0);
			System.out.println(existingid);
			int id = Integer.parseInt(existingid.substring(3));
			System.out.println(id);
			id++;
			if (id < 10) {
				newskillid = "SKL0000" + id;
			} else if (id < 100) {
				newskillid = "SKL000" + id;
			} else if (id < 1000) {
				newskillid = "SKL00" + id;
			}  else if (id < 10000) {
				newskillid = "SKL0" + id;
			} else {
				newskillid = "SKL" + id;
			}
		}		
		return newskillid;
	}

}
