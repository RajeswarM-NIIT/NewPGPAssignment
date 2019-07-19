package com.rest.service;

import java.util.List;

import com.test.model.Vw_Xmap_Fac_Skill;
import com.test.model.Xmap_Fac_Skill;

public interface XmapFacSkillServiceInt {
	public abstract boolean addXfs(Xmap_Fac_Skill xfs);
	public List<Xmap_Fac_Skill> getAllXfs();
	public List<Xmap_Fac_Skill> getAllXfsByFacultyId(String facid);
	public List<Xmap_Fac_Skill> getAllXfsBySkillId(String skillid);
	public Xmap_Fac_Skill getXfsById(String xfsid);
	public boolean deleteXfs(String xfsid);
	public boolean updateXfs(Xmap_Fac_Skill xfs);
}
