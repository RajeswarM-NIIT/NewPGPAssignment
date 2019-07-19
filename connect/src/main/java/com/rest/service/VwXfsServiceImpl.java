package com.rest.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.test.dao.VwXfsDAOInt;
import com.test.model.Vw_Xmap_Fac_Skill;

@Service
public class VwXfsServiceImpl implements VwXfsServiceInt {

	@Autowired
	private VwXfsDAOInt vwxfsdao;
	
	public List<Vw_Xmap_Fac_Skill> getAllVwXfs() {
		return vwxfsdao.getAllVwXfs();
	}

	public List<Vw_Xmap_Fac_Skill> getMappingByFacultyId(String facid) {
		return vwxfsdao.getMappingByFacultyId(facid);
	}

	public List<Vw_Xmap_Fac_Skill> getMappingByFacultyName(String facname) {
		return vwxfsdao.getMappingByFacultyName(facname);
	}

	public List<Vw_Xmap_Fac_Skill> getMappingByFacultyLocation(String loc) {
		return vwxfsdao.getMappingByFacultyLocation(loc);
	}

	public List<Vw_Xmap_Fac_Skill> getMappingBySkillId(String skillid) {
		return vwxfsdao.getMappingBySkillId(skillid);
	}

	public List<Vw_Xmap_Fac_Skill> getMappingBySkillName(String skillname) {
		return vwxfsdao.getMappingBySkillName(skillname);
	}

}
