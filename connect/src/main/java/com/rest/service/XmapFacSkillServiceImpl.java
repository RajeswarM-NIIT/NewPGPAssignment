package com.rest.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.test.dao.XmapFacSkillDAOInt;
import com.test.model.Vw_Xmap_Fac_Skill;
import com.test.model.Xmap_Fac_Skill;

@Service
public class XmapFacSkillServiceImpl implements XmapFacSkillServiceInt {

	@Autowired
	private XmapFacSkillDAOInt xmapdao;

	public boolean addXfs(Xmap_Fac_Skill xfs) {
		return xmapdao.addXfs(xfs);
	}

	public List<Xmap_Fac_Skill> getAllXfs() {
		return xmapdao.getAllXfs();
	}
	
	public Xmap_Fac_Skill getXfsById(String xfsid) {
		return xmapdao.getXfsById(xfsid);
	}

	public List<Xmap_Fac_Skill> getAllXfsByFacultyId(String facid) {
		return xmapdao.getAllXfsByFacultyId(facid);
	}

	public List<Xmap_Fac_Skill> getAllXfsBySkillId(String skillid) {
		return xmapdao.getAllXfsBySkillId(skillid);
	}

	public boolean deleteXfs(String xfsid) {
		return xmapdao.deleteXfs(xfsid);
	}

	public boolean updateXfs(Xmap_Fac_Skill xfs) {
		return xmapdao.updateXfs(xfs);
	}
}
