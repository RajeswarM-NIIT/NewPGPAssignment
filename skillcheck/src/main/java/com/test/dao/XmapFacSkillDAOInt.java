package com.test.dao;

import java.util.List;


import com.test.model.Xmap_Fac_Skill;

public interface XmapFacSkillDAOInt {
	public abstract boolean addXfs(Xmap_Fac_Skill xfs);
	public List<Xmap_Fac_Skill> getAllXfs();
	public Xmap_Fac_Skill getXfsById(String xfsid);
	public boolean deleteXfs(String xfsid);
	public boolean updateXfs(Xmap_Fac_Skill xfs);
	public List<Xmap_Fac_Skill> getAllXfsByFacultyId(String facid);
	public List<Xmap_Fac_Skill> getAllXfsBySkillId(String skillid);
}
